package com.example.cardencalendar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.awt.*;

import java.util.ArrayList;
import java.util.List;

import static com.example.cardencalendar.ButtonForTab.getSelectedIndexTab;


public class PlantTableView extends TableView {
    TableView table;
    private static List<TableView<Plant>> tableList = new ArrayList<>();

    public PlantTableView() {

        this.table = new TableView<>();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int vert = dim.height;
        int hor  = dim.width;
      table.setPrefWidth(hor);
       table.setPrefHeight(vert-130);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        table.setItems(getPlantList());

        table.getColumns().addAll(getNumberRidgeColumn(),
                getNameColumn(),
                getWateringColumn(),
                getMineralizationColumn(),
                getDeoxidationColumn(),
                getMulchingColumn(),
                getSedationColumn(),
                getHarvestinColumn());
        table.setTableMenuButtonVisible(true);

        table.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent click) {
                if (click.getClickCount() == 2) {
                    @SuppressWarnings("rawtypes")
                    TablePosition pos = (TablePosition) table.getSelectionModel().getSelectedCells().get(0);
                    int row = pos.getRow();
                    int col = pos.getColumn();

                    @SuppressWarnings("rawtypes")
                    TableColumn column = pos.getTableColumn();
                    String val = column.getCellData(row).toString();
                    //   System.out.println("Selected Value, " + val + ", Column: " + col + ", Row: " + row);
                    if ( col == 1 ) {

                        TreeView<String> treeView = PlantDetails.getTreeView();

                        HBox root = new HBox(treeView);
                        root.setStyle("-fx-padding: 10;" +
                                "-fx-border-style: solid inside;" +
                                "-fx-border-width: 2;" +
                                "-fx-border-insets: 5;" +
                                "-fx-border-radius: 5;" +
                                "-fx-border-color: blue;");
                        Stage stage = new Stage();
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.setTitle("Детализация");
                        stage.getIcons().add(new Image("C:\\Users\\aagureeva\\IdeaProjects\\GardenCalendar\\src\\main\\image\\клевер.png"));
                        stage.show();


                }}
            }
        });

    }

    public TableView<Plant> getTable() {
        return table;
    }

    public static List<TableView<Plant>> getTableList() {
        return tableList;
    }

    public static ObservableList<Plant> getPlantList() {
        Plant p1_1 = new Plant("1.1", "Чеснок");
        Plant p1_2 = new Plant("1.2", "Помидоры");
        Plant p1_3 = new Plant("1.3", "Руккола");
        Plant p1_4 = new Plant("1.4", "Клубника Фестивальная");
        Plant p1_5 = new Plant("1.5", "Пусто");
        Plant p1_6 = new Plant("1.6", "Сельдерей");
        Plant p1_7 = new Plant("1.7", "Петрушка 2-ой год");
        Plant p1_8 = new Plant("1.8", "Клубника Ханей");
        Plant p1_9 = new Plant("1.9", "Пусто");
        Plant p1_10 = new Plant("1.10", "Зелень");
        Plant p1_11 = new Plant("1.11", "Лук/Чеснок");
        Plant p1_12 = new Plant("1.12", "Чеснок");
        Plant p1_13 = new Plant("1.13", "Огурцы");
        Plant p1_14 = new Plant("1.14", "Капуста");
        Plant p1_15 = new Plant("1.15", "Лук");
        Plant p1_16 = new Plant("1.16", "Лук");
        Plant p1_17 = new Plant("1.17", "Вигна/Фасоль");
        Plant p1_18 = new Plant("1.18", "Пусто");

        Plant p2_1 = new Plant("2.1", "Жимолость \"Голубое веретено\"");
        Plant p2_2 = new Plant("2.2", "Жимолость канадской селекции");
        Plant p2_3 = new Plant("2.3", "Смородина черная");
        Plant p2_4 = new Plant("2.4", "Смородина черная \"Ядреная\"");
        Plant p2_5 = new Plant("2.5", "Жимолость \"Ленинградский великан\"");
        Plant p2_6 = new Plant("2.6", "Жимолость \"Ленинградский великан\"");
        Plant p2_7 = new Plant("2.7", "Жимолость \"Синяя птица\"");
        Plant p2_8 = new Plant("2.8", "Пусто");
        Plant p2_9 = new Plant("2.9", "Пусто");
        Plant p2_10 = new Plant("2.10", "Жимолость \"Старт\"");
        Plant p2_11 = new Plant("2.11", "Жимолость \"Рената\"");
        Plant p2_12 = new Plant("2.12", "Смородина черная \"Черный жемчуг\"");
        Plant p2_13 = new Plant("2.13", "Смородина черная \"Черный жемчуг\"");
        Plant p2_14 = new Plant("2.14", "Смородина черная \"Среченская\"");
        Plant p2_15 = new Plant("2.15", "Смородина черная \"Среченская\"");
        Plant p2_16 = new Plant("2.16", "Малина \"Брянское диво\"");
        Plant p2_17 = new Plant("2.17", "Смородина красная \"Мармеладка\"");
        Plant p2_18 = new Plant("2.18", "Крыжовник");
        Plant p2_19 = new Plant("2.19", "Малина \"Пингвин\"");
        Plant p2_20 = new Plant("2.20", "Малина \"Пингвин\"");
        Plant p2_21 = new Plant("2.21", "Малина \"Брянское диво\"");
        Plant p2_22 = new Plant("2.22", "Малина \"Брянское диво\"");
        Plant p2_23 = new Plant("2.23", "Малина \"Пингвин\"");
        Plant p2_24 = new Plant("2.214", "Малина \"Пингвин\"");
        Plant p2_25 = new Plant("2.25", "Жимолость \"Марена\"");

        Plant p3_1 = new Plant("3.1", "Алыча \"Кубанская комета\"");
        Plant p3_2 = new Plant("3.2", "Китайская слива \"Скороплодная\"");
        Plant p3_3 = new Plant("3.3", "Калина");

        Plant p4_1 = new Plant("4.1", "Кабачки");
        Plant p4_2 = new Plant("4.2", "Кабачки");
        Plant p4_3 = new Plant("4.3", "Кабачки");
        Plant p4_4 = new Plant("4.4", "Помидоры \"Монгол-карлик\"");
        Plant p4_5 = new Plant("4.5", "Помидоры \"Монгол-карлик\"");
        Plant p4_6 = new Plant("4.6", "Помидоры желтые");
        return FXCollections.<Plant>observableArrayList(p1_1 ,p1_2 ,p1_3 ,p1_4 ,p1_5 ,p1_6 ,
                p1_7 ,p1_8 ,p1_9 , p1_10, p1_11, p1_12, p1_13, p1_14, p1_15, p1_16, p1_17, p1_18,
                p2_1, p2_2, p2_3, p2_4, p2_5 , p2_6, p2_7, p2_8, p2_9, p2_10, p2_11, p2_12, p2_13 ,
                p2_14, p2_15, p2_16, p2_17, p2_18, p2_19, p2_20, p2_21, p2_22, p2_23, p2_24, p2_25,
                p3_1,p3_2,p3_3,p4_1,p4_2,p4_3,p4_4,p4_5,p4_6);
    }

    public static TableColumn<Plant, String> getNumberRidgeColumn() {

        TableColumn<Plant, String> numberRidgeColumn = new TableColumn<>("№ грядки");
        numberRidgeColumn.setCellValueFactory(cellData -> cellData.getValue().numberRidgeProperty());
        return numberRidgeColumn;
    }
    public static TableColumn<Plant, String> getNameColumn() {
        TableColumn<Plant, String> nameColumn = new TableColumn<>("Культура");
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        return nameColumn;
    }
    public static TableColumn<Plant, String> getWateringColumn() {
        TableColumn<Plant, String> wateringColumn = new TableColumn<>("Полив");
        wateringColumn.setCellValueFactory(cellData -> cellData.getValue().wateringLastElementProperty());
          return wateringColumn;
    }
    public static TableColumn<Plant, String> getMineralizationColumn() {
        TableColumn<Plant, String> mineralizationColumn = new TableColumn<>("Минерализация");
        mineralizationColumn.setCellValueFactory(cellData -> cellData.getValue().mineralizationLastElementProperty());

        return mineralizationColumn;
    }
    public static TableColumn<Plant, String> getDeoxidationColumn() {
        TableColumn<Plant, String> deoxidationColumn = new TableColumn<>("Раскисление");
        deoxidationColumn.setCellValueFactory(cellData -> cellData.getValue().deoxidationLastElementProperty());
        return deoxidationColumn;
    }
    public static TableColumn<Plant, String> getMulchingColumn() {
        TableColumn<Plant, String> mulchingColumn = new TableColumn<>("Мульчирование");
        mulchingColumn.setCellValueFactory(cellData -> cellData.getValue().mulchingLastElementProperty());

        return mulchingColumn;
    }
    public static TableColumn<Plant, String> getSedationColumn() {
        TableColumn<Plant, String> sedationColumn = new TableColumn<>("Сидерация");
        sedationColumn.setCellValueFactory(cellData -> cellData.getValue().sedationLastElementProperty());
        return sedationColumn;
    }
    public static TableColumn<Plant, String> getHarvestinColumn() {
        TableColumn<Plant, String> harvestinColumn = new TableColumn<>("Урожай");
        harvestinColumn.setCellValueFactory(cellData -> cellData.getValue().harvestingSumProperty());
        return harvestinColumn;
    }

}
