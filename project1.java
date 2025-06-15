package com.java.opps;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Project1 {
	 private List<String> selectedItems = new ArrayList<>();
	 private List<Integer> selectedQuantities = new ArrayList<>();
	 private List<Double> selectedPrices = new ArrayList<>();
	public void meth1()
	{
		System.out.println("Welcome to paradise Biryani Resutaurent");
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t\t 1. Menu");
		System.out.println("\t\t\t 2. Exit");
		System.out.println("Please Select Your Option :");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("\t\t\t ***Menu*** \n");
			String menuItems[]={"Starters","Noodles & Fried Rices","Biryani","Kebabs","Curries"};
			for(int i=0;i< menuItems.length;i++)
			{
				System.out.println("\t\t"+(i+1)+"."+menuItems[i]);
			}
			this.ViewMenu();
			break;
		case 2:
			System.out.println("\t\t Thank you for visiting....!");
			break;
		default:
			System.out.println("Please Enter Correct Option");
			break;
		}
	}
	public void ViewMenu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Select an item from menu List");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("\t\t\t\t\t\t ***Starters** \n");
			String Starters[]= {"Chilli Paneer      ","Baby Corn Manchurian","Gobi Manchurian      ","Veg Manchurian      ","chilli prawns      ","Apollo Fish      ","Chicken Drum Sticks","Chicken Manchurian","Chilli Chicken      ","Pepper Chicken      ","Chicken 65      "};
			double prices[]= {189,184,169,165,329,325,279,275,270,278,276};
			for(int i=0;i<Starters.length;i++)
			{
				System.out.println("\t"+(i+1)+". \t"+Starters[i]+"\t\t\t -------- \t"+"₹ "+prices[i]);
			}
			System.out.println("\t00. \t EXIT\n");
			System.out.println("Select an item in above list :");
			int n=sc.nextInt();
			this.Starters(n,sc,Starters,prices);
			break;
		case 2:
			System.out.println("\t\t\t\t\t\t ***Noodles & Fried Rices*** \n");
			String items[]= {"Veg.Soft Noodles","Veg.Fried Rice      ","Chicken Soft Noodles","Chicken Fried Rice","Egg Fried Rice      ","egg soft Noodles"};
			double prices_items[]= {159,156,169,166,155,139};
			for(int i=0;i<items.length;i++)
			{
				System.out.println("\t"+(i+1)+". \t"+items[i]+"\t\t\t --------- \t"+"₹ "+prices_items[i]);
			}
			System.out.println("\t00. \t EXIT\n");
			System.out.println("Select an item in above list :");
			int n1=sc.nextInt();
			this.Noodles(n1,sc,items,prices_items);
			break;
		case 3:
			System.out.println("\t\t\t\t\t\t ***Biryani*** \n");
			String items2[]= {"Veg. Biryani      ","Veg. Family pack","Egg Biryani      ","Chicken Biryani      ","Mutton Biryani      "};
			double prices_items2[]= {199,549,198,229,249};
			for(int i=0;i<items2.length;i++)
			{
				System.out.println("\t"+(i+1)+". \t"+items2[i]+"\t\t\t --------- \t"+"₹ "+prices_items2[i]);
			}
			System.out.println("\t00. \t EXIT\n");
			System.out.println("Select an item in above list :");
			int n2=sc.nextInt();
			this.Biryani(n2,sc,items2,prices_items2);
			break;
		case 4:
			System.out.println("\t\t\t\t\t\t ***Kebabs*** \n");
			String items3[]= {"Paneer Tikka Kebab","Chicken Tikka Kebaba","Tandoori Chicken(Full)","Mutton kebab      "};
			double prices_items3[]= {249,279,499,349};
			for(int i=0;i<items3.length;i++)
			{
				System.out.println("\t"+(i+1)+". \t"+items3[i]+"\t\t\t --------- \t"+"₹ "+prices_items3[i]);
			}
			System.out.println("\t00. \t EXIT\n");
			System.out.println("Select an item in above list :");
			int n3=sc.nextInt();
			this.Kebabs(n3,sc,items3,prices_items3);
			break;
		case 5:
			System.out.println("\t\t\t\t\t\t ***Curries*** \n");
			String items4[]= {"Palak Paneer      ","Kadai Paneer      ","Paneer Butter Masala","Butter Chicken Boneless","Tandoori Chicken Masala","Chicken Curry      ","Paradise Special Mutton"};
			double prices_items4[]= {189,188,186,299,298,245,319};
			for(int i=0;i<items4.length;i++)
			{
				System.out.println("\t"+(i+1)+". \t"+items4[i]+"\t\t\t --------- \t"+"₹ "+prices_items4[i]);
			}
			System.out.println("\t00. \t EXIT\n");
			System.out.println("Select an item in above list :");
			int n4=sc.nextInt();
			this.Curries(n4,sc,items4,prices_items4);
			break;
		default:
			System.out.println("Please enter correct number...!");
			break;
		}
	}
	private void Starters(int i,Scanner sc,String Starters[],double prices[])
	{
		if(i==0.0)
		{
			this.meth1();
		}
		else
		{
		System.out.println("How many Quantity of "+Starters[i-1]+" u want");
		int quantity=sc.nextInt();
		System.out.println(quantity+" Quantity of "+Starters[i-1]+" is taken");
		double result=quantity*prices[i-1];
		selectedQuantities.add(quantity);
		selectedItems.add(Starters[i-1]);
		selectedPrices.add(prices[i-1]);
		System.out.println("Current bill is = "+result);
		this.meth2(sc);
		}
	}
	private void Noodles(int i,Scanner sc,String items[],double prices_items[])
	{
		if(i==0.0)
		{
			this.meth1();
		}
		else
		{
			System.out.println("How many Quantity of "+items[i-1]+" u want");
			int quantity=sc.nextInt();
			System.out.println(quantity+" Quantity of "+items[i-1]+" is taken");
			double result=quantity*prices_items[i-1];
			selectedQuantities.add(quantity);
			selectedItems.add(items[i-1]);
			selectedPrices.add(prices_items[i-1]);
			System.out.println("Current bill is = "+result);
			this.meth3(sc);
		}
	}
	private void Biryani(int i,Scanner sc,String items2[],double prices_items2[])
	{
		if(i==0.0)
		{
			this.meth1();
		}
		else
		{
			System.out.println("How many Quantity of "+items2[i-1]+" u want");
			int quantity=sc.nextInt();
			System.out.println(quantity+" Quantity of "+items2[i-1]+" is taken");
			double result=quantity*prices_items2[i-1];
			selectedQuantities.add(quantity);
			selectedItems.add(items2[i-1]);
			selectedPrices.add(prices_items2[i-1]);
			System.out.println("Current bill is = "+result);
			this.meth4(sc);
		}
	}
	private void Kebabs(int i,Scanner sc,String items3[],double prices_items3[])
	{
		if(i==0.0)
		{
			this.meth1();
		}
		else
		{
			System.out.println("How many Quantity of "+items3[i-1]+" u want");
			int quantity=sc.nextInt();
			System.out.println(quantity+" Quantity of "+items3[i-1]+" is taken");
			double result=quantity*prices_items3[i-1];
			selectedQuantities.add(quantity);
			selectedItems.add(items3[i-1]);
			selectedPrices.add(prices_items3[i-1]);
			System.out.println("Current bill is = "+result);
			this.meth5(sc);
		}
	}
	private void Curries(int i,Scanner sc,String items4[],double prices_items4[])
	{
		if(i==0.0)
		{
			this.meth1();
		}
		else
		{
			System.out.println("How many Quantity of "+items4[i-1]+" u want");
			int quantity=sc.nextInt();
			System.out.println(quantity+" Quantity of "+items4[i-1]+" is taken");
			double result=quantity*prices_items4[i-1];
			selectedQuantities.add(quantity);
			selectedItems.add(items4[i-1]);
			selectedPrices.add(prices_items4[i-1]);
			System.out.println("Current bill is = "+result);
			this.meth6(sc);
		}
	}
	public void meth2(Scanner sc)
	{
		System.out.println("\t\t\t\t\t\t ***Starters** \n");
		String Starters[]= {"Chilli Paneer      ","Baby Corn Manchurian","Gobi Manchurian      ","Veg Manchurian      ","chilli prawns      ","Apollo Fish      ","Chicken Drum Sticks","Chicken Manchurian","Chilli Chicken      ","Pepper Chicken      ","Chicken 65      "};
		double prices[]= {189,184,169,169,329,329,279,279,279,279,279};
		for(int i=0;i<Starters.length;i++)
		{
			System.out.println("\t"+(i+1)+". \t"+Starters[i]+"\t\t\t -------- \t"+"₹ "+prices[i]);
		}
		System.out.println("\t00. \t EXIT\n");
		System.out.println("Please Select an item if u want or exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			this.Starters(choice, sc, Starters, prices);
			break;
		case 2:
			this.Starters(choice, sc, Starters, prices);
			break;
		case 3:
			this.Starters(choice, sc, Starters, prices);
			break;
		case 4:
			this.Starters(choice, sc, Starters, prices);
			break;
		case 5:
			this.Starters(choice, sc, Starters, prices);
			break;
		case 6:
			this.Starters(choice, sc, Starters, prices);
			break;
		case 7:
			this.Starters(choice, sc, Starters, prices);
			break;
		case 8:
			this.Starters(choice, sc, Starters, prices);
			break;
		case 9:
			this.Starters(choice, sc, Starters, prices);
			break;
		case 10:
			this.Starters(choice, sc, Starters, prices);
			break;
		case 11:
			this.Starters(choice, sc, Starters, prices);
			break;
		case 00:
			this.meth1();
			break;
		default:
			System.out.println("Please enter a valid number....!");
			this.meth2(sc);
			break;
				
		}	
	}
	public void meth3(Scanner sc)
	{
		System.out.println("\t\t\t\t\t\t ***Noodles & Fried Rices*** \n");
		String items[]= {"Veg.Soft Noodles","Veg.Fried Rice      ","Chicken Soft Noodles","Chicken Fried Rice","Egg Fried Rice      ","egg soft Noodles"};
		double prices_items[]= {159,159,169,169,159,139};
		for(int i=0;i<items.length;i++)
		{
			System.out.println("\t"+(i+1)+". \t"+items[i]+"\t\t\t --------- \t"+"₹ "+prices_items[i]);
		}
		System.out.println("\t00. \t EXIT\n");
		System.out.println("Select an item in above list :");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			this.Noodles(choice, sc, items, prices_items);
			break;
		case 2:
			this.Noodles(choice, sc, items, prices_items);
			break;
		case 3:
			this.Noodles(choice, sc, items, prices_items);
			break;
		case 4:
			this.Noodles(choice, sc, items, prices_items);
			break;
		case 5:
			this.Noodles(choice, sc, items, prices_items);
			break;
		case 6:
			this.Noodles(choice, sc, items, prices_items);
			break;
		case 00:
			this.meth1();
			break;
		default:
			System.out.println("Please enter a valid number....!");
			this.meth2(sc);
			break;
				
		}	
	}
	public void meth4(Scanner sc)
	{
		System.out.println("\t\t\t\t\t\t ***Biryani*** \n");
		String items2[]= {"Veg. Biryani      ","Veg. Family pack","Egg Biryani      ","Chicken Biryani      ","Mutton Biryani      "};
		double prices_items2[]= {199,549,199,229,249};
		for(int i=0;i<items2.length;i++)
		{
			System.out.println("\t"+(i+1)+". \t"+items2[i]+"\t\t\t --------- \t"+"₹ "+prices_items2[i]);
		}
		System.out.println("\t00. \t EXIT\n");
		System.out.println("Select an item in above list :");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			this.Biryani(choice, sc, items2, prices_items2);
			break;
		case 2:
			this.Biryani(choice, sc, items2, prices_items2);
			break;
		case 3:
			this.Biryani(choice, sc, items2, prices_items2);
			break;
		case 4:
			this.Biryani(choice, sc, items2, prices_items2);
			break;
		case 5:
			this.Biryani(choice, sc, items2, prices_items2);
			break;
		case 00:
			this.meth1();
			break;
		default:
			System.out.println("Please enter a valid number....!");
			this.meth4(sc);
			break;
				
		}	
	}
	public void meth5(Scanner sc)
	{
		System.out.println("\t\t\t\t\t\t ***Kebabs*** \n");
		String items3[]= {"Paneer Tikka Kebab","Chicken Tikka Kebaba","Tandoori Chicken(Full)","Mutton kebab      "};
		double prices_items3[]= {249,279,499,349};
		for(int i=0;i<items3.length;i++)
		{
			System.out.println("\t"+(i+1)+". \t"+items3[i]+"\t\t\t --------- \t"+"₹ "+prices_items3[i]);
		}
		System.out.println("\t00. \t EXIT\n");
		System.out.println("Select an item in above list :");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			this.Kebabs(choice, sc, items3, prices_items3);
			break;
		case 2:
			this.Kebabs(choice, sc, items3, prices_items3);
			break;
		case 3:
			this.Kebabs(choice, sc, items3, prices_items3);
			break;
		case 4:
			this.Kebabs(choice, sc, items3, prices_items3);
			break;
		case 00:
			this.meth1();
			break;
		default:
			System.out.println("Please enter a valid number....!");
			this.meth5(sc);
			break;
				
		}	
	}
	public void meth6(Scanner sc)
	{
		System.out.println("\t\t\t\t\t\t ***Curries*** \n");
		String items4[]= {"Palak Paneer      ","Kadai Paneer      ","Paneer Butter Masala","Butter Chicken Boneless","Tandoori Chicken Masala","Chicken Curry      ","Paradise Special Mutton"};
		double prices_items4[]= {189,189,189,299,299,245,319};
		for(int i=0;i<items4.length;i++)
		{
			System.out.println("\t"+(i+1)+". \t"+items4[i]+"\t\t\t --------- \t"+"₹ "+prices_items4[i]);
		}
		System.out.println("\t00. \t EXIT\n");
		System.out.println("Select an item in above list :");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			this.Curries(choice, sc, items4, prices_items4);
			break;
		case 2:
			this.Curries(choice, sc, items4, prices_items4);
			break;
		case 3:
			this.Curries(choice, sc, items4, prices_items4);
			break;
		case 4:
			this.Curries(choice, sc, items4, prices_items4);
			break;
		case 5:
			this.Curries(choice, sc, items4, prices_items4);
			break;
		case 6:
			this.Curries(choice, sc, items4, prices_items4);
			break;
		case 7:
			this.Curries(choice, sc, items4, prices_items4);
			break;
		case 00:
			this.meth1();
			break;
		default:
			System.out.println("Please enter a valid number....!");
			this.meth6(sc);
			break;
				
		}	
	}
	public void FinalBill()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\t\t\t ***Final Bill*** \n");
		System.out.println("Enter customer Name :");
		String name=sc.nextLine();
		System.out.println("Enter Phone number :");
		Long num=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Address :    ");
		String address=sc.nextLine();
		System.out.println("==============================================================================================");
		LocalDateTime now=LocalDateTime.now();
		DateTimeFormatter formater=DateTimeFormatter.ofPattern("EEEE,MMMM dd,yyyy HH:mm:ss");
		String formattedDateTime = now.format(formater);
	    System.out.println("Date and Time: " + formattedDateTime+"\n");
	    System.out.println("\t\t\t Items    \t\t\t Quantities \t\t prices \n");
		double totalBill=0.0;
		for(int i=0;i< selectedItems.size();i++)
		{
			double itemBill=(selectedPrices.get(i)*selectedQuantities.get(i));
			System.out.println("\t\t"+selectedItems.get(i) + " \t   X \t\t "+selectedQuantities.get(i) +"\t\t\t = ₹ "+itemBill);
			totalBill = totalBill +itemBill;
		}
		System.out.println("===============================================================================================");
		System.out.println("\n \t\t\t Total Amount  :      \t\t\t\t\t = ₹ " + totalBill+"\n");
		System.out.println("\t\t\t\t ****Customer Details**** \n");
		System.out.println("\t\t\t Customer Name : "+name);
		System.out.println("\n\t\t\t Phone Number : "+num);
		System.out.println("\n\t\t\t Address  : "+address);
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("\n\n\t\t\t\t Thank you for visiting..............!");
		sc.close();
	}

	public static void main(String[] args) 
	{
		Project1 obj=new Project1();
		obj.meth1();
		obj.FinalBill();
	}
}
