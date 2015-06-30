package com.epam.peredirey.entity;


public abstract class Component {
    private String type; //буквы, знаки препинания, пробелы

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract String stringify();

    public Component() {//конструктор по умолчанию
    }

    public Component(String type) {
        this.type = type;
    }
}
