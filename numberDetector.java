import java.util.Scanner;
public class numberDetector{
	public static void main(String[] args){
		//scanner object
		Scanner input = new Scanner(System.in);
		int data;
	    System.out.println("___________NUMBER DETECTION UTILITY___________");
	    System.out.println();
	    // while verifies the conditions which was already predefined and keeps the program running repeatedly
		while(true){
		  System.out.print("Insert your number: ");
		  data = input.nextInt(); //assigning scanner object
		  // note that % is a modulo, used for computation to find a remainder
		  // an even number wont give a remainder thats why the system will print the first line of code
		  // odd numbers have remainders, so it will print the else part and ignore the if part
		   if(data%2==0){ 
			 System.out.println("This is an even number");
			 System.out.println("Press 0 to exit");	
			 System.out.println();
			  }else{
				System.out.println("This is an odd number");
		        System.out.println("Press 0 to exit");	
				System.out.println();
				}
			if(data == 0){
				System.out.println("Exit Success!!!");
				break;
				}	
			}		
			
			
		}
	}
