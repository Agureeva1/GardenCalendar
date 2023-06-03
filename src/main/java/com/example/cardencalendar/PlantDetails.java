package com.example.cardencalendar;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import static com.example.cardencalendar.ButtonForTab.getSelectedIndexTab;
import static com.example.cardencalendar.PlantTableView.getTableList;
import static com.example.cardencalendar.TextFieldGridPane.getIndexSelectRow;
import static com.example.cardencalendar.TextFieldGridPane.getSelectPlant;

public class PlantDetails {

    public static TreeView<String> getTreeView() {
        TreeItem<String> workList = new TreeItem<>("(" + getSelectPlant().getNumberRidge() + ") " + getSelectPlant().getName());

        TreeItem<String> wtrng = new TreeItem<String>("Полив");
        TreeItem<String> mnrlstn = new TreeItem<String>("Минерализация");
        TreeItem<String> dxdtn = new TreeItem<String>("Раскисление");

        TreeItem<String> mlchng = new TreeItem<String>("Мульчирование");
        TreeItem<String> sdrtn = new TreeItem<String>("Сидерация");
        TreeItem<String> harvstng = new TreeItem<String>("Урожай");
        workList.getChildren().addAll(wtrng, mnrlstn, dxdtn,mlchng,sdrtn,harvstng);

        if (getSelectPlant().getWateringList().size() >= 1) {
        for (int i = 0; i< getSelectPlant().getWateringList().size(); i++) {
            wtrng.getChildren().add(new TreeItem<String>(getSelectPlant().getWateringListString(i)));
        } } else {
            wtrng.getChildren().add(new TreeItem<String>("не поливали"));
        }

        if (getSelectPlant().getMineralizationList().size() >= 1) {
            for (int i = 0; i< getSelectPlant().getMineralizationList().size(); i++) {
                mnrlstn.getChildren().add(new TreeItem<String>(getSelectPlant().getMineralizationListString(i)));
            } } else {
            mnrlstn.getChildren().add(new TreeItem<String>("не проводилась"));
        }

        if (getSelectPlant().getDeoxidationList().size() >= 1) {
            for (int i = 0; i< getSelectPlant().getDeoxidationList().size(); i++) {
                dxdtn.getChildren().add(new TreeItem<String>(getSelectPlant().getDeoxidationListString(i)));
            } } else {
            dxdtn.getChildren().add(new TreeItem<String>("не проводилось"));
        }

        if (getSelectPlant().getMulchingList().size() >= 1) {
            for (int i = 0; i< getSelectPlant().getMulchingList().size(); i++) {
                mlchng.getChildren().add(new TreeItem<String>(getSelectPlant().getMulchingListString(i)));
            } } else {
            mlchng.getChildren().add(new TreeItem<String>("не проводилось"));
        }

        if (getSelectPlant().getSedationList().size() >= 1) {
            for (int i = 0; i< getSelectPlant().getSedationList().size(); i++) {
                sdrtn.getChildren().add(new TreeItem<String>(getSelectPlant().getSedationListString(i)));
            } } else {
            sdrtn.getChildren().add(new TreeItem<String>("не высаживали"));
        }

        if (getSelectPlant().getHarvestingList().size() >= 1) {
            for (int i = 0; i< getSelectPlant().getHarvestingList().size(); i++) {
                harvstng.getChildren().add(new TreeItem<String>(getSelectPlant().getHarvestingListString(i)));
            } } else {
            harvstng.getChildren().add(new TreeItem<String>("не высаживали"));
        }


        TreeView<String> treeView = new TreeView<>(workList);

        return treeView;
    }
}
