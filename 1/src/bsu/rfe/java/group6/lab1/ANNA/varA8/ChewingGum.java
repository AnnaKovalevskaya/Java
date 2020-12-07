package bsu.rfe.java.group6.lab1.ANNA.varA8;

public class ChewingGum extends Food {
	String flavours = null;

	public ChewingGum(String flavours) {
		super("Жевательная резинка");
		this.flavours = flavours;
	}
	
	@Override
	public void consume() {
		System.out.println(this + " съедена");
	}

	public String getFlavours() {
		return flavours;
	}
	/**
	 * @param flavours the flavours to set
	 */
	public void setFlavours(String flavours) {
		this.flavours = flavours;
	}

	public boolean equals(Object arg0) {
		if (super.equals(arg0)) { // Шаг 1
			if (!(arg0 instanceof ChewingGum)) return false; // Шаг 2
			return flavours.equals(((ChewingGum)arg0).flavours); // Шаг 3
		} else
			return false;
	}
	
	public String toString() {
		return super.toString() + " со вкусом '" + flavours.toUpperCase() + "'";
	}

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