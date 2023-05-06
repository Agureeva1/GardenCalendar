package com.example.cardencalendar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.awt.*;
import java.util.List;


public class TableViewPlant extends TableView {
    TableView<Plant> table;
    ObservableList<Plant> allObsPlant;


    public TableViewPlant (List<Plant> arr) {
       this.allObsPlant = FXCollections.observableArrayList(arr);
        this.table = new TableView<>(allObsPlant);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int vert = dim.height;
        int hor  = dim.width;
      table.setPrefWidth(hor);
       table.setPrefHeight(vert-130);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        TableColumn<Plant, Double> numberRidgeColumn = new TableColumn<>("№ грядки");
        TableColumn<Plant, String> nameColumn = new TableColumn<>("Культура");
        TableColumn<Plant, String> wateringColumn = new TableColumn<Plant, String>("Полив");
        TableColumn<Plant, String> mineralizationColumn = new TableColumn<Plant, String>("Минерализация (удобрение)");
        TableColumn<Plant, String> mulchingColumn = new TableColumn<Plant, String>("Мульчирование");
        TableColumn<Plant, String> deoxidationColumn = new TableColumn<Plant, String>("Раскисление");
        TableColumn<Plant, String> sedationColumn = new TableColumn<Plant, String>("Седерация");
        TableColumn<Plant, Double> harvestinColumn = new TableColumn<Plant, Double>("Урожай (кг)");

        numberRidgeColumn.setCellValueFactory(new PropertyValueFactory<>("numberRidge"));
      nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
      //  wateringColumn.setCellValueFactory(new PropertyValueFactory<>("watering"));
        wateringColumn.setCellValueFactory(watering -> watering.getValue().getWateringProperty());
        mineralizationColumn.setCellValueFactory(new PropertyValueFactory<>("mineralization"));


        mulchingColumn.setCellValueFactory(new PropertyValueFactory<>("mulching"));
        deoxidationColumn.setCellValueFactory(new PropertyValueFactory<>("deoxidation"));
        sedationColumn.setCellValueFactory(new PropertyValueFactory<>("sedation"));
        harvestinColumn.setCellValueFactory(new PropertyValueFactory<>("harvesting"));

//        nameColumn.setCellValueFactory (new Callback<TableColumn.CellDataFeatures<Plant, String>, ObservableValue<String>>() {
//            public ObservableValue<String> call(TableColumn.CellDataFeatures<Plant, String> arr) {
//                return new ReadOnlyObjectWrapper(arr.getValue().getName());
//            }
//        });

        table.getColumns().add(numberRidgeColumn);
        table.getColumns().add(nameColumn);
      table.getColumns().add(wateringColumn);
        table.getColumns().add(mineralizationColumn);
        table.getColumns().add(mulchingColumn);
        table.getColumns().add(deoxidationColumn);
        table.getColumns().add(sedationColumn);
        table.getColumns().add(harvestinColumn);

    }

    public TableView<Plant> getTable() {
        return table;
    }


    public ObservableList<Plant> getAllObsPlant() {
        return allObsPlant;
    }
}
