package com.example.cardencalendar;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Plant {


    private final StringProperty numberRidge =
            new SimpleStringProperty();
    private final StringProperty name =
            new SimpleStringProperty();
    private final StringProperty wateringLastElement =
            new SimpleStringProperty();
    private final StringProperty mineralizationLastElement =
            new SimpleStringProperty();
    private final StringProperty mulchingLastElement =
            new SimpleStringProperty();
    private final StringProperty deoxidationLastElement =
            new SimpleStringProperty();
    private final StringProperty sedationLastElement =
            new SimpleStringProperty();
    private final StringProperty harvestingSum =
            new SimpleStringProperty();

    private static ListProperty<SomeWork> wateringList;
    private static ListProperty<SomeWork> mineralizationList;
    private static ListProperty<SomeWork> mulchingList;
    private static ListProperty<SomeWork> deoxidationList;
    private static ListProperty<SomeWork> sedationList;
    private static ListProperty<SomeWork> harvestingList;



    public Plant(String numberRidge, String name) {
        this.numberRidge.set(numberRidge);
        this.name.set(name);
        this.wateringLastElement.set("не поливали");
        this.mineralizationLastElement.set("не проводилась");
        this.mulchingLastElement.set("не проводилось");
        this.deoxidationLastElement.set("не проводилось");
        this.sedationLastElement.set("не высаживали");
        this.harvestingSum.set("не собирали");

        ObservableList<SomeWork> wateringList = FXCollections.observableArrayList(new SomeWork(0));
        this.wateringList= new SimpleListProperty<>();
        ObservableList<SomeWork> mineralizationList = FXCollections.observableArrayList(new SomeWork(0, "добавьте минерализацию"));
        this.mineralizationList = new SimpleListProperty<>(mineralizationList);
        ObservableList<SomeWork> mulchingList = FXCollections.observableArrayList(new SomeWork());
        this.mulchingList = new SimpleListProperty<>(mulchingList);
        ObservableList<SomeWork> deoxidationList = FXCollections.observableArrayList(new SomeWork(0, "добавьте раскисление"));
        this.deoxidationList = new SimpleListProperty<>(deoxidationList);
        ObservableList<SomeWork> sedationList = FXCollections.observableArrayList(new SomeWork("добавьте сидерацию"));
        this.sedationList = new SimpleListProperty<>(sedationList);
        ObservableList<SomeWork> harvestingList = FXCollections.observableArrayList(new SomeWork(0));
        this.harvestingList = new SimpleListProperty<>(harvestingList);

    }


    public StringProperty numberRidgeProperty() {
        return numberRidge;
    }

    public String getNumberRidge() {
        return numberRidge.get();
    }

    public void setNumberRidge(String numberRidge) {
        this.numberRidge.set(numberRidge);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public ListProperty<SomeWork> wateringListProperty() {
        return wateringList;
    }

    public static ObservableList<SomeWork> getWateringList() {
        return wateringList.get();
    }
    public static String getWateringListString(int i) {
        return wateringList.get(i).getVolume()+ " л. " + wateringList.get(i).getDate();
    }

    public void setWateringList(ObservableList<SomeWork> wateringList) {
        this.wateringList.set(wateringList);
    }

    public StringProperty wateringLastElementProperty() {
        return wateringLastElement;
    }

    public String getWateringLastElement() {
        return wateringLastElement.get();
    }

    public void setWateringLastElement() {
        this.wateringLastElement.set(String.valueOf(getLastSomeWorkWateringList().getVolume() + " л.   " + getLastSomeWorkWateringList().getDate()));
    }

    public SomeWork getLastSomeWorkWateringList() {
        return wateringList.get(wateringList.size() - 1);
    }

    public ListProperty<SomeWork> mineralizationListProperty() {
        return mineralizationList;
    }

    public ObservableList<SomeWork> getMineralizationList() {
        return mineralizationList.get();
    }
    public static String getMineralizationListString(int i) {
        return mineralizationList.get(i).getWeight()+ " кг. " + mineralizationList.get(i).getSubstance() + "  " + mineralizationList.get(i).getDate();
    }

    public void setMineralizationList(ObservableList<SomeWork> mineralizationList) {
        this.mineralizationList.set(mineralizationList);
    }

    public StringProperty mineralizationLastElementProperty() {
        return mineralizationLastElement;
    }

    public String getMineralizationLastElement() {
        return mineralizationLastElement.get();
    }

    public void setMineralizationLastElement() {
        this.mineralizationLastElement.set(String.valueOf(getLastSomeWorkMineralizationList().getWeight() + " кг.   " + getLastSomeWorkMineralizationList().getSubstance() + "  " + getLastSomeWorkMineralizationList().getDate()));
    }

    public SomeWork getLastSomeWorkMineralizationList() {
        return mineralizationList.get(mineralizationList.size() - 1);
    }

    public ListProperty<SomeWork> mulchingListProperty() {
        return mulchingList;
    }

    public ObservableList<SomeWork> getMulchingList() {
        return mulchingList.get();
    }
    public static String getMulchingListString(int i) {
        return mulchingList.get(i).getDate();
    }

    public void setMulchingList(ObservableList<SomeWork> mulchingList) {
        this.mulchingList.set(mulchingList);
    }

    public StringProperty mulchingLastElementProperty() {
        return mulchingLastElement;
    }

    public String getMulchingLastElement() {
        return mulchingLastElement.get();
    }

    public void setMulchingLastElement() {
        this.mulchingLastElement.set(String.valueOf(getLastSomeWorkMulchingList().getDate()));
    }

    public SomeWork getLastSomeWorkMulchingList() {
        return mulchingList.get(mulchingList.size() - 1);
    }

    public ListProperty<SomeWork> deoxidationListProperty() {
        return deoxidationList;
    }

    public ObservableList<SomeWork> getDeoxidationList() {
        return deoxidationList.get();
    }
    public static String getDeoxidationListString(int i) {
        return deoxidationList.get(i).getWeight()+ " кг. " + deoxidationList.get(i).getSubstance() + "  " + deoxidationList.get(i).getDate();
    }

    public void setDeoxidationList(ObservableList<SomeWork> deoxidationList) {
        this.deoxidationList.set(deoxidationList);
    }

    public StringProperty deoxidationLastElementProperty() {
        return deoxidationLastElement;
    }

    public String getDeoxidationLastElement() {
        return deoxidationLastElement.get();
    }

    public void setDeoxidationLastElement() {
        this.deoxidationLastElement.set(String.valueOf(getLastSomeWorkDeoxidationList().getWeight() + " кг.   " + getLastSomeWorkDeoxidationList().getSubstance() + "  " + deoxidationList.get(deoxidationList.size() - 1).getDate()));
    }

    public SomeWork getLastSomeWorkDeoxidationList() {
        return deoxidationList.get(deoxidationList.size() - 1);
    }

    public ListProperty<SomeWork> sedationListProperty() {
        return sedationList;
    }


    public ObservableList<SomeWork> getSedationList() {
        return sedationList.get();
    }

    public static String getSedationListString(int i) {
        return sedationList.get(i).getSubstance() + "  " + sedationList.get(i).getDate();
    }

    public void setSedationList(ObservableList<SomeWork> sedationList) {
        this.sedationList.set(sedationList);
    }

    public StringProperty sedationLastElementProperty() {
        return sedationLastElement;
    }

    public String getSedationLastElement() {
        return sedationLastElement.get();
    }

    public void setSedationLastElement() {
        this.sedationLastElement.set(getLastSomeWorkSedationList().getSubstance() + "  " + getLastSomeWorkSedationList().getDate());
    }

    public SomeWork getLastSomeWorkSedationList() {
        return sedationList.get(sedationList.size() - 1);
    }

    public ListProperty<SomeWork> harvestingListProperty() {
        return harvestingList;
    }

    public ObservableList<SomeWork> getHarvestingList() {
        return harvestingList.get();
    }
    public static String getHarvestingListString(int i) {
        return harvestingList.get(i).getWeight()+ " кг. " + harvestingList.get(i).getDate();
    }

    public void setHarvestingList(ObservableList<SomeWork> harvestingList) {
        this.harvestingList.set(harvestingList);
    }

    public StringProperty harvestingSumProperty() {
        return harvestingSum;
    }

    public String getHarvestingSum() {
        return harvestingSum.get();
    }

    public SomeWork getLastSomeWorkHarvestingList() {
        return harvestingList.get(harvestingList.size() - 1);
    }

    public void setHarvestingSum() {
        double x = 0;
        for (int i = 0; i < harvestingList.size(); i++) {
            x += harvestingList.get(i).getWeight();
        }
        this.harvestingSum.set(x + " кг.  " + getLastSomeWorkHarvestingList().getDate());
    }

    public static void setNewValue(StringProperty element, String s) {
        element.set(s);
    }


}
