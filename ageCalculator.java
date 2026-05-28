import java.util.Scanner;
public class ageCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int birthYear;
		System.out.println("AGE CALCULATOR PROGRAM");
		System.out.println();
		while(true){
			System.out.print("Enter your birth year: ");
			birthYear = input.nextInt();
			int operation = 2026 - birthYear;
			if(birthYear <= 1900 || birthYear >= 2027){
				if(birthYear == 0){
				System.out.println("Program exited successfully");
				break;
				}
				System.out.println("Enter an invalid birth year please");
				System.out.println("EXIT: 0");
				System.out.println();
				}else if(operation > 15 && operation < 18){
					System.out.println("You are " + operation + "yrs old");
					System.out.println("You are a young adult");
					System.out.println("EXIT: 0");
					System.out.println();
					}else{
						System.out.println("You are " + operation + "yrs old");
						System.out.println("You are an adult");
				        System.out.println("EXIT: 0");
						System.out.println();
						}
			}
			
			//theres a mole in here
			//bug report for ages less than 15, it prints comment "You are an adult"......
		}
	}
