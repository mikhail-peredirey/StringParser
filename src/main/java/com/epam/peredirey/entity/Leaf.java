package com.epam.peredirey.entity;

//��������� ��������
public class Leaf extends Component { //Leaf ������ �������

    private char value; //����������� Leaf


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
