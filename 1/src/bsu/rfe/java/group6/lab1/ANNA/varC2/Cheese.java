package bsu.rfe.java.group6.lab1.ANNA.varC2;

public class Cheese extends Food {
	/* extends - ������ ����� �������� �����������
    ������� ������ */
	private Double calories = null;
	public Cheese()      // ����������� �������������
    {
        super("���");                      // �������� ����������� �������� ������
    }

    public Double calculateCalories()       // ���������� ������ �������� �������
    {
        calories = 30.0;
        return calories;
    }

    public void consume()           // ���������� ������ consume (��� ��������� � ��������)
    {
        System.out.println(this + " ������");
    }

}
