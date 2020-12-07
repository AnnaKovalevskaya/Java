package bsu.rfe.java.group6.lab1.ANNA.varC2;
import java.lang.reflect.Constructor;
import java.util.*;
public class Breakfast {
	public static void main(String[] args) throws Exception 
	{
		for (String arg: args) {
			String[] parts = arg.split(("/"));
			if (parts[0].equals("-calories")) {
		      // calculate  and print whole calories of breakfast
			breakfast();
			} else
			if (parts[0].equals("-sort")) {
			// � ������ � 1 ��������, ������� ��������� � parts[1]
			breakfast[itemsSoFar] = new Apple(parts[1]);
			}

			}
			// ������� 
//		Food[] breakfast = new Food[20];
//		int i = 0;
//		boolean var1, var2;         // ������ ��� ���� ����������, ������������ � ������
//        var1 = var2 = false;
//        
//        for (String arg : args)          // �������� �� ������������ ����������
//        {
//        	String[] parts = arg.split(("/")); //��������� ��������� ��� ������
//            // split - ���������� ������ � ������, ����� �� �� �����������
//            try 
//            {
//                Class myClass = Class.forName("1" + parts[0]);
//                if (parts.length == 1) {                               //���� ���������� 1 �������� (��� ������)
//                    Constructor constructor = myClass.getConstructor();
//                    breakfast[i] = (Food) constructor.newInstance();
//                    i++;
//                } else if (parts.length == 2) {                      //���� ���������� 2 ��������(��� ������ + ����)
//                    Constructor constructor = myClass.getConstructor(String.class);
//                    breakfast[i] = (Food) constructor.newInstance(parts[1]);
//                    i++;
//                } else if (parts.length == 3) {                           //���� ���������� 3 ���������(��� ������ + 2 ����)
//                    Constructor constructor = myClass.getConstructor(String.class, String.class);
//                    breakfast[i] = (Food) constructor.newInstance(parts[1], parts[2]);
//                    i++;
//                }
//            } catch (ClassNotFoundException e)     // ����������, ���� ��������� ����� �� ������
//            {
//                switch (parts[0])
//                {
//                    case "-sort":            // ���� ��������� -sort, ������ ����� ����� ������������� �������� ��������
//                        var1 = true;
//                        break;
//                    case "-calories":       // ���� ��������� -calories, ������ ����� ����� ��������� ����������� ��������
//                        var2 = true;
//                        break;
//                    default:
//                        System.out.println("����� " + parts[0] + " �� ������.");
//                        break;
//                }
//
//            }
//            catch (NoSuchMethodException e) // ����������, ���� ����� ������ �� ������ (� ������� �����������)
//            {
//                System.out.println("����� ������ " + parts[0] + " �� ��� ������.");
//            }
//        }
//		
//        System.out.println("�������: "); //������� ������� �����,����� �� ��� �������������
//        for (Food item : breakfast) {
//            if (item != null)
//            {
//                if (item.calculateCalories()==0.0)  // ���� ����� �������, ������� �� ������������ � ���������
//                {
//                    System.out.print("����� ������� �� ������������ (" + item.name);
//                    if(item.par1!=null)
//                        System.out.print(", " + item.par1);
//                    if(item.par2!=null)
//                        System.out.print(", " + item.par2);
//                    System.out.println(")");
//                    continue;
//                }
//                item.consume();
//                System.out.println(" " + item.calculateCalories());
//            } else {
//                break;
//            }
//        }
//        if (var1)
//        {                //������ "ClassNotFoundException", ����� �� ������ �������� -sort
//            Arrays.sort(breakfast, new Comparator() {
//                public int compare(Object o1, Object o2)
//                {
//                    if (o1 == null || ((Food)o1).name.length() < ((Food)o2).name.length())
//                       return 1;
//                    if (o2 == null || ((Food)o1).name.length() > ((Food)o2).name.length())
//                        return -1;
//                    else return 0;
//                }
//            });
//
//            System.out.println("������� (��������������� �������):");
//            for (Food item : breakfast)
//            {
//                if (item != null)
//                {
//                    if (item.calculateCalories()==0.0)
//                        continue;
//                    item.consume();
//                    System.out.println(" " + item.calculateCalories());
//                }
//                else
//                    break;
//            }
//        }
//        
//        if (var2)
//        {                            //������ "ClassNotFoundException", ����� �� ������ ������� -calories
//            double CaloriesCounter = 0.0;
//            for (Food item : breakfast)
//            {
//                if (item != null)
//                    CaloriesCounter += item.calculateCalories();
//                else
//                    break;
//            }
//            System.out.println("����� ���������� �������: " + CaloriesCounter);
//
//        }
//        int eatten_a1, eatten_a2, eatten_a3, eatten_c, eatten_k1, eatten_k2, eatten_k3, eatten_k4;
//        eatten_a1 = eatten_a2 = eatten_a3 = eatten_c = eatten_k1 = eatten_k2 = eatten_k3 = eatten_k4 = 0;
//        for(Food item: breakfast)                            // �������, ������� ���� ���� ������� �� �������
//        {
//            if(item == null)
//                break;
//            if(item.name.equals("������"))
//            {
//                if(item.par1.equals("���������"))
//                    eatten_a1++;
//                else if(item.par1.equals("�������"))
//                    eatten_a2++;
//                else if(item.par1.equals("�������"))
//                    eatten_a3++;
//            }
//            if(item.name.equals("���"))
//                eatten_c++;
//            if(item.name.equals("��������"))
//            {
//                if(item.par1.equals("���"))
//                {
//                    if(item.par2.equals("�����"))
//                        eatten_k1++;
//                    if(item.par2.equals("����"))
//                        eatten_k2++;
//                }
//                if(item.par1.equals("����"))
//                {
//                    if(item.par2.equals("�����"))
//                        eatten_k3++;
//                    if(item.par2.equals("����"))
//                        eatten_k4++;
//                }
//            }
//        }
//        System.out.println("�� ������� �������:");
//        System.out.println(" ��������� ����� - " + eatten_a1 + ", ������� ����� - " + eatten_a2 + ", ������� ����� - " + eatten_a3);
//        System.out.println(" �������� ���� - " + eatten_c);
//        System.out.println(" �������� � ����� � ������ - " + eatten_k1);
//        System.out.println(" �������� � ����� � ����� - " + eatten_k2);
//        System.out.println(" �������� � ����� � ������ - " + eatten_k3);
//        System.out.println(" �������� � ����� � ����� - " + eatten_k4);
//    }
	
	void breakfast()
	{
	}
	}
}
