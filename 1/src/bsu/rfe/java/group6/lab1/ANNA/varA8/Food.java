package bsu.rfe.java.group6.lab1.ANNA.varA8;

public class Food implements Consumable {
	public Food(String name) {
		super();
		this.name = name;
	}

	String name = null; 


	@Override
	public boolean equals(Object arg0) {
		  if (!(arg0 instanceof Food)) return false;   
		  if (name==null || ((Food)arg0).name==null) return false;   
		  return name.equals(((Food)arg0).name);  
	}

	@Override
	public String toString() {
		return name.toString();
	}

	@Override
	public void consume() {
		// TODO Автоматически созданная заглушка метода
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}



}

