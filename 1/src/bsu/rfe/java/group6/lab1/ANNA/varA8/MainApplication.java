package bsu.rfe.java.group6.lab1.ANNA.varA8;

public class MainApplication {

	public static void main(String[] args) {
		  
		  Food[] breakfast = new Food[20];    
		  int itemsSoFar = 0;   
		  // ��������� ����������
		  for (String arg: args) 
		     {       
			  String[] parts = arg.split("/");    
			  if (parts[0].equals("ChewingGum")) { 
                  breakfast[itemsSoFar++] = new ChewingGum(parts[1]);
			  } 
			  else {
				  if (parts[0].equals("Cheese")) {
					breakfast[itemsSoFar++] = new Cheese();
				  } else
					if (parts[0].equals("Apple")) {
					breakfast[itemsSoFar++] = new Apple(parts[1]);
					}
			  }

		     }
		  System.out.println("����� ��������� ������� = " + itemsSoFar); 
		  // ������� ��������� ���������� ������� ���������� �� ������ ������� ���
		  int countAll = 0;
		  int countCheese = 0;
		  int countApple = 0;
		  int countChewingGum = 0;
		  for (Food item: breakfast) {     
			  if (item!=null) {  
				  item.consume();
				  countAll++;
				  System.out.println("Item " + item.getName());
				  if (item.getName().equals("���")) {
					  countCheese++;
				  }
				  if (item.getName().equals("������")) {
					  countApple++;
				  }
				  if (item.getName().equals("����������� �������")) {
					  countChewingGum++;
				  }
			  } else      
				  break;   
		  }
		  System.out.println("����� ����������� ������� = " + countChewingGum); 
		  System.out.println("����� ����� = " + countApple); 
		  System.out.println("����� ���� = " + countCheese); 
		  System.out.println("����� ���������."); 
	}

}
