//class and object oriented programming
import java.util.Scanner;
class table{
	public String frame(){
	System.out.println("A design of a table");
	return "r";
	}
	//using loops
	public int tableCloth(){
		System.out.println("10 cm long please");
		return 0;
		
	}
	
}
class school{
	public String rooms(){
		System.out.println("There are around 10 class rooms at our school");
		boolean roomsIn = false;
		for(int i=1; i<3; i++){
			if(roomsIn){
				System.out.println("Bro is studying physics for the test");
			}else{
				System.out.println("Bro didnt come to school today");
			}	
		}
		return "S.2 class";	
	}
}

public class detail {
	public static void main(String[] args){
		//Scanner myScan = new Scanner(System.in);
		//int numDice;
		//int total;
		//String info = "Enter your digit here: ";
		//System.out.println(info);
		//numDice = myScan.nextInt();
		//if(numDice > 0){
			//System.out.println();
		//}else{
			//System.out.print("Only positive figures allowed please");
		//}
		System.out.println("Homer");
		//days of the week
		int days = 5;
		switch(days){
		case 0:
			System.out.println("Monday");
		break;
		case 1:
			System.out.println("Tuesday");
		break;
		case 2:
			System.out.println("Wednesday");
		break;
		case 3:
			System.out.println("Thursday");
		break;
		case 4:
			System.out.println("Friday");
		break;
		case 5:
			System.out.println("Saturday");
		break;
		default:
			System.out.println("Sunday");
		
		}
		// simple multiplication table.
		System.out.println("Multiples of 14");
		for(int i=1; i<=12; i++){
			System.out.println(14*i);
		}
		for(int i=1; i<3; i++){
			System.out.println("Mathematics is a simple subject");		
		}
		
		//big multiples
		//nested loops
		for(int i=1; i<=12; i++){
			System.out.println("Multiples of " + i); //this code runs once after every full execution of the nested for loop
			for(int j=1; j<=12; j++){
				System.out.println(j*i); //runs fully after a single execution of first code
			}
		}
		int variableAssigned = 17;
		int produce = 0;
		produce = variableAssigned%2==0 ? variableAssigned : variableAssigned;
		System.out.println("The Value assigned is: " + produce);
		//? is to ask whether the operation is true or false
		// : is to now compare the release of results for the question
		// ?: ternary operation
		if(variableAssigned%2==0){
			System.out.println("This is an even number"); //prints when operation detected modulus is even
			}else{
				System.out.println("This is an odd number"); //prints when operation detected modulus is odd
				}
		//creating an object from class table
		table tool = new table();
		int furniture = tool.tableCloth();
		System.out.println(furniture);
		String furnitureOne = tool.frame(); //return variable must always be aligned to the method assigned
		System.out.println(furnitureOne);
	
		//creating an object for the school class
		school classRoom = new school(); // calls return string also
		String inspection = classRoom.rooms();
		System.out.println(inspection);
		classRoom.rooms(); //doesn't call the return string
		
		//forming a scanner ;object
		Scanner noAnalyst = new Scanner(System.in);
		int nums;
		System.out.print("Enter a range of figures please: ");
		nums = noAnalyst.nextInt();
		for(int i=1; i<3; i++){
			if(nums<=20){
				System.out.println("You win!!!");
			}else{
				System.out.println("Try again later!");
			}
		}
		
		
	}
}
