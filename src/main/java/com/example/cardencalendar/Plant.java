package com.example.cardencalendar;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Plant {

    private IntegerProperty id;

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
    private final SimpleBooleanProperty selected;
    private final ListProperty<SomeWork> wateringList = new SimpleListProperty<>();
    private final ListProperty<SomeWork> mineralizationList = new SimpleListProperty<>();
    private final ListProperty<SomeWork> mulchingList = new SimpleListProperty<>();
    private final ListProperty<SomeWork> deoxidationList = new SimpleListProperty<>();
    private final ListProperty<SomeWork> sedationList = new SimpleListProperty<>();
    private final ListProperty<SomeWork> harvestingList = new SimpleListProperty<>();


    private int q;
    private static int nextId = 0;

    public Plant(String numberRidge, String name) {
        q = nextId;
        this.id = new SimpleIntegerProperty(q);
        nextId++;


        this.selected = new SimpleBooleanProperty();
        this.numberRidge.set(numberRidge);
        this.name.set(name);
        this.wateringLastElement.set("не поливали");
        this.mineralizationLastElement.set("не проводилась");
        this.mulchingLastElement.set("не проводилось");
        this.deoxidationLastElement.set("не проводилось");
        this.sedationLastElement.set("не высаживали");
        this.harvestingSum.set("не собирали");

        //  ObservableList<SomeWork> wList = FXCollections.observableArrayList();
        this.wateringList.set(FXCollections.observableArrayList());
        //  ObservableList<SomeWork> mList = FXCollections.observableArrayList();
        this.mineralizationList.set(FXCollections.observableArrayList());
        // ObservableList<SomeWork> mulList = FXCollections.observableArrayList();
        this.mulchingList.set(FXCollections.observableArrayList());
        // ObservableList<SomeWork> dList = FXCollections.observableArrayList();
        this.deoxidationList.set(FXCollections.observableArrayList());
        //   ObservableList<SomeWork> sList = FXCollections.observableArrayList();
        this.sedationList.set(FXCollections.observableArrayList());
        // ObservableList<SomeWork> hList = FXCollections.observableArrayList();
        this.harvestingList.set(FXCollections.observableArrayList());

    }

    public boolean isSelected() {
        return selected.get();
    }

    public SimpleBooleanProperty selectedProperty() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected.set(selected);
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

    public ObservableList<SomeWork> getWateringList() {
        return this.wateringList.get();
    }

    public String getWateringListString(int i) {
        return this.wateringList.get(i).getVolume() + " л. " + this.wateringList.get(i).getDate();
    }

    public void setXMLWateringLastElement(String w) {
        this.wateringLastElement.set(w);
    }

    public void setWateringList(ObservableList<SomeWork> wateringList) {
        this.wateringList.set(wateringList);
    }

    public StringProperty wateringLastElementProperty() {
        return this.wateringLastElement;
    }

    public String getWateringLastElement() {
        return this.wateringLastElement.get();
    }

    public void setWateringLastElement() {
        this.wateringLastElement.set(String.valueOf(getLastSomeWorkWateringList().getVolume() + " л.   " +
                getLastSomeWorkWateringList().getDate()));
    }

    public SomeWork getLastSomeWorkWateringList() {
        return this.wateringList.get(this.wateringList.size() - 1);
    }


    public ListProperty<SomeWork> mineralizationListProperty() {
        return this.mineralizationList;
    }

    public ObservableList<SomeWork> getMineralizationList() {
        return this.mineralizationList.get();
    }

    public String getMineralizationListString(int i) {
        return this.mineralizationList.get(i).getWeight() + " кг. " + this.mineralizationList.get(i).getSubstance() + "  " + mineralizationList.get(i).getDate();
    }

    public void setMineralizationList(ObservableList<SomeWork> mineralizationList) {
        this.mineralizationList.set(mineralizationList);
    }

    public StringProperty mineralizationLastElementProperty() {
        return this.mineralizationLastElement;
    }

    public String getMineralizationLastElement() {
        return this.mineralizationLastElement.get();
    }

    public void setMineralizationLastElement() {
        this.mineralizationLastElement.set(String.valueOf(getLastSomeWorkMineralizationList().getWeight() + " кг.   " + getLastSomeWorkMineralizationList().getSubstance() + "  " + getLastSomeWorkMineralizationList().getDate()));
    }

    public SomeWork getLastSomeWorkMineralizationList() {
        return this.mineralizationList.get(this.mineralizationList.size() - 1);
    }

    public void setXMLMineralizationLastElement(String m) {
        this.mineralizationLastElement.set(m);
    }

    public ListProperty<SomeWork> mulchingListProperty() {
        return mulchingList;
    }

    public ObservableList<SomeWork> getMulchingList() {
        return this.mulchingList.get();
    }

    public String getMulchingListString(int i) {
        return this.mulchingList.get(i).getDate();
    }

    public void setMulchingList(ObservableList<SomeWork> mulchingList) {
        this.mulchingList.set(mulchingList);
    }

    public StringProperty mulchingLastElementProperty() {
        return this.mulchingLastElement;
    }

    public String getMulchingLastElement() {
        return this.mulchingLastElement.get();
    }

    public void setXMLMulchingLastElement(String m) {
        this.mulchingLastElement.set(m);
    }

    public void setMulchingLastElement() {
        this.mulchingLastElement.set(String.valueOf(getLastSomeWorkMulchingList().getDate()));
    }

    public SomeWork getLastSomeWorkMulchingList() {
        return this.mulchingList.get(this.mulchingList.size() - 1);
    }

    public ListProperty<SomeWork> deoxidationListProperty() {
        return this.deoxidationList;
    }

    public ObservableList<SomeWork> getDeoxidationList() {
        return this.deoxidationList.get();
    }

    public String getDeoxidationListString(int i) {
        return this.deoxidationList.get(i).getWeight() + " кг. " + this.deoxidationList.get(i).getSubstance() + "  " + this.deoxidationList.get(i).getDate();
    }

    public void setDeoxidationList(ObservableList<SomeWork> deoxidationList) {
        this.deoxidationList.set(deoxidationList);
    }

    public StringProperty deoxidationLastElementProperty() {
        return this.deoxidationLastElement;
    }

    public String getDeoxidationLastElement() {
        return this.deoxidationLastElement.get();
    }

    public void setDeoxidationLastElement() {
        this.deoxidationLastElement.set(String.valueOf(getLastSomeWorkDeoxidationList().getWeight() + " кг.   " + getLastSomeWorkDeoxidationList().getSubstance() + "  " + deoxidationList.get(deoxidationList.size() - 1).getDate()));
    }

    public void setXMLDeoxidationLastElement(String d) {
        this.deoxidationLastElement.set(d);
    }

    public SomeWork getLastSomeWorkDeoxidationList() {
        return this.deoxidationList.get(this.deoxidationList.size() - 1);
    }


    public ListProperty<SomeWork> sedationListProperty() {
        return this.sedationList;
    }


    public ObservableList<SomeWork> getSedationList() {
        return this.sedationList.get();
    }

    public String getSedationListString(int i) {
        return this.sedationList.get(i).getSubstance() + "  " + this.sedationList.get(i).getDate();
    }

    public void setSedationList(ObservableList<SomeWork> sedationList) {
        this.sedationList.set(sedationList);
    }

    public StringProperty sedationLastElementProperty() {
        return this.sedationLastElement;
    }

    public String getSedationLastElement() {
        return this.sedationLastElement.get();
    }

    public void setXMLSedationLastElement(String s) {
        this.sedationLastElement.set(s);
    }

    public void setSedationLastElement() {
        this.sedationLastElement.set(getLastSomeWorkSedationList().getSubstance() + "  " + getLastSomeWorkSedationList().getDate());
    }

    public SomeWork getLastSomeWorkSedationList() {
        return this.sedationList.get(this.sedationList.size() - 1);
    }

    public ListProperty<SomeWork> harvestingListProperty() {
        return this.harvestingList;
    }

    public ObservableList<SomeWork> getHarvestingList() {
        return this.harvestingList.get();
    }

    public String getHarvestingListString(int i) {
        return this.harvestingList.get(i).getWeight() + " кг. " + this.harvestingList.get(i).getDate();
    }

    public void setHarvestingList(ObservableList<SomeWork> harvestingList) {
        this.harvestingList.set(harvestingList);
    }

    public StringProperty harvestingSumProperty() {
        return this.harvestingSum;
    }

    public String getHarvestingSum() {
        return this.harvestingSum.get();
    }

    public void setXMLHarvestingSum(String h) {
        this.harvestingSum.set(h);
    }

    public SomeWork getLastSomeWorkHarvestingList() {
        return this.harvestingList.get(this.harvestingList.size() - 1);
    }

    public void setHarvestingSum() {
        double x = 0;
        for (int i = 0; i < this.harvestingList.size(); i++) {
            x += this.harvestingList.get(i).getWeight();
        }
        this.harvestingSum.set(x + " кг.  " + getLastSomeWorkHarvestingList().getDate());
    }

    public static void setNewValue(StringProperty element, String s) {
        element.set(s);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }
}
