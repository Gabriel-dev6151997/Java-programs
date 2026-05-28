import java.util.Scanner;
public class seatAllocation{
	public static void main(String[] args){
		Scanner allocate = new Scanner(System.in);
		// arrangement of names in an array
		String[] names = {"Gabriel", "Deng", "Ladu", "Nicodemus", "Ariana"};
		int allocateSeat;
		System.out.println("APPLY FOR A SEAT TICKET");
		allocateSeat = allocate.nextInt();
		//using switch statements to allocate seats
		switch(allocateSeat){
			case 0:
			System.out.println("Seat number 1 taken by: " + names[0]);
			break;
			
			case 1:
			System.out.println("Seat number 1 taken by: " + names[1]);
			break;
			
			case 2:
			System.out.println("Seat number 1 taken by: " + names[2]);
			break;
			
			case 3:
			System.out.println("Seat number 1 taken by: " + names[3]);
			break;
			
			case 4:
			System.out.println("Seat number 1 taken by: " + names[4]);
			break;
			
			default:
			System.out.println("Congrats! You have gotten a seat no: " + allocateSeat);
			}
			if(allocateSeat > 11){
				System.out.println("Hall Seats range from 1-10 chairs only");
				}
			
		//for(int allocateSeat = 0; allocateSeat < 5; allocateSeat++){
			//System.out.println("Seat no; " + allocateSeat + " taken by: " + names[allocateSeat]);
			//}
			
			allocate.close();
		//make sure you use a finally keyword with try	
			//finally{
				//closing scanner to avoid resource leaks
			//allocate.close();
				//}
		}
	}
