/*
CS 278 
Lab 1
Author: Benjamin Nutter
1-30-19
*/
public class BarsMethods {
	
	public static int BarsRedeem(int barNum) {
		
		if (barNum < 0 )
			return 0; 
		
		if (barNum <=9)
			return 0;
		
		return 1 + BarsRedeem(barNum - 10 + 1);
		
	}
	
	public static int Bars(int dollar) {
		
		dollar = dollar + BarsRedeem(dollar);
		
		return dollar;
		
	}
	
	public static int BarsLoop(int totalAmount) {
		
		int barAmount = totalAmount;
		
		while (barAmount >= 10) {
			
			barAmount =  1 + barAmount - 10;
			
			totalAmount = totalAmount + 1;
	}

		
		
		return totalAmount;
		
	}
	
	public static double AvgCost(double givenValue) {
		
		givenValue = givenValue / Bars((int)givenValue);
		
		return givenValue;
		
	}
	 
	public static double newBarsFormula(double inputValue) {
		
		double outputValue = (1 + ((inputValue - 10 + 1) * 10))/5;
		
		return Math.ceil(outputValue);
		
	}
	 
	public static void main(String[]args) {
		
		
		  System.out.println("Output for original Bars method"); 
		
		  System.out.println(Bars(0));
		  
		  System.out.println(Bars(10));
		  
		  System.out.println(Bars(19));
		  
		  System.out.println(Bars(1000));
		  
		  System.out.println("Output for new Bars formula (Part 3 of Homework) ");
		  
		  System.out.println(newBarsFormula(0));
		 
		  System.out.println(newBarsFormula(10)); 
		  
		  System.out.println(newBarsFormula(19));
	 
		  System.out.println(newBarsFormula(1000) + "\n");
		
		  System.out.println("Answers for Part 1 of Homework");
		  
		  System.out.println(Bars(1000));
		  
		  System.out.println(Bars(1001));
		  
		  System.out.println(Bars(1002));
		  
		  System.out.println(Bars(1003));
		  
		  System.out.println(Bars(1004));
		  
		  System.out.println(Bars(1005));
		  
		  System.out.println(Bars(1006));
		 
		  System.out.println(Bars(1007));
		  
		  System.out.println(Bars(1008));
		  
		  System.out.println(Bars(1009) + "\n");
		  
		  System.out.println("Answers for Part 2 of Homework");
		  
		  System.out.println(BarsLoop(1000));
		  
		  System.out.println(BarsLoop(1001));
		  
		  System.out.println(BarsLoop(1002));
		  
		  System.out.println(BarsLoop(1003));
		  
		  System.out.println(BarsLoop(1004));
		  
		  System.out.println(BarsLoop(1005));
		  
		  System.out.println(BarsLoop(1006));
		  
		  System.out.println(BarsLoop(1007));
		  
		  System.out.println(BarsLoop(1008));
		  
		  System.out.println(BarsLoop(1009) + "\n");
		  
		  System.out.println("Answers for Part 4 of Homework");
		  
		  System.out.printf("%f", (AvgCost(1100)-0.9));
		  
		 System.out.println(AvgCost(19 + 9));
		
	}
	

}
