package bsu.rfe.java.group6.lab1.ANNA.varC2;

public class Cocktail extends Food{
    private Double calories = null;
	
	public Cocktail(String drink, String fruit) 
	{
		super("Коктейль");
		par1 = drink;
		par2 = fruit;
	}
	public boolean equals(Object arg0)  // переопределние метода сравнения
    {
        if (super.equals(arg0))
        {
            if (!(arg0 instanceof Cocktail)) return false;
            if (!(par1.equals(((Cocktail)arg0).par1))) return false;
            return par2.equals(((Cocktail)arg0).par2);
        } else
            return false;
    }
	public Double calculateCalories()       // реализация метода подсчета калорий
    {
        calories=0.0;
        if(!par1.equals("сок") && !par1.equals("кола"))
            return calories;
        if(!par2.equals("вишня") && !par2.equals("мята"))
            return calories;
        if(par1.equals("сок"))
        {
            calories += 40.0;
        }
        if(par1.equals("кола"))
        {
            calories += 70.0;
        }
        if(par2.equals("вишня"))
        {
            calories += 25.0;
        }
        if(par2.equals("мята"))
        {
            calories += 20.0;
        }
        return calories;
    }
	public String getFilling1()         // возвращает напиток
    {
        return par1;
    }
    public String getFilling2()           // возвращает фрукт
    {
        return par2;
    }
	
	public String toString()       // переопределение метода преобразования в строку
    {
		return super.toString() + " c начинкой: " + par1 + " и " + par2;
    }
    public void consume()            // реализация метода consume (что произошло с объектом)
    {
        System.out.println(this + " выпит");
    }
	
}
