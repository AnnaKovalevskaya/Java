package bsu.rfe.java.group6.lab1.ANNA.varC2;

public class Apple extends Food {
    /* extends - ������ ����� �������� �����������
           ������� ������ */

    private String size;             // ��-�� �������� ������ ���� ����� �������������� ������ equals � toString
    private Double calories = null;

    public Apple(String size)     // ����������� �������������
    {
        super("������");               // �������� ����������� �������� ������
        this.size = size;
    }

    public void consume()           // ���������� ������ consume (��� ��������� � ��������)
    {
        System.out.println(this + " �������");
    }

    public Double calculateCalories()       // ���������� ������ �������� �������
    {
        if(size.equals("���������"))
        {
            calories = 15.0;
        }
        else if(size.equals("�������"))
        {
            calories = 20.0;
        }
        else if(size.equals("�������"))
        {
            calories = 25.0;
        }
        return calories;
    }

    public String getSize()   // ���������� ������ ������
    {
        return size;
    }

    public void setSize(String size)  // ��������� ������� ������
    {
        this.size = size;
    }

    public boolean equals(Object arg0)  // �������������� ������ ���������
    {
        if (super.equals(arg0))
        {
            if (!(arg0 instanceof Apple)) return false;
            return size.equals(((Apple)arg0).size);
        } else
            return false;
    }

    public String toString()       // ��������������� ������ �������������� � ������
    {
        return super.toString() + " ������� '" + size.toUpperCase() + "'";
    }
}
