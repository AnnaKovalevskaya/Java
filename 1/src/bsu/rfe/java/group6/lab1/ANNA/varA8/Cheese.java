package bsu.rfe.java.group6.lab1.ANNA.varA8;

public class Cheese extends Food {
	public Cheese() {
		super("���");
	}
	public void consume() {
		System.out.println(this + " ������");
	}
	// �������������� ����� equals() � ������ ������ �� �����, �.�. ��
	// �� ��������� ����� ����� ������, � ��������� �� ����������� ���� name
	// ��� ����������� � ������� ������
	// �������������� ����� toString() � ������ ������ �� �����, �.�. ��
	// �� ��������� ���������� ����� ������, � ������� ���� name ���
	// ���������� � ������ toString() �������� ������
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
