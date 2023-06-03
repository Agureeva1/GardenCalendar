package com.example.cardencalendar;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Tab;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import static com.example.cardencalendar.ButtonForTab.getSelectedIndexTab;
import static com.example.cardencalendar.MyTabPane.getTabpane;
import static com.example.cardencalendar.PlantTableView.getTableList;

public class PieChartPlant{
    private PieChart chart;
    public PieChartPlant() {

       chart = new PieChart();
        chart.setTitle("Объем полива за " + MyTabPane.getTabpane().getSelectionModel().getSelectedItem().getText() + " г.");

        // Place the legend on the left side
        chart.setLegendSide(Side.LEFT);

        // Set the data for the chart
        ObservableList<PieChart.Data> chartData = getChartData();
        chart.setData(chartData);

    }

    public static ObservableList<PieChart.Data> getChartData() {
        ObservableList<PieChart.Data> data = FXCollections.observableArrayList();

     for(int i =0;i<getTableList().get(getSelectedIndexTab()).getItems().size();i++) {
         int wateringValue = 0;
         for(int j =0;j<getTableList().get(getSelectedIndexTab()).getItems().get(i).getWateringList().size();j++) {
         wateringValue=+getTableList().get(getSelectedIndexTab()).getItems().get(i).getWateringList().get(j).getVolume();
     } String plant = "(" + getTableList().get(getSelectedIndexTab()).getItems().get(i).getNumberRidge()+ ") " + getTableList().get(getSelectedIndexTab()).getItems().get(i).getName();
         data.add(new PieChart.Data(plant, wateringValue));
     }
       return data;
    }

    public PieChart getChart() {
        return chart;
    }
}
