package com.epam.peredirey.entity;

import java.util.List;


public class Composite extends Component {
    private List<Component> components; //Composite хранит наборы компонентов

    public Composite() {
    } //конструктор по умолчанию


    public Composite(String type) {
        super(type);
    }

    public String stringify() {
        StringBuilder builder = new StringBuilder();
        for (Component component : components)
            builder.append(component.stringify()); //вложенный вызов одного и того же метода
        return builder.toString(); //возвращаем в виде toString
    }

}
