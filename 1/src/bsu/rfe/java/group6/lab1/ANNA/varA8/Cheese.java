package bsu.rfe.java.group6.lab1.ANNA.varA8;

public class Cheese extends Food {
	public Cheese() {
		super("Сыр");
	}
	public void consume() {
		System.out.println(this + " съеден");
	}
	// Переопределять метод equals() в данном классе не нужно, т.к. он
	// не добавляет новых полей данных, а сравнение по внутреннему полю name
	// уже реализовано в базовом классе
	// Переопределять метод toString() в данном классе не нужно, т.к. он
	// не добавляет внутренних полей данных, а возврат поля name уже
	// реализован в версии toString() базового класса
	@Override
	public String getName() {
		// TODO Автоматически созданная заглушка метода
		return super.getName();
	}
	@Override
	public void setName(String name) {
		// TODO Автоматически созданная заглушка метода
		super.setName(name);
	}
}
