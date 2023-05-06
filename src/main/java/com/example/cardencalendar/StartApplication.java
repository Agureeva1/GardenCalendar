package com.example.cardencalendar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StartApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

     BorderPane borderPane = new  BorderPane();

        List<Plant> allPlant2023 = new ArrayList<>();
        List<Plant> allPlant2024 = new ArrayList<>();
        List<Plant> allPlant2025 = new ArrayList<>();

        allPlant2023.add(new Plant(1.1,"Огурцы"));
        allPlant2023.add(new Plant(1.2,"Помидоры"));

        {  List<SomeWork> water0= new ArrayList<>();
            water0.add(new SomeWork(10));
            water0.add(new SomeWork(15));

        allPlant2023.get(0).setWateringList(water0);
        allPlant2023.get(0).setWatering();

        List<SomeWork> mineral0= new ArrayList<>();
            mineral0.add(new SomeWork(2,"фосфор"));
            mineral0.add(new SomeWork(1,"калий"));
            mineral0.add(new SomeWork(10,"азот"));
            allPlant2023.get(0).setMineralizationList(mineral0);
            allPlant2023.get(0).setMineralization();

            List<SomeWork> mulching0= new ArrayList<>();
            mulching0.add(new SomeWork(2));
            mulching0.add(new SomeWork(13));
            allPlant2023.get(0).setMulchingList(mulching0);
            allPlant2023.get(0).setMulching();

            List<SomeWork> deoxidation0= new ArrayList<>();
            deoxidation0.add(new SomeWork(7,"щелоч"));
            deoxidation0.add(new SomeWork(10,"мел"));
            allPlant2023.get(0).setDeoxidationList(deoxidation0);
            allPlant2023.get(0).setDeoxidation();

            List<SomeWork> sedation0= new ArrayList<>();
            sedation0.add(new SomeWork("люпин"));
            sedation0.add(new SomeWork(10,"горчица"));
            allPlant2023.get(0).setSedationList(sedation0);
            allPlant2023.get(0).setSedation();

            allPlant2023.get(0).setHarvesting(12.5);

        }


        allPlant2024.add(new Plant(1.1,"Салат"));
        allPlant2024.add(new Plant(1.2,"Лук"));
        allPlant2024.add(new Plant(2.3,"Чеснок"));
        allPlant2024.add(new Plant(2.2,"Картошка"));



       allPlant2024.add(new Plant(1.1,"Салат"));
       allPlant2024.add(new Plant(1.2,"Лук"));
       allPlant2024.add(new Plant(2.3,"Чеснок"));
       allPlant2024.add(new Plant(2.2,"Картошка"));allPlant2024.add(new Plant(1.1,"Салат"));
       allPlant2024.add(new Plant(1.2,"Лук"));
       allPlant2024.add(new Plant(2.3,"Чеснок"));
       allPlant2024.add(new Plant(2.2,"Картошка"));allPlant2024.add(new Plant(1.1,"Салат"));
       allPlant2024.add(new Plant(1.2,"Лук"));
       allPlant2024.add(new Plant(2.3,"Чеснок"));
       allPlant2024.add(new Plant(2.2,"Картошка"));allPlant2024.add(new Plant(1.1,"Салат"));
       allPlant2024.add(new Plant(1.2,"Лук"));
       allPlant2024.add(new Plant(2.3,"Чеснок"));
       allPlant2024.add(new Plant(2.2,"Картошка"));allPlant2024.add(new Plant(1.1,"Салат"));
       allPlant2024.add(new Plant(1.2,"Лук"));
       allPlant2024.add(new Plant(2.3,"Чеснок"));
       allPlant2024.add(new Plant(2.2,"Картошка"));allPlant2024.add(new Plant(1.1,"Салат"));
       allPlant2024.add(new Plant(1.2,"Лук"));
       allPlant2024.add(new Plant(2.3,"Чеснок"));
       allPlant2024.add(new Plant(2.2,"Картошка"));allPlant2024.add(new Plant(1.1,"Салат"));
       allPlant2024.add(new Plant(1.2,"Лук"));
       allPlant2024.add(new Plant(2.3,"Чеснок"));
       allPlant2024.add(new Plant(2.2,"Картошка"));allPlant2024.add(new Plant(1.1,"Салат"));
       allPlant2024.add(new Plant(1.2,"Лук"));
       allPlant2024.add(new Plant(2.3,"Чеснок"));
       allPlant2024.add(new Plant(2.2,"Картошка"));
        allPlant2025.add(new Plant(1.1,"Клубника"));


       // TableViewPlant table2023 = new TableViewPlant(allPlant2023);
//        TableViewPlant  table2024 = new TableViewPlant(allPlant2024);
//        TableViewPlant table2025 = new TableViewPlant(allPlant2025);


        FlowPane root3 = new FlowPane(10, 10, new TableViewPlant(allPlant2023).getTable());
        FlowPane root4 = new FlowPane(10, 10, new TableViewPlant(allPlant2024).getTable());
        FlowPane root5 = new FlowPane(10, 10, new TableViewPlant(allPlant2025).getTable());



        TabPane tabpane = new TabPane();
        TabYear tabYear2023 = new TabYear(root3,"2023");
        TabYear tabYear2024 = new TabYear(root4,"2024");
        TabYear tabYear2025 = new TabYear(root5,"2025");
        TabPlan tabPlan = new TabPlan();


        tabpane.getTabs().add(tabPlan.getTabPlanRidge());
        tabpane.getTabs().add(tabYear2023.getTabYear());
        tabpane.getTabs().add(tabYear2024.getTabYear());
        tabpane.getTabs().add(tabYear2025.getTabYear());

        ButtonsPaneBox buttonsPane  = new ButtonsPaneBox();
        borderPane.setTop(tabpane);
        borderPane.setBottom(buttonsPane.getButtonsPane());


        Scene scene = new Scene(borderPane);
        stage.setMaximized(true);
        stage.setTitle("Календарь огородника");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}