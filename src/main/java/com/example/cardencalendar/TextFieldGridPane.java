package com.example.cardencalendar;

import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.util.Locale;

import static com.example.cardencalendar.ButtonForTab.getSelectedIndexTab;
import static com.example.cardencalendar.Plant.setNewValue;
import static com.example.cardencalendar.PlantTableView.getTableList;


public class TextFieldGridPane {

    private final TextField numberField = new TextField();
    private final TextField nameField = new TextField();
    private final DatePicker dateField = new DatePicker();
    DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);
   DecimalFormat format = new DecimalFormat("#.#",otherSymbols);


    public GridPane getNewPlantDataPane() {

        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(5);
        pane.addRow(0, new Label("Числовое поле:"), numberField);
        pane.addRow(1, new Label("Наименование:"), nameField);
        pane.addRow(2, new Label("Дата работы:"), dateField);

        numberField.setTextFormatter(new TextFormatter<>(c-> {
            if (c.getControlNewText().isEmpty()) {
                return c;
            }
            ParsePosition parsePosition = new ParsePosition(0);
            Object object =format.parse(c.getControlNewText(), parsePosition);
            if (object==null || parsePosition.getIndex()<c.getControlNewText().length()) {
                return null;
            } else  {
                return c;
            }
        }));

        Button addPlantBtn = new Button("Добавить растение");
        addPlantBtn.setOnAction(e -> addPlant());

        Button changePlantBtn = new Button("Изменить растение");
        changePlantBtn.setOnAction(e -> changeSelectedPlant());

        Button delPlantBtn = new Button("Удалить растение   ");
        delPlantBtn.setOnAction(e -> deleteSelectedRows());

        //  addPlantBtn.setStyle("-fx-background-color: #ff0000; ");
        //   changePlantBtn.setStyle("-fx-border-color: #ff0000; -fx-border-width: 2px;");

        pane.add(addPlantBtn, 2, 0);
        pane.add(changePlantBtn, 2, 1);
        pane.add(delPlantBtn, 2, 2);

        Button addWatBtn = new Button("Добавить полив");
        addWatBtn.setOnAction(e -> addWatering());

        Button changeWatBtn = new Button("Изменить полив");
        changeWatBtn.setOnAction(e -> changeWatering());

        Button delWatBtn = new Button("Удалить полив   ");
        delWatBtn.setOnAction(e -> delWatering());


        pane.add(addWatBtn, 3, 0);
        pane.add(changeWatBtn, 3, 1);
        pane.add(delWatBtn, 3, 2);

        Button addMinBtn = new Button("Добавить минерализацию");
        addMinBtn.setOnAction(e -> addMineralization());

        Button changeMinBtn = new Button("Изменить минерализацию");
        changeMinBtn.setOnAction(e -> changeMineralization());

        Button delMinBtn = new Button("Удалить минерализацию   ");
        delMinBtn.setOnAction(e -> delMineralization());

        pane.add(addMinBtn, 4, 0);
        pane.add(changeMinBtn, 4, 1);
        pane.add(delMinBtn, 4, 2);

        Button addDeoxBtn = new Button("Добавить раскисление");
        addDeoxBtn.setOnAction(e -> addDeoxidation());

        Button changeDeoxBtn = new Button("Изменить раскисление");
        changeDeoxBtn.setOnAction(e -> changeDeoxidation());

        Button delDeoxBtn = new Button("Удалить раскисление   ");
        delDeoxBtn.setOnAction(e -> delDeoxidation());


        pane.add(addDeoxBtn, 5, 0);
        pane.add(changeDeoxBtn, 5, 1);
        pane.add(delDeoxBtn, 5, 2);

        Button addMulchBtn = new Button("Добавить мульчирование");
        addMulchBtn.setOnAction(e -> addMulching());

        Button changeMulchBtn = new Button("Изменить мульчирование");
        changeMulchBtn.setOnAction(e -> changeMulching());

        Button delMulchBtn = new Button("Удалить мульчирование   ");
        delMulchBtn.setOnAction(e -> delMulching());

        pane.add(addMulchBtn, 6, 0);
        pane.add(changeMulchBtn, 6, 1);
        pane.add(delMulchBtn, 6, 2);

        Button addSedBtn = new Button("Добавить сидерацию");
        addSedBtn.setOnAction(e -> addSederat());

        Button changeSedBtn = new Button("Изменить сидерацию");
        changeSedBtn.setOnAction(e -> changeSederat());

        Button delSedBtn = new Button("Удалить сидерацию   ");
        delSedBtn.setOnAction(e -> delSederat());

        pane.add(addSedBtn, 7, 0);
        pane.add(changeSedBtn, 7, 1);
        pane.add(delSedBtn, 7, 2);

        Button addHarBtn = new Button("Добавить урожай");
        addHarBtn.setOnAction(e -> addHarvesting());

        Button changeHarBtn = new Button("Изменить урожай");
        changeHarBtn.setOnAction(e -> changeHarvesting());

        Button delHarBtn = new Button("Удалить урожай   ");
        delHarBtn.setOnAction(e -> delHarvesting());

        pane.add(addHarBtn, 8, 0);
        pane.add(changeHarBtn, 8, 1);
        pane.add(delHarBtn, 8, 2);


        addPlantBtn.setStyle("-fx-text-fill: #00BB00");
        changePlantBtn.setStyle("-fx-text-fill: #00BB00");
        delPlantBtn.setStyle("-fx-text-fill: #00BB00");

        addWatBtn.setStyle("-fx-text-fill: blue");
        changeWatBtn.setStyle("-fx-text-fill: blue");
        delWatBtn.setStyle("-fx-text-fill: blue");

        addMinBtn.setStyle("-fx-text-fill: Teal");
        changeMinBtn.setStyle("-fx-text-fill: Teal");
        delMinBtn.setStyle("-fx-text-fill: Teal");

        addDeoxBtn.setStyle("-fx-text-fill: #ff8000");
        changeDeoxBtn.setStyle("-fx-text-fill: #ff8000");
        delDeoxBtn.setStyle("-fx-text-fill: #ff8000");

        addMulchBtn.setStyle("-fx-text-fill: green");
        changeMulchBtn.setStyle("-fx-text-fill: green");
        delMulchBtn.setStyle("-fx-text-fill: green");

        addSedBtn.setStyle("-fx-text-fill: #DD00DD");
        changeSedBtn.setStyle("-fx-text-fill: #DD00DD");
        delSedBtn.setStyle("-fx-text-fill:  #DD00DD");

        addHarBtn.setStyle("-fx-text-fill: Red");
        changeHarBtn.setStyle("-fx-text-fill: Red");
        delHarBtn.setStyle("-fx-text-fill:  Red");


        return pane;
    }


    public void addPlant() {
        try {
         //   if (numberField.getText().trim().length() == 0 || nameField.getText().trim().length() == 0) {
                if (numberField.getText() == null || nameField.getText() == null) {
                catchMessage("Не удалось добавить растение. Убедитесь, " +
                        "что в числовом поле указан номер грядки," +
                        " а в поле наименование - название культуры.");
            } else {
                Plant p = new Plant(numberField.getText(), nameField.getText());
                getTableList().get(getSelectedIndexTab()).getItems().add(0,p);
                clearFields();
            }
        } catch (Exception e) {
            catchMessage("Не удалось добавить растение. " +
                    "Убедитесь, что оба поля заполнены: числовое поле и поле наименования.");
        }
    }

    public void changeSelectedPlant() {
        try {
        //    if (numberField.getText().trim().length() == 0 && nameField.getText().trim().length() == 0 || getSelectModel().isEmpty()) {
            if (numberField.getText() == null && nameField.getText() == null || getSelectModel().isEmpty()) {   catchMessage("Выберите растение, которое хотите изменить, нажав на него. " +
                        "Убедитесь, что хотя бы одно поле заполнено - числовое поле или название культуры.");
            } else {
                if (numberField.getText() != null) {
                    if (numberField.getText().trim().length() > 0) {
                        getSelectPlant().setNumberRidge(numberField.getText());
                    }
                }
                if (nameField.getText() != null) {
                    if (nameField.getText().trim().length() > 0) {
                        getSelectPlant().setName(nameField.getText());
                }} clearFields();}
        } catch (Exception e) {
            catchMessage("Не удалось изменить строку. Убедитесь, " +
                    "что хотя бы одно поле заполнено - числовое поле или название культуры.");
        }

    }


    public void deleteSelectedRows() {
        try {
            if (getSelectModel().isEmpty()) {
                catchMessage("Выберите строку, которую хотите удалить, нажав на нее.");
            } else {
                getTableList().get(getSelectedIndexTab()).getItems().remove(getIndexSelectRow());
            }
        } catch (Exception e) {
            catchMessage("Не удалось удалить строку. Сбой программы.");
        }
    }

    public void addWatering() {
        try {
            //  if (numberField.getText().trim().length() == 0 || getSelectModel().isEmpty()) {
                if (numberField.getText()== null || getSelectModel().isEmpty()) {
                catchMessage("Выберите растение, для которого нужно добавить полив. " +
                        "Убедитесь, что числовое поле содержит объем полива. Если дата не заполнена," +
                        " программа проставит текущую дату полива.");

            } else {
                if (numberField.getText() != null) {
                    if (dateField.getValue() == null && numberField.getText().trim().length() > 0) {
                        int val = Integer.parseInt(numberField.getText());
                        getSelectPlant().getWateringList().add(new SomeWork(val));
                        getSelectPlant().setWateringLastElement();
                        clearFields();
                        }
                    }
                    if (dateField.getValue() != null && numberField.getText().trim().length() > 0) {
                        int val = Integer.parseInt(numberField.getText());
                        String data = notFutureData(dateField);
                        getSelectPlant().getWateringList().add(new SomeWork(val));
                        getSelectPlant().getWateringList().get(getSelectPlant().getWateringList().size() - 1).setDate(data);
                        getSelectPlant().setWateringLastElement();
                        clearFields();
                }
            }
        } catch (Exception e) {
            catchMessage("Не удалось добавить полив. Убедитесь, что указали в числовом поле положительное целое число.");
        }
    }

    public void changeWatering() {
        try {
        //    if (dateField.getValue() == null && numberField.getText().trim().length() == 0 || getSelectModel().isEmpty()) {
                if (dateField.getValue() == null && numberField.getText() == null || getSelectModel().isEmpty()) {
                catchMessage("Выберите растение, для которого нужно изменить полив, нажав на строку. " +
                        "Если числовое поле не заполнено, объем изменен не будет. " +
                        "Если дата не заполнена, дата изменена не будет.");
            } else if (getSelectPlant().getWateringList().size() <= 1) {
                catchMessage("Вы не можете внести изменения, т.к. не добавляли ранее данные о поливе.");
            } else {
                if (numberField.getText() != null) {
                    if (numberField.getText().trim().length() > 0 && dateField.getValue() != null) {
                        int val = Integer.parseInt(numberField.getText());
                        getSelectPlant().getWateringList().get(getSelectPlant().getWateringList().size() - 1).setVolume(val);
                        String data = notFutureData(dateField);
                        getSelectPlant().getWateringList().get(getSelectPlant().getWateringList().size() - 1).setDate(data);
                        getSelectPlant().setWateringLastElement();
                        clearFields();
                    } else if (numberField.getText().trim().length() > 0) {
                        int val = Integer.parseInt(numberField.getText());
                        getSelectPlant().getWateringList().get(getSelectPlant().getWateringList().size() - 1).setVolume(val);
                        getSelectPlant().setWateringLastElement();
                        clearFields();
                    }
                } else if (dateField.getValue() != null) {
                    String date = notFutureData(dateField);
                    getSelectPlant().getWateringList().get(getSelectPlant().getWateringList().size() - 1).setDate(String.valueOf(date));
                    getSelectPlant().setWateringLastElement();
                    clearFields();
                }
            }
        } catch (Exception e) {
            catchMessage("Не удалось изменить полив. Убедитесь, что либо числовое поле, либо дата заполнены.");
        }
    }

    public void delWatering() {
        try {
            if (getSelectModel().isEmpty()) {
                catchMessage("Не удалось удалить полив. Убедитесь, " +
                        "что Вы выбрали растение.");
            } else if (getSelectPlant().getWateringList().size() < 1) {
                catchMessage("Не удалось удалить полив. Убедитесь, " +
                        "что ранее добавляли данные.");
            } else {
                getSelectPlant().getWateringList().remove(getSelectPlant().getWateringList().size()-1);
                if (getSelectPlant().getWateringList().size() >= 1) {
                    getSelectPlant().setWateringLastElement();
                    clearFields();
                } else {
                    setNewValue(getSelectPlant().wateringLastElementProperty(), "не поливали");
                    clearFields();
                }
            }
        } catch (Exception e) {
            catchMessage("Не удалось удалить полив. Сбой программы.");
        }

    }
    public void addMineralization() {
        try {
          //  if (numberField.getText().trim().length() == 0 || nameField.getText().trim().length() == 0 || getSelectModel().isEmpty()) {
            if (numberField.getText() == null || nameField.getText() == null || getSelectModel().isEmpty()) {
                catchMessage("Выберите растение, для которого нужно добавить минерализацию. " +
                        "Убедитесь, что добавили название удобрения и его объем.");
            } else {
                if (numberField.getText() != null && nameField.getText() != null) {
                    double val = Double.parseDouble(numberField.getText());
                    getSelectPlant().getMineralizationList().add(new SomeWork(val, nameField.getText()));
                    getSelectPlant().setMineralizationLastElement();
                    if (dateField.getValue() != null) {
                        String data = notFutureData(dateField);
                        getSelectPlant().getMineralizationList().get(getSelectPlant().getMineralizationList().size() - 1).setDate(data);
                        getSelectPlant().setMineralizationLastElement();
                    }
                    clearFields();
                }
            }
        } catch (Exception e) {
            catchMessage("Не удалось добавить минерализацию. Убедитесь, что указали объем " +
                    "внесенного удобрения и его название.");
        }
    }
    public void changeMineralization() {
        try {
            if (dateField.getValue() == null && nameField.getText() == null && numberField.getText() == null || getSelectModel().isEmpty()) {
                catchMessage("Выберите растение, для которого нужно изменить минерализацию. " +
                        "Убедитесь, что добавили название удобрения, его объем или дату минерализации.");
            } else if (getSelectPlant().getMineralizationList().size() <1) {
                catchMessage("Вы не можете внести изменения, т.к. не добавляли ранее данные о минерализации.");
            } else {
                if (numberField.getText() != null) {
                    if (numberField.getText().trim().length() > 0) {
                        double val = Double.parseDouble(numberField.getText());
                        getSelectPlant().getMineralizationList().get(getSelectPlant().getMineralizationList().size() - 1).setWeight(val);

                    }
                }
                if (nameField.getText() != null) {
                    if (nameField.getText().trim().length() > 0) {
                        getSelectPlant().getMineralizationList().get(getSelectPlant().getMineralizationList().size() - 1).setSubstance(nameField.getText());
                    }
                }

                if (dateField.getValue() != null) {
                    String date = notFutureData(dateField);
                    getSelectPlant().getMineralizationList().get(getSelectPlant().getMineralizationList().size() - 1).setDate(date);

                }
                getSelectPlant().setMineralizationLastElement();
                clearFields();
            }
        } catch (Exception e) {
            catchMessage("Не удалось изменить минерализацию. " +
                    "Убедитесь, что хотя бы одно поле заполнено.");
        }
    }
    public void delMineralization() {
        try {
            if (getSelectModel().isEmpty() || getSelectPlant().getMineralizationList().size() < 1) {
                catchMessage("Не удалось удалить минерализацию. Убедитесь, " +
                        "что Вы выбрали растение и раннее добавляли минерализацию.");
            } else {
                getSelectPlant().getMineralizationList().remove(getSelectPlant().getMineralizationList().size() - 1);
                if (getSelectPlant().getMineralizationList().size() >= 1) {
                    getSelectPlant().setMineralizationLastElement();
                    clearFields();
                } else {
                    setNewValue(getSelectPlant().mineralizationLastElementProperty(), "не проводилась");
                    clearFields();
                }
            }
        } catch (Exception e) {
            catchMessage("Не удалось удалить минерализацию. Сбой программы.");
        }
    }
    public void addDeoxidation() {
        try {
           // if (numberField.getText().trim().length() == 0 || nameField.getText().trim().length() == 0 || getSelectModel().isEmpty()) {
                if (numberField.getText() == null || nameField.getText() == null || getSelectModel().isEmpty()) {
                catchMessage("Выберите растение, для которого нужно добавить раскисление. " +
                        "Убедитесь, что добавили название препарата и его объем.");
            } else {
                if (numberField.getText() != null && nameField.getText() != null) {
                    double val = Double.parseDouble(numberField.getText());
                    getSelectPlant().getDeoxidationList().add(new SomeWork(val, nameField.getText()));
                  //  getSelectPlant().setDeoxidationLastElement();
                    if (dateField.getValue() != null) {
                        String data = notFutureData(dateField);
                        getSelectPlant().getDeoxidationList().get(getSelectPlant().getDeoxidationList().size() - 1).setDate(data);
                       // getSelectPlant().setDeoxidationLastElement();
                    }
                    getSelectPlant().setDeoxidationLastElement();
                    clearFields();
                }
            }
        } catch (Exception e) {
            catchMessage("Не удалось добавить раскисление. Убедитесь, что указали объем " +
                    "внесенного препарата и его название.");
        }
    }
    public void changeDeoxidation() {
        try {
            if (dateField.getValue() == null && nameField.getText() == null && numberField.getText() == null || getSelectModel().isEmpty()) {
                catchMessage("Выберите растение, для которого нужно изменить раскисление. " +
                        "Убедитесь, что добавили название препарата, его объем или дату раскисления.");
            } else if (getSelectPlant().getDeoxidationList().size() < 1) {
                catchMessage("Вы не можете внести изменения, т.к. не добавляли ранее данные о раскислении.");
            } else {
                if (numberField.getText() != null) {
                    if (numberField.getText().trim().length() > 0) {
                        double val = Double.parseDouble(numberField.getText());
                        getSelectPlant().getDeoxidationList().get(getSelectPlant().getDeoxidationList().size() - 1).setWeight(val);

                    }
                }
                if (nameField.getText() != null) {
                    if (nameField.getText().trim().length() > 0) {
                        getSelectPlant().getDeoxidationList().get(getSelectPlant().getDeoxidationList().size() - 1).setSubstance(nameField.getText());
                    }
                }

                if (dateField.getValue() != null) {
                    String date = notFutureData(dateField);
                    getSelectPlant().getDeoxidationList().get(getSelectPlant().getDeoxidationList().size() - 1).setDate(date);

                }
                getSelectPlant().setDeoxidationLastElement();
                clearFields();
            }
        } catch (Exception e) {
            catchMessage("Не удалось изменить раскисление. " +
                    "Убедитесь, что хотя бы одно поле заполнено.");
        }
    }
    public void delDeoxidation() {
        try {
            if (getSelectModel().isEmpty() || getSelectPlant().getDeoxidationList().size() < 1) {
                catchMessage("Не удалось удалить раскисление. Убедитесь, " +
                        "что Вы выбрали растение и раннее добавляли раскисление.");
            } else {

                getSelectPlant().getDeoxidationList().remove(getSelectPlant().getDeoxidationList().size() - 1);
                if (getSelectPlant().getDeoxidationList().size() >= 1) {
                    getSelectPlant().setDeoxidationLastElement();
                    clearFields();
                } else {
                    setNewValue(getSelectPlant().deoxidationLastElementProperty(), "не проводилось");
                    clearFields();
                }
            }
        } catch (Exception e) {
            catchMessage("Не удалось удалить раскисление. Сбой программы.");
        }
    }
    public void addMulching() {
        try {
            if (getSelectModel().isEmpty()) {
                catchMessage("Выберите растение, для которого нужно добавить мульчирование.");
            } else {
                if (dateField.getValue() == null) {
                    getSelectPlant().getMulchingList().add(new SomeWork());
                    getSelectPlant().setMulchingLastElement();
                    clearFields();
                }
                if (dateField.getValue() != null) {
                    String data = notFutureData(dateField);
                    getSelectPlant().getMulchingList().add(new SomeWork());
                    getSelectPlant().getMulchingList().get(getSelectPlant().getMulchingList().size() - 1).setDate(data);
                    getSelectPlant().setMulchingLastElement();
                    clearFields();
                }
            }
        } catch (Exception e) {
            catchMessage("Не удалось добавить мульчирование. Сбой программы.");
        }
    }
    public void changeMulching() {
        try {
            if (dateField.getValue() == null || getSelectModel().isEmpty()) {
                catchMessage("Выберите растение, для которого нужно изменить мульчирование, нажав на строку. " +
                        "Укажите новую дату.");
            } else if (getSelectPlant().getMulchingList().size() < 1) {
                catchMessage("Вы не можете внести изменения, т.к. не добавляли ранее данные о мульчировании.");
            } else {
                if (dateField.getValue() != null) {
                    String date = notFutureData(dateField);
                    getSelectPlant().getMulchingList().get(getSelectPlant().getMulchingList().size() - 1).setDate(String.valueOf(date));
                    getSelectPlant().setMulchingLastElement();
                    clearFields();
                }
            }

        } catch (Exception e) {
            catchMessage("Не удалось изменить мульчирование. Сбой программы.");
        }
    }
    public void delMulching() {
        try {
            if (getSelectModel().isEmpty()) {
                catchMessage("Не удалось удалить мульчирование. Убедитесь, " +
                        "что Вы выбрали растение.");
            } else if (getSelectPlant().getMulchingList().size() < 1) {
                catchMessage("Не удалось удалить мульчирование. Убедитесь, " +
                        "что ранее добавляли данные.");
            } else {
                getSelectPlant().getMulchingList().remove(getSelectPlant().getMulchingList().size() - 1);
                if (getSelectPlant().getMulchingList().size() >= 1) {
                    getSelectPlant().setMulchingLastElement();
                    clearFields();
                } else {
                    setNewValue(getSelectPlant().mulchingLastElementProperty(), "не проводилось");
                    clearFields();
                }
            }
        } catch (Exception e) {
            catchMessage("Не удалось удалить мульчирование. Сбой программы.");
        }

    }
    public void addSederat() {
        try {
         //   if (nameField.getText().trim().length() == 0 || getSelectModel().isEmpty()) {
                if (nameField.getText() == null || getSelectModel().isEmpty()) {
                catchMessage("Выберите грядку, для которой нужно добавить сидерацию. " +
                        "Убедитесь, что поле наименование содержит название сидерата. Если дата не заполнена," +
                        " программа проставит текущую дату.");
            } else {
                if (nameField.getText() != null) {
                    if (nameField.getText().trim().length() > 0) {
                        getSelectPlant().getSedationList().add(new SomeWork(nameField.getText()));
                    }
                    if (dateField.getValue() != null) {
                        String data = notFutureData(dateField);
                        getSelectPlant().getSedationList().get(getSelectPlant().getSedationList().size() - 1).setDate(data);
                    }
                    getSelectPlant().setSedationLastElement();
                    clearFields();
                }
            }
        } catch (Exception e) {
            catchMessage("Не удалось добавить сидерацию. Сбой программы.");
        }
    }
    public void changeSederat() {
        try {
          //  if (dateField.getValue() == null && nameField.getText().trim().length() == 0 || getSelectModel().isEmpty()) {
                if (dateField.getValue() == null && nameField.getText() == null || getSelectModel().isEmpty()) {
                catchMessage("Выберите грядку, для которой нужно изменить сидерацию, нажав на строку. " +
                        "Если наименование не заполнено, сидерат изменен не будет. " +
                        "Если дата не заполнена, дата изменена не будет.");
            } else if (getSelectPlant().getSedationList().size() < 1) {
                catchMessage("Вы не можете внести изменения, т.к. не добавляли ранее данные о сидератах.");
            } else {
                if (nameField.getText() != null) {
                    if (nameField.getText().trim().length() > 0) {
                        getSelectPlant().getSedationList().get(getSelectPlant().getSedationList().size() - 1).setSubstance(nameField.getText());
                    } }
                if (dateField.getValue() != null) {
                    String date = notFutureData(dateField);
                    getSelectPlant().getSedationList().get(getSelectPlant().getSedationList().size() - 1).setDate(String.valueOf(date));
                }  getSelectPlant().setSedationLastElement();
                    clearFields();
                }

        } catch (Exception e) {
            catchMessage("Не удалось изменить сидерацию. Сбой программы.");
        }
    }
    public void delSederat() {
        try {
            if (getSelectModel().isEmpty()) {
                catchMessage("Не удалось удалить сидерацию. Убедитесь, " +
                        "что Вы выбрали грядку.");
            } else if (getSelectPlant().getSedationList().size() < 1) {
                catchMessage("Не удалось удалить сидерацию. Убедитесь, " +
                        "что ранее добавляли данные.");
            } else {

                getSelectPlant().getSedationList().remove(getSelectPlant().getSedationList().size() - 1);
                if (getSelectPlant().getSedationList().size() >= 1) {
                    getSelectPlant().setSedationLastElement();
                    clearFields();
                } else {
                    setNewValue(getSelectPlant().sedationLastElementProperty(), "не высаживали");
                    clearFields();
                }
            }
        } catch (Exception e) {
            catchMessage("Не удалось удалить сидерацию. Убедитесь, что ранее указывали данные о сидерации.");
        }

    }
    public void addHarvesting() {
        try {
           // if (numberField.getText().trim().length() == 0 || getSelectModel().isEmpty()) {
            if (numberField.getText() == null || getSelectModel().isEmpty()) {
                catchMessage("Выберите растение, для которого нужно добавить урожай. " +
                        "Убедитесь, что числовое поле содержит вес урожая. Если дата не заполнена," +
                        " программа проставит текущую дату сбора.");

            } else {
                if (numberField.getText() != null) {
                    if (numberField.getText().trim().length() > 0) {
                        double weight = Double.parseDouble(numberField.getText());
                        getSelectPlant().getHarvestingList().add(new SomeWork(weight));
                    }
                    if (dateField.getValue() != null) {
                        String data = notFutureData(dateField);
                        getSelectPlant().getHarvestingList().get(getSelectPlant().getHarvestingList().size() - 1).setDate(data);
                    }
                }   getSelectPlant().setHarvestingSum();
                clearFields();
            }
        } catch (Exception e) {
            catchMessage("Не удалось добавить урожай. Сбой программы.");
        }
    }
    public void changeHarvesting() {
        try {
            if (dateField.getValue() == null && numberField.getText() == null || getSelectModel().isEmpty()) {
                catchMessage("Выберите растение, для которого нужно изменить урожай, нажав на строку. " +
                        "Если числовое поле не заполнено, вес изменен не будет. " +
                        "Если дата не заполнена, дата изменена не будет.");
            } else if (getSelectPlant().getHarvestingList().size() < 1) {
                catchMessage("Вы не можете внести изменения, т.к. не добавляли ранее данные об урожае.");
            } else {
                if (numberField.getText() != null) {
                    if (numberField.getText().trim().length() > 0) {
                        double weight = Double.parseDouble(numberField.getText());
                        getSelectPlant().getHarvestingList().get(getSelectPlant().getHarvestingList().size() - 1).setWeight(weight);
                } }
                if (dateField.getValue() != null) {
                    String date = notFutureData(dateField);
                    getSelectPlant().getHarvestingList().get(getSelectPlant().getHarvestingList().size() - 1).setDate(String.valueOf(date));

                }  getSelectPlant().setHarvestingSum();
                clearFields();
            }
        } catch (Exception e) {
            catchMessage("Не удалось изменить урожай. Убедитесь, что ввели данные для изменения.");
        }
    }
    public void delHarvesting() {
        try {
            if (getSelectModel().isEmpty()) {
                catchMessage("Не удалось удалить урожай. Убедитесь, " +
                        "что Вы выбрали растение.");
            } else if (getSelectPlant().getHarvestingList().size() < 1) {
                catchMessage("Не удалось удалить урожай. Убедитесь, " +
                        "что ранее добавляли данные.");
            } else {

                getSelectPlant().getHarvestingList().remove(getSelectPlant().getHarvestingList().size() - 1);
                if (getSelectPlant().getHarvestingList().size() >= 1) {
                    getSelectPlant().setHarvestingSum();
                    clearFields();
                } else {
                    setNewValue(getSelectPlant().harvestingSumProperty(), "не собирали");
                    clearFields();
                }
            }
        } catch (Exception e) {
            catchMessage("Не удалось удалить урожай. Сбой программы.");
        }

    }

    public void clearFields() {
        numberField.setText(null);
        nameField.setText(null);
        dateField.setValue(null);
    }

    public static int getIndexSelectRow() {
        return getTableList().get(getSelectedIndexTab()).getSelectionModel().getSelectedIndex();
    }

    public static Plant getSelectPlant() {
        return getTableList().get(getSelectedIndexTab()).getItems().get(getIndexSelectRow());
    }

    public TableView.TableViewSelectionModel<Plant> getSelectModel() {
        return getTableList().get(getSelectedIndexTab()).getSelectionModel();
    }

    public String notFutureData(DatePicker dp) {
        LocalDate datePicker = dp.getValue();
        LocalDate today = LocalDate.now();
        if (datePicker.isAfter(today)) {

            return today.format(SomeWork.formatters);
        } else {
            return datePicker.format(SomeWork.formatters);
        }
    }

    public void catchMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Информационное сообщение");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
        clearFields();
    }

}