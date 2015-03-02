package quiz2;

import java.util.Scanner;

public class TotalCostOfTuition {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("please input initial tuition: ");
		double Tuition = (input.nextDouble());
		Double TotalTuition = Tuition;
		
		for (int i = 2; i < 5; i++){
			System.out.print("input the percentage increase");
			double PercentageIncrease = (input.nextDouble())/100;
			Tuition += Tuition*PercentageIncrease;
			TotalTuition += Tuition;
			System.out.println("your Total Tuition after year " + i + " is " + TotalTuition);
		}
	
		
		System.out.printf("Total college tuition is %3.2f", TotalTuition);
		
		input.close();
	}
}
