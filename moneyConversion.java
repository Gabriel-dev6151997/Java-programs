import java.util.Scanner;
import java.text.DecimalFormat;

public class moneyConversion{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int choose;
		double amount;
		double dollar, pound;
		DecimalFormat f = new DecimalFormat("##.##");
		System.out.println("MONEY CONVERSION UTILITY");
		System.out.println();
		while(true){
			System.out.println("Choose the following: ");
		    System.out.println("1 - Dollar to Pounds");
		    System.out.println("2 - Pounds to Dollars");
		    System.out.println();
			System.out.print("Enter your option: ");
			choose = input.nextInt();
			System.out.println("Enter amount: ");
			amount = input.nextFloat();
			switch(choose){
				case 1:
				//dollar to pounds
				dollar = amount * 6300;
				System.out.println(amount + "$ equals to " + f.format(dollar) + "SSPs");
				System.out.println();
				break;
				case 2:
				//pounds to dollar
				pound = amount/6300;
				System.out.println(amount + "SSPs equals to " + f.format(pound) + "$");
				System.out.println();
				break;
				default:
				System.out.println("Invalid Input");
				System.out.println();
				}
			}
		}
	}
