package bsu.rfe.java.group6.lab1.ANNA.varA8;

public class MainApplication {

	public static void main(String[] args) {
		  
		  Food[] breakfast = new Food[20];    
		  int itemsSoFar = 0;   
		  // обработка аргументов
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
		  System.out.println("Всего продуктов съедено = " + itemsSoFar); 
		  // подсчет количетва жевателной резинки полученной из списка классов еды
		  int countAll = 0;
		  int countCheese = 0;
		  int countApple = 0;
		  int countChewingGum = 0;
		  for (Food item: breakfast) {     
			  if (item!=null) {  
				  item.consume();
				  countAll++;
				  System.out.println("Item " + item.getName());
				  if (item.getName().equals("Сыр")) {
					  countCheese++;
				  }
				  if (item.getName().equals("Яблоко")) {
					  countApple++;
				  }
				  if (item.getName().equals("Жевательная резинка")) {
					  countChewingGum++;
				  }
			  } else      
				  break;   
		  }
		  System.out.println("Всего жевательной резинки = " + countChewingGum); 
		  System.out.println("Всего яблок = " + countApple); 
		  System.out.println("Всего сыра = " + countCheese); 
		  System.out.println("Финиш программы."); 
	}

}
