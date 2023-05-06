package com.example.cardencalendar;

import javafx.beans.property.*;

import java.util.ArrayList;
import java.util.List;


public class Plant {
    private DoubleProperty numberRidge;
    private StringProperty name;
    private StringProperty watering;
    private StringProperty mineralization;
    private StringProperty mulching;
    private StringProperty deoxidation;
    private StringProperty sedation;
    private DoubleProperty harvesting;
    private List<SomeWork> wateringList;
    private List<SomeWork> mineralizationList;
    private List<SomeWork> mulchingList;
    private List<SomeWork> deoxidationList;
    private List<SomeWork> sedationList;

    public Plant() {}
    public Plant(double numberRidge,String name) {
        this.numberRidge=new SimpleDoubleProperty(numberRidge);
        this.name= new SimpleStringProperty(name);
        this.watering=new SimpleStringProperty("не поливали");
        this.mineralization = new SimpleStringProperty("не проводилась");
        this.mulching = new SimpleStringProperty("не проводилось");
        this.deoxidation = new SimpleStringProperty("не проводилось");
        this.sedation = new SimpleStringProperty("не высаживали");
        this.harvesting=new SimpleDoubleProperty(0);
        this.wateringList = new ArrayList<>();
        this.mineralizationList= new ArrayList<>();
        this.mulchingList= new ArrayList<>();
        this.deoxidationList= new ArrayList<>();
        this.sedationList= new ArrayList<>();
    }

    public void setWateringList(List<SomeWork> wateringList) {
        this.wateringList = wateringList;
    }

    public void setMineralizationList(List<SomeWork> mineralizationList) {
        this.mineralizationList = mineralizationList;
    }
    public void setMulchingList(List<SomeWork> mulchingList) {
        this.mulchingList = mulchingList;
    }
    public void setDeoxidationList(List<SomeWork> deoxidationList) {
        this.deoxidationList = deoxidationList;
    }
    public void setSedationList(List<SomeWork> sedationList) {
        this.sedationList = sedationList;
    }


    public DoubleProperty getNumberRidgeProperty() {
        return numberRidge;
    }
    public double getNumberRidge() {
        return numberRidge.get();
    }
    public void setNumberRidge(double numberRidge) {
        this.numberRidge.set(numberRidge);
    }


    public StringProperty getNameProperty() {
        return name;
    }
    public String getName() {
        return name.get();
    }
    public void setName(String name) {
        this.name.set(name);
    }


    public StringProperty getWateringProperty() {
        return watering;
    }
    public String getWatering() {
        return watering.get();
    }
    public void setWatering() {
        this.watering.set(String.valueOf(wateringList.get(wateringList.size()-1).getVolume()+" л.   " + wateringList.get(wateringList.size()-1).getDate()));
    }


    public StringProperty getMineralizationProperty() {
        return mineralization;
    }
    public String getMineralization() {
        return mineralization.get();
    }
    public void setMineralization() {
        this.mineralization.set(String.valueOf(mineralizationList.get(mineralizationList.size()-1).getWeight()+" кг.   " + mineralizationList.get(mineralizationList.size()-1).getSubstance() + "  " + mineralizationList.get(mineralizationList.size()-1).getDate()));

    }




    public StringProperty getMulchingProperty() {
        return mulching;
    }
    public String getMulching() {
        return mulching.get();
    }
    public void setMulching() {
        this.mulching.set(String.valueOf( mulchingList.get(mulchingList.size()-1).getVolume()+" корзин   " + mulchingList.get(mulchingList.size()-1).getDate()));
    }



    public StringProperty getDeoxidationProperty() {
        return deoxidation;
    }
    public String getDeoxidation() {
        return deoxidation.get();
    }
    public void setDeoxidation() {
        this.deoxidation.set(String.valueOf(deoxidationList.get(deoxidationList.size()-1).getWeight()+" кг.   " + deoxidationList.get(deoxidationList.size()-1).getSubstance() + "  " + deoxidationList.get(deoxidationList.size()-1).getDate()));
    }


    public StringProperty getSedationProperty() {
        return sedation;
    }
    public String getSedation() {
        return sedation.get();
    }
    public void setSedation() {
        this.sedation.set(sedationList.get(sedationList.size()-1).getSubstance() + "  " + sedationList.get(sedationList.size()-1).getDate());
    }




    public DoubleProperty getHarvestingProperty() {
        return harvesting;
    }
    public double getHarvesting() {
        return harvesting.get();
    }
    public void setHarvesting(double harvesting) {
        this.harvesting.set(harvesting);
    }

    }

