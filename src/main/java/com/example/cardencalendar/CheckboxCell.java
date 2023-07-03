package com.example.cardencalendar;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableCell;

public class CheckboxCell extends TableCell<Plant, Boolean> {
    private CheckBox checkbox;

    @Override
    protected void updateItem(Boolean arg0, boolean arg1) {
        super.updateItem(arg0, arg1);
        paintCell();
    }

    protected void paintCell() {
        if (checkbox == null) {
            checkbox = new CheckBox();
            checkbox.selectedProperty().addListener(new ChangeListener<Boolean>() {

                @Override
                public void changed(ObservableValue<? extends Boolean> ov,
                                    Boolean old_val, Boolean new_val) {
                    setItem(new_val);
                    ((Plant) getTableView().getItems().get(getTableRow().getIndex())).setSelected(new_val);
                }
            });
        }
        checkbox.setSelected(getValue());
        setText(null);
        setGraphic(checkbox);
    }

    private Boolean getValue() {
        return getItem() == null ? false : getItem();
    }

    public CheckBox getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(CheckBox checkbox) {
        this.checkbox = checkbox;
    }
}