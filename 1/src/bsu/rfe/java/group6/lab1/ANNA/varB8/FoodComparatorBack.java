package bsu.rfe.java.group6.lab1.ANNA.varB8;

import java.util.Comparator; 
import bsu.rfe.java.group6.lab1.ANNA.varB8.ChewingGum;

// Ñþäýìà
public class FoodComparatorBack implements Comparator<Food> { 
	    public int compare(Food arg0, Food arg1) {           
	    	if (arg1==null) return -1;    
	    	if (arg0==null) return 1;    
	    	String valOfArg0 = String.valueOf(((ChewingGum)arg0).calculateCalories());
	    	String valOfArg1 = String.valueOf(((ChewingGum)arg1).calculateCalories());
	    	return valOfArg1.compareTo(valOfArg0);         
	    }
	}