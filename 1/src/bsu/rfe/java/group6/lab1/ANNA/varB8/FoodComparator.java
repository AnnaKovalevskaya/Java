package bsu.rfe.java.group6.lab1.ANNA.varB8;

import java.util.Comparator; 

// ������
public class FoodComparator implements Comparator<Food> { 
    public int compare(Food arg0, Food arg1) {         
    	// ���� 1-�� ������ = null, �� �� ������ "������", �.�. ������������    
    	// � ����� �������    
    	if (arg0==null) return 1;    
    	// ���� 2-�� ������ = null, � 1-�� - ��� (�� ��������� ����������    
    	// �������), �� 1-�� ������ ������, �.�. ������������ � ������ �������    
    	if (arg1==null) return -1;    
    	// ���� ��� ������� �� null, �� ��������� ��������� ������������    
    	// ���������� �� name     
    	return arg0.getName().compareTo(arg1.getName());         
    }
}
