/**
 * 
 */
package bsu.rfe.java.group6.lab1.ANNA.varB8;

/**
 * @author Anna_Kovalevskaja
 *
 */
public class Food implements Nutritious {
	public Food(String name) {
		super();
		this.name = name;
	}

	String name = null; 

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public double calculateCalories() {
		return 0;
	}


}
