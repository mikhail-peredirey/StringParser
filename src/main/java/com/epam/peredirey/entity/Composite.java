package com.epam.peredirey.entity;

import java.util.List;


public class Composite extends Component {
    private List<Component> components; //Composite ������ ������ �����������

    public Composite() {
    } //����������� �� ���������


    public Composite(String type) {
        super(type);
    }

    public String stringify() {
        StringBuilder builder = new StringBuilder();
        for (Component component : components)
            builder.append(component.stringify()); //��������� ����� ������ � ���� �� ������
        return builder.toString(); //���������� � ���� toString
    }

}
