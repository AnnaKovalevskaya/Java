package bsu.rfe.java.group6.lab1.ANNA.varA8;

public class ChewingGum extends Food {
	String flavours = null;

	public ChewingGum(String flavours) {
		super("����������� �������");
		this.flavours = flavours;
	}
	
	@Override
	public void consume() {
		System.out.println(this + " �������");
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
		if (super.equals(arg0)) { // ��� 1
			if (!(arg0 instanceof ChewingGum)) return false; // ��� 2
			return flavours.equals(((ChewingGum)arg0).flavours); // ��� 3
		} else
			return false;
	}
	
	public String toString() {
		return super.toString() + " �� ������ '" + flavours.toUpperCase() + "'";
	}

	@Override
	public String getName() {
		// TODO ������������� ��������� �������� ������
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO ������������� ��������� �������� ������
		super.setName(name);
	}

}