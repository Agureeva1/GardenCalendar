package com.example.cardencalendar;

import javafx.scene.control.Tab;
import javafx.scene.layout.FlowPane;


public class TabYear extends Tab {
    Tab tabYear;



    public TabYear(FlowPane y2023,String title) {

        this.tabYear = new Tab(title);

        tabYear.setContent(y2023);

        tabYear.setClosable(false);

    }

    public Tab getTabYear() { return tabYear;}
}
