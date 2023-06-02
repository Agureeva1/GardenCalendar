package com.example.cardencalendar;

import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import static com.example.cardencalendar.PlantTableView.getTableList;
import static com.example.cardencalendar.MyTabPane.getTabpane;

public class LabelWithTip{

   private Pane gp;

    public LabelWithTip() {

        gp = new Pane();

        Label l1_1 = drawLabel("1.1", 56, 197);
        Label l1_2 = drawLabel("1.2", 146, 127);
        Label l1_3 = drawLabel("1.3", 236, 107);
        Label l1_4 = drawLabel("1.4", 236, 277);
        Label l1_5 = drawLabel("1.5", 416, 107);
        Label l1_6 = drawLabel("1.6", 416, 157);
        Label l1_7 = drawLabel("1.7", 416, 197);
        Label l1_8 = drawLabel("1.8", 416, 277);
        Label l1_9 = drawLabel("1.9", 766, 117);
        Label l1_10 = drawLabel("1.10", 764, 167);
        Label l1_11 = drawLabel("1.11", 764, 217);
        Label l1_12 = drawLabel("1.12", 764, 267);
        Label l1_13 = drawLabel("1.13", 764, 347);
        Label l1_14 = drawLabel("1.14", 854, 97);
        Label l1_15 = drawLabel("1.15", 944, 197);
        Label l1_16 = drawLabel("1.16", 1034, 247);
        Label l1_17 = drawLabel("1.17", 1124, 217);
        Label l1_18 = drawLabel("1.18", 1124, 282);

        Label l2_1 = drawLabel("2.1", 56, 57);
        Label l2_2 = drawLabel("2.2", 56, 127);
        Label l2_3 = drawLabel("2.3", 326, 57);
        Label l2_4 = drawLabel("2.4", 326, 127);
        Label l2_5 = drawLabel("2.5", 326, 197);
        Label l2_6 = drawLabel("2.6", 326, 267);
        Label l2_7 = drawLabel("2.7", 326, 337);
        Label l2_10 = drawLabel("2.10", 524, 107);
        Label l2_11 = drawLabel("2.11", 524, 177);
        Label l2_12 = drawLabel("2.12", 524, 247);
        Label l2_13 = drawLabel("2.13", 524, 317);
        Label l2_14 = drawLabel("2.14", 524, 387);
        Label l2_15 = drawLabel("2.15", 524, 457);
        Label l2_16 = drawLabel("2.16", 674, 537);
        Label l2_17 = drawLabel("2.17", 674, 57);
        Label l2_18 = drawLabel("2.18", 764, 57);
        Label l2_19 = drawLabel("2.19", 764, 467);
        Label l2_20 = drawLabel("2.20", 764, 537);
        Label l2_21 = drawLabel("2.21", 1124, 357);
        Label l2_22 = drawLabel("2.22", 1124, 417);
        Label l2_23 = drawLabel("2.23", 1124, 477);
        Label l2_24 = drawLabel("2.24", 1124, 537);
        Label l2_25 = drawLabel("2.25", 614, 77);

        Label l3_1 = drawLabel("3.1", 676, 127);
        Label l3_2 = drawLabel("3.2", 326, 407);
        Label l3_3 = drawLabel("3.3", 146, 537);

        Label l4_1 = drawLabel("4.1", 1126, 37);
        Label l4_2 = drawLabel("4.2", 1126, 97);
        Label l4_3 = drawLabel("4.3", 1126, 157);
        Label l4_4 = drawLabel("4.4", 1036, 37);
        Label l4_5 = drawLabel("4.5", 1036, 107);
        Label l4_6 = drawLabel("4.6", 1036, 177);
    }

    public Pane getGp() {
        return gp;
    }

    public Label drawLabel(String str, int x, int y) {
        Label label = new Label(str);
        int strInt = Integer.parseInt(str.replace(".", "").trim());
        if (getTabpane().getTabs().size() == 1) {
            String tip = "";
            String textTab = getTabpane().getTabs().get(0).getText();
            for (int i = 0; i < getTableList().get(0).getItems().size(); i++) {
                int numRidge = Integer.parseInt(getTableList().get(0).getItems().get(i).getNumberRidge().replace(".", "").trim());
                if (strInt == numRidge) {
                    tip = getTableList().get(getTableList().size() - 1).getItems().get(i).getName();

                } if (tip.length()==0) {
                    tip = "данные отсутствуют";
                }
            }  Tooltip tLong= new Tooltip(tip);
            tLong.setFont(Font.font(15));
            label.setTooltip(tLong);
        } else if (getTabpane().getTabs().size() == 2) {
            String tip0 = "";
            String tip1 = "";
            String textTab0 = getTabpane().getTabs().get(0).getText();
            String textTab1 = getTabpane().getTabs().get(1).getText();
            for (int i = 0; i < getTableList().get(0).getItems().size(); i++) {
                int numRidge0 = Integer.parseInt(getTableList().get(0).getItems().get(i).getNumberRidge().replace(".", "").trim());
                if (strInt == numRidge0) {
                    tip0 = textTab0 + ": " + getTableList().get(0).getItems().get(i).getName();
                } if (tip0.length()==0) {
                    tip0 = textTab0 + ": " +"данные отсутствуют";
                }
            }
            for (int j = 0; j < getTableList().get(1).getItems().size(); j++) {
                int numRidge1 = Integer.parseInt(getTableList().get(1).getItems().get(j).getNumberRidge().replace(".", "").trim());
                if (strInt == numRidge1) {
                    tip1 = textTab1 + ": " + getTableList().get(1).getItems().get(j).getName();
                } if (tip1.length()==0) {
                    tip1 = textTab1 + ": " +"данные отсутствуют";
                }
            } int len = textTab1.length()+2;
        if (strInt>=20 && strInt<40) {
                Tooltip tShot= new Tooltip(tip0.substring(len, tip0.length()));
                tShot.setFont(Font.font(15));
                label.setTooltip(tShot);
            }
           if (strInt>=200 && strInt<400) {
               Tooltip tShot= new Tooltip(tip0.substring(len, tip0.length()));
               tShot.setFont(Font.font(15));
               label.setTooltip(tShot);
           }
            if (strInt<20){
                Tooltip tLong= new Tooltip(tip0 + "\n" + tip1);
                tLong.setFont(Font.font(15));
                label.setTooltip(tLong);
            }
            if (strInt>=40 && strInt<200){
                Tooltip tLong= new Tooltip(tip0 + "\n" + tip1);
                tLong.setFont(Font.font(15));
                label.setTooltip(tLong);}
            if (strInt>=400){
                Tooltip tLong= new Tooltip(tip0 + "\n" + tip1);
                tLong.setFont(Font.font(15));
                label.setTooltip(tLong);}





        } else if (getTabpane().getTabs().size() >= 3) {
            String tip0 = "";
            String tip1 = "";
            String tip2 = "";
            String textTab0 = getTabpane().getTabs().get(getTabpane().getTabs().size() - 3).getText();
            String textTab1 = getTabpane().getTabs().get(getTabpane().getTabs().size() - 2).getText();
            String textTab2 = getTabpane().getTabs().get(getTabpane().getTabs().size() - 1).getText();
            for (int i = 0; i < getTableList().get(getTableList().size() - 3).getItems().size(); i++) {
                int numRidge0 = Integer.parseInt(getTableList().get(getTableList().size() - 3).getItems().get(i).getNumberRidge().replace(".", "").trim());
                if (strInt == numRidge0) {
                    tip0 = textTab0 + ": " + getTableList().get(getTableList().size() - 3).getItems().get(i).getName();
                } if (tip0.length()==0) {
                    tip0 = textTab0 + ": " +"данные отсутствуют";
                }
            }
            for (int j = 0; j < getTableList().get(getTableList().size() - 2).getItems().size(); j++) {
                int numRidge1 = Integer.parseInt(getTableList().get(getTableList().size() - 2).getItems().get(j).getNumberRidge().replace(".", "").trim());
                if (strInt == numRidge1) {
                    tip1 = textTab1 + ": " + getTableList().get(getTableList().size() - 2).getItems().get(j).getName();
                } if (tip1.length()==0) {
                    tip1 = textTab1 + ": " + "данные отсутствуют";
                }
                for (int k = 0; k < getTableList().get(getTableList().size() - 1).getItems().size(); k++) {
                    int numRidge2 = Integer.parseInt(getTableList().get(getTableList().size() - 1).getItems().get(k).getNumberRidge().replace(".", "").trim());
                    if (strInt == numRidge2) {
                        tip2 = textTab2 + ": " + getTableList().get(getTableList().size() - 1).getItems().get(k).getName();
                    } if (tip2.length()==0) {
                        tip2 = textTab2 + ": " + "данные отсутствуют";
                    }
                }
                int len = textTab0.length()+2;
                if (strInt>=20 && strInt<40) {
                    Tooltip tShot= new Tooltip(tip0.substring(len, tip0.length()));
                    tShot.setFont(Font.font(15));
                    label.setTooltip(tShot);}
               if (strInt>=200 && strInt<400) {
                   Tooltip tShot= new Tooltip(tip0.substring(len, tip0.length()));
                   tShot.setFont(Font.font(15));
                   label.setTooltip(tShot);}
                if (strInt<20){
                    Tooltip tLong= new Tooltip(tip0 + "\n" + tip1 + "\n" + tip2);
                    tLong.setFont(Font.font(15));
                    label.setTooltip(tLong);}
                if (strInt>=40 && strInt<200){
                    Tooltip tLong= new Tooltip(tip0 + "\n" + tip1 + "\n" + tip2);
                    tLong.setFont(Font.font(15));
                    label.setTooltip(tLong);}
                if (strInt>=400){
                    Tooltip tLong= new Tooltip(tip0 + "\n" + tip1 + "\n" + tip2);
                    tLong.setFont(Font.font(15));
                    label.setTooltip(tLong);}
            }
        }

        this.gp.getChildren().add(label);
        label.setFont(Font.font("",FontWeight.BOLD,12.0));
        label.relocate(x,y);
        return label;
    }

}

