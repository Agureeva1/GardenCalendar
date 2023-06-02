package com.example.cardencalendar;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SomeWork {
    private int volume;
    private double weight;
    private String substance;
    private String date;
    static DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd.MM.uuuu");

    //мульчирование
    public SomeWork() {
        this.date = LocalDate.now().format(formatters);
    }

    //полив
    public SomeWork(int volume) {
        this.volume = volume;
        this.date = LocalDate.now().format(formatters);
    }

    //седерация
    public SomeWork(String substance) {
        this.substance = substance;
        this.date = LocalDate.now().format(formatters);
    }

    //минерализация, раскисление
    public SomeWork(double weight, String substance) {
        this.weight = weight;
        this.substance = substance;
        this.date = LocalDate.now().format(formatters);
    }

    //урожай
    public SomeWork(double weight) {
        this.weight = weight;
        this.date = LocalDate.now().format(formatters);
    }

    public int getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public String getSubstance() {
        return substance;
    }

    public String getDate() {
        return date;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSubstance(String substance) {
        this.substance = substance;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public DateTimeFormatter getFormatters() {
        return formatters;
    }
}
