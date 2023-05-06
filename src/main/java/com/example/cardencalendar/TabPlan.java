package com.example.cardencalendar;

import javafx.scene.control.Tab;

public class TabPlan extends Tab {
    Tab tabPlanRidge;
    public  TabPlan (){
        this.tabPlanRidge = new Tab("План грядок");

        //  tabPlanRidge.setContent(gridPane2023.getGridPane());

        tabPlanRidge.setClosable(false);

    }

    public Tab getTabPlanRidge() {
        return tabPlanRidge;
    }
}
