package com.example.cardencalendar;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;;

import static com.example.cardencalendar.PlantTableView.getTableList;
import static com.example.cardencalendar.MyTabPane.getTabpane;


public class StartApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException {

        TextFieldGridPane newPlantDataPane = new TextFieldGridPane();
        GridPane newDataPane  = newPlantDataPane.getNewPlantDataPane();
     //  newDataPane.setGridLinesVisible(true);

        Button addTabBtn = new Button("Добавить вкладку");
        addTabBtn.setOnAction(e -> ButtonForTab.addTab());

        Button deleteTabBtn = new Button("Удалить вкладку");
        deleteTabBtn.setOnAction(e -> ButtonForTab.deleteSelectedTab());

        Button changeTabBtn = new Button("Изменить вкладку");
        changeTabBtn.setOnAction(e -> ButtonForTab.changeSelectedTab());
//        GridPane gpPlan = new GridPane(){
//
//        };
        Button planArea = new Button("Посмотреть план");
        planArea.setOnAction(e -> {

            PlanOfArea canvas = new PlanOfArea();
LabelWithTip pl = new LabelWithTip();
            Stage stagePlan = new Stage();
            Pane rootPlan= new Pane();
            rootPlan.setStyle("-fx-padding: 10;" +
                    "-fx-border-style: solid inside;" +
                    "-fx-border-width: 2;" +
                    "-fx-border-insets: 5;" +
                    "-fx-border-radius: 5;" +
                    "-fx-border-color: blue;");

         //   rootPlan.getChildren().addAll(canvas.getCanvas(),gpPlan);
            rootPlan.getChildren().addAll(canvas.getCanvas(),pl.getGp());
            Scene sceneCanvas = new Scene(rootPlan);
            stagePlan.setScene(sceneCanvas);
            stagePlan.setTitle("Календарь огородника. План");
            stagePlan.getIcons().add(new Image("C:\\Users\\aagureeva\\IdeaProjects\\GardenCalendar\\src\\main\\image\\клевер.png"));
            stagePlan.show();

        });

        Button pieChartWatering = new Button("Диаграмма полива");
        pieChartWatering.setOnAction(e -> {
            Stage stageChart = new Stage();
            PieChartPlant chart= new PieChartPlant ();

            StackPane root = new StackPane(chart.getChart());
            root.setStyle("-fx-padding: 10;" +
                    "-fx-border-style: solid inside;" +
                    "-fx-border-width: 2;" +
                    "-fx-border-insets: 5;" +
                    "-fx-border-radius: 5;" +
                    "-fx-border-color: blue;");
            Scene scene = new Scene(root);

            stageChart.setScene(scene);
            stageChart.setTitle("Календарь огородника. Диаграмма");


            stageChart.getIcons().add(new Image("C:\\Users\\aagureeva\\IdeaProjects\\GardenCalendar\\src\\main\\image\\клевер.png"));
            stageChart.show();
        });

        VBox root = new VBox(newDataPane, new HBox(addTabBtn, deleteTabBtn, changeTabBtn, planArea, pieChartWatering), getTabpane());
        root.setSpacing(5);
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");

        PlantTableView table1 = new PlantTableView();
        PlantTableView table2= new PlantTableView();
        PlantTableView table3 = new PlantTableView();


            getTableList().add(table1.getTable());
        getTableList().add(table2.getTable());
        getTableList().add(table3.getTable());

        Tab tab1 = new Tab ("2023");
        tab1.setClosable(false);
        tab1.setContent(table1.getTable());

        Tab tab2 = new Tab ("2024");
        tab2.setClosable(false);
        tab2.setContent(table2.getTable());

        Tab tab3 = new Tab ("2025");
        tab3.setClosable(false);
        tab3.setContent(table3.getTable());

        getTabpane().getTabs().addAll(tab1,tab2,tab3);

        Scene scene = new Scene(root);
        stage.setMaximized(true);
        stage.setTitle("Календарь огородника");
        stage.getIcons().add(new Image("C:\\Users\\aagureeva\\IdeaProjects\\GardenCalendar\\src\\main\\image\\клевер.png"));

        stage.setScene(scene);
        stage.show();
        stage.setOnHidden(e -> Platform.exit());

    }

    public static void main(String[] args) {
        launch();
    }

}
