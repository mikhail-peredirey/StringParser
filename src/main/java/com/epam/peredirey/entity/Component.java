package com.epam.peredirey.entity;


public abstract class Component {
    private String type; //�����, ����� ����������, �������

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract String stringify();

    public Component() {//����������� �� ���������
    }

    public Component(String type) {
        this.type = type;
    }
}
