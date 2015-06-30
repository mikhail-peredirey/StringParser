package com.epam.peredirey.entity;

//неделимая сущность
public class Leaf extends Component { //Leaf хранит символы

    private char value; //кэширование Leaf


    public Leaf(String type) {
        super(type);
    }

    @Override
    public String stringify() {
        return String.valueOf(value);
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }
}
