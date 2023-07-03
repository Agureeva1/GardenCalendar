package com.example.cardencalendar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Tooltip;

import static com.example.cardencalendar.ButtonForTab.getSelectedIndexTab;
import static com.example.cardencalendar.PlantTableView.getSelectColumn;
import static com.example.cardencalendar.PlantTableView.getTableList;


public class PieChartPlant {
    private PieChart chart;

    public PieChartPlant() {

        chart = new PieChart();
        chart.setTitle("Объем полива за " + MyTabPane.getTabpane().getSelectionModel().getSelectedItem().getText() + " г.");

        // Place the legend on the left side
        chart.setLegendSide(Side.LEFT);

        // Set the data for the chart
        ObservableList<PieChart.Data> chartData = getChartData();
        chart.setData(chartData);
        this.addSliceTooltip(chart);
    }

    public static ObservableList<PieChart.Data> getChartData() {
        ObservableList<PieChart.Data> data = FXCollections.observableArrayList();

        for (int i = 0; i < getTableList().get(getSelectedIndexTab()).getItems().size(); i++) {
            if (getTableList().get(getSelectedIndexTab()).getItems().get(i).isSelected()) {
                int wateringValue = 0;
                for (int j = 0; j < getTableList().get(getSelectedIndexTab()).getItems().get(i).getWateringList().size(); j++) {
                    wateringValue += getTableList().get(getSelectedIndexTab()).getItems().get(i).getWateringList().get(j).getVolume();
                }
                String plant = "(" + getTableList().get(getSelectedIndexTab()).getItems().get(i).getNumberRidge() + ") " + getTableList().get(getSelectedIndexTab()).getItems().get(i).getName();
                data.add(new PieChart.Data(plant, wateringValue));

                getTableList().get(getSelectedIndexTab()).getItems().get(i).setSelected(false);
                getTableList().get(getSelectedIndexTab()).getColumns().remove(0);
                getTableList().get(getSelectedIndexTab()).getColumns().add(0, getSelectColumn());

            }
        }
        return data;
    }

    public PieChart getChart() {
        return chart;
    }

    private void addSliceTooltip(PieChart chart) {
        double totalPieValue = 0.0;
        for (PieChart.Data d : chart.getData()) {
            totalPieValue += d.getPieValue();
        }

        for (PieChart.Data d : chart.getData()) {
            Node sliceNode = d.getNode();
            double pieValue = d.getPieValue();
            double percentPieValue = (pieValue / totalPieValue) * 100;


            String msg = d.getName() + "=" + pieValue + " л." +
                    " (" + String.format("%.2f", percentPieValue) + "%)";
            Tooltip tt = new Tooltip(msg);
            tt.setStyle("-fx-background-color: yellow;" +
                    "-fx-text-fill: black;" + "-fx-font-size: 15;");
            Tooltip.install(sliceNode, tt);
        }
    }
}
