package bsu.rfe.java.group6.lab1.ANNA.varB8;

/**
 * @author Anna_Kovalevskaja
 *
 */
public class ChewingGum extends Food {
	public ChewingGum(String flavours) {
//		super("ChewingGum");
	    super(flavours);
		this.flavours = flavours;
	}

	String flavours = null;

	/**
	 * @return the flavours
	 */
	public String getFlavours() {
		return flavours;
	}

	/**
	 * @param flavours the flavours to set
	 */
	public void setFlavours(String flavours) {
		this.flavours = flavours;
	}

	@Override
	public boolean equals(Object arg0) {
	  if (super.equals(arg0)) { 
		  if (!(arg0 instanceof ChewingGum)) return false; 
		  return true;
	  	} else  return false; 
	}


	@Override
	public String toString() {
		return "Element=" + super.toString();
	}

	@Override
	public double calculateCalories() {
        if(flavours.equals("����"))
        {
            return 15.0;
        }
        else if(flavours.equals("�����"))
        {
            return 20.0;
        }
        else if(flavours.equals("�����"))
        {
            return 25.0;
        }
        
     // ������ ������� ������ ��������
//      switch(flavours) {
//      case "����": 
//      	return 15.0;
//  	case "�����": 
//  		return 20.0;
//  	case "�����": 
//  		return 25.0;
//  	default: 
//  		return 0.0;
//      }
        
        
		return 0.0;
	}

}
