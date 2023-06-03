package com.example.cardencalendar;

import javafx.scene.control.*;

import java.util.Optional;

import static com.example.cardencalendar.PlantTableView.getTableList;
import static com.example.cardencalendar.MyTabPane.getTabpane;

public class ButtonForTab {
    public static void addTab() {
        try {
            TextInputDialog dialog = new TextInputDialog();
            dialog.setTitle("Календарь огородника");
            dialog.setHeaderText("Добавить вкладку");
            dialog.setContentText("Укажите название вкладки:");
            Optional<String> nameTab = dialog.showAndWait();

            if (nameTab.get().trim().length() > 0) {
                Tab newTab = new Tab();

                newTab.setText(nameTab.get());
                newTab.setClosable(false);
                PlantTableView newTable = new PlantTableView();
                getTableList().add(newTable.getTable());
                newTab.setContent(newTable.getTable());
                getTabpane().getTabs().add(newTab);
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Информационное сообщение");
                alert.setHeaderText(null);
                alert.setContentText("Вы не указали название вкладки. Попробуйте еще раз.");

                alert.showAndWait();
            }
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Информационное сообщение");
            alert.setHeaderText(null);
            alert.setContentText("Не удалось добавить вкладку.");
            alert.showAndWait();
        }
    }
    public static void deleteSelectedTab() {
        try {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Календарь огородника");
            alert.setHeaderText("Удалить вкладку");
            alert.setContentText("Вы действительно хотите удалить вкладку " + MyTabPane.getTabpane().getSelectionModel().getSelectedItem().getText() + "?\n"
                    + "Вся содержащаяся во вкладке информация также\nбудет удалена.");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                getTableList().remove(getSelectedIndexTab());
                MyTabPane.getTabpane().getTabs().remove(getSelectedIndexTab());
            } else {
                alert.close();
            }

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Информационное сообщение");
            alert.setHeaderText(null);
            alert.setContentText("Не удалось удалить вкладку.");
            alert.showAndWait();
        }

    }
    public static void changeSelectedTab() {
        try {
            TextInputDialog dialog = new TextInputDialog();
            dialog.setTitle("Календарь огородника");
            dialog.setHeaderText("Вы хотите изменить название вкладки \"" + MyTabPane.getTabpane().getSelectionModel().getSelectedItem().getText() + "\"?");
            dialog.setContentText("Укажите новое название вкладки:");

            Optional<String> nameTab = dialog.showAndWait();

            if (nameTab.get().trim().length() > 0) {
                MyTabPane.getTabpane().getSelectionModel().getSelectedItem().setText(nameTab.get());
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Информационное сообщение");
                alert.setHeaderText(null);
                alert.setContentText("Вы не указали название вкладки. Попробуйте еще раз.");
                alert.showAndWait();
            }
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Информационное сообщение");
            alert.setHeaderText(null);
            alert.setContentText("Не удалось изменить название вкладки.");
            alert.showAndWait();
        }

    }

    public static int getSelectedIndexTab() {
        return MyTabPane.getTabpane().getSelectionModel().getSelectedIndex();
    }

    public static int getSelectedIndexTableView() {
        return MyTabPane.getTabpane().getSelectionModel().getSelectedIndex();
    }
}

