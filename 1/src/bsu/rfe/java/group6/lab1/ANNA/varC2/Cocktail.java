package bsu.rfe.java.group6.lab1.ANNA.varC2;

public class Cocktail extends Food{
    private Double calories = null;
	
	public Cocktail(String drink, String fruit) 
	{
		super("��������");
		par1 = drink;
		par2 = fruit;
	}
	public boolean equals(Object arg0)  // �������������� ������ ���������
    {
        if (super.equals(arg0))
        {
            if (!(arg0 instanceof Cocktail)) return false;
            if (!(par1.equals(((Cocktail)arg0).par1))) return false;
            return par2.equals(((Cocktail)arg0).par2);
        } else
            return false;
    }
	public Double calculateCalories()       // ���������� ������ �������� �������
    {
        calories=0.0;
        if(!par1.equals("���") && !par1.equals("����"))
            return calories;
        if(!par2.equals("�����") && !par2.equals("����"))
            return calories;
        if(par1.equals("���"))
        {
            calories += 40.0;
        }
        if(par1.equals("����"))
        {
            calories += 70.0;
        }
        if(par2.equals("�����"))
        {
            calories += 25.0;
        }
        if(par2.equals("����"))
        {
            calories += 20.0;
        }
        return calories;
    }
	public String getFilling1()         // ���������� �������
    {
        return par1;
    }
    public String getFilling2()           // ���������� �����
    {
        return par2;
    }
	
	public String toString()       // ��������������� ������ �������������� � ������
    {
		return super.toString() + " c ��������: " + par1 + " � " + par2;
    }
    public void consume()            // ���������� ������ consume (��� ��������� � ��������)
    {
        System.out.println(this + " �����");
    }
	
}
