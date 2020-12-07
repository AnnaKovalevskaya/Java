/**
 * 
 */
package bsu.rfe.java.group6.lab1.ANNA.varB8;

import java.util.Arrays;

/**
 * @author Anna_Kovalevskaja
 *
 */
public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  Food[] breakfast = new Food[20];    
		  int itemsSoFar = 0;
		  boolean isCalories = false;
		  boolean isSort = false;
		   
		  for (String arg: args) 
		     {       
			  if (arg.startsWith("-")) 
			  { 
				  if (arg.equals("-calories"))  
		              isCalories = true;
				  else if (arg.equals("-sort")) 
					  isSort = true;
				  continue;
			  } 
			  
			  String[] parts = arg.split("/");    
			  if (parts[0].equals("ChewingGum")) { 
                breakfast[itemsSoFar++] = new ChewingGum(parts[1]);  
			  } 
		     }
		  
		  int countChewingGum = 0;
		  double sumColories = 0;
		  
		  if(isCalories) {		  
			  while (breakfast[countChewingGum]!=null)     
				  sumColories = sumColories + ((ChewingGum)breakfast[countChewingGum++]).calculateCalories();
			  System.out.println("Общая каллорийность = " + sumColories);
		  }
		  if(isSort) {		
			  System.out.println("==== Before sorting ");
			  printElements(breakfast);
			  Arrays.sort(breakfast, new FoodComparatorBack());
			  System.out.println("==== After sorting ");
			  printElements(breakfast);
		  }
		  System.out.println("End of programm");
	}

	public static void printElements(Food arg0[])
	{
		  int i = 0;
		  for (Food item: arg0)     
			  if (item!=null)     
				  System.out.println("Element[" + i++ + "] = " + ((ChewingGum)item).getFlavours());
			  else      
				  break;   
	}
}
