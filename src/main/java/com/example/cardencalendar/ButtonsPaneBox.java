package com.example.cardencalendar;


import javafx.beans.property.DoubleProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ButtonsPaneBox extends HBox {
    HBox buttonsPane;
    Button addPlan;
    Button changePlan;
    Button delPlan;
    Button savePlan;
    Button addWatering;
    Button addMineralization;
    Button addMulching;
    Button addDeoxidation;
    Button addSedation;
    Button addHarvesting;

    public ButtonsPaneBox(){

        this.addPlan = new Button("Добавить строку");
        this.changePlan = new Button("Изменить строку");
        this.delPlan = new Button("Удалить строку");
        this.savePlan = new Button("Сохранить изменения");
        this.addWatering= new Button("доб. полив");
        this.addMineralization= new Button("доб. минерализация");
        this.addMulching= new Button("доб. мульчирование");
        this.addDeoxidation= new Button("доб. раскисление");
        this.addSedation= new Button("доб. седерация");
        this.addHarvesting= new Button("доб. урожай");

        this.buttonsPane  = new HBox(20,addPlan,changePlan, delPlan,savePlan,addWatering,addMineralization,addMulching,addDeoxidation,addSedation,addHarvesting );
        buttonsPane.setPadding(new Insets(7,10,20,20));

        addPlan.setOnAction(actionEvent ->  {
            //... do something in here.
        });
    }


    public HBox getButtonsPane() {
        return buttonsPane;
    }


    public void setAddPlan(Button addPlan) {
        this.addPlan = addPlan;
    }


    public void setDelPlan(Button delPlan) {
        this.delPlan = delPlan;
    }

    public void setSavePlan(Button savePlan) {
        this.savePlan = savePlan;
    }

    public Button getAddPlan() {
        return addPlan;
    }

    public Button getDelPlan() {
        return delPlan;
    }

    public Button getSavePlan() {
        return savePlan;
    }
}
