import java.util.Scanner;
public class studentRegister{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int options;
		int change = 0;
		String[] names = new String[100];
		String[] clas = new String[100];
		String[] age = new String[100];
		String[] sex = new String[100];
		names[0] = "Names";
		clas[0] = "Class";
		age[0] = "Age";
		sex[0] = "Sex";
		while(true){
		System.out.println("Choose the following: ");
		System.out.println("1. Add student 2. Browse list 3. Exit");
		//adding a text line
		options = input.nextInt();
		//adding next string line
		input.nextLine();
		switch(options){
			case 1:
			if(change >= 100) continue;
			System.out.print("Name: ");
			names[change] = input.nextLine();
			System.out.print("Class: ");
			clas[change] = input.nextLine();
			System.out.print("Age: ");
			age[change] = input.nextLine();
			System.out.print("Sex: ");
			sex[change] = input.nextLine();
			change++;
			break;
			
			case 2:
			for(int i=0; i<change; i++){
				System.out.println(names[i] + " - " + clas[i] + " - " + age[i] + "yrs" + " - " + sex[i]);
				}
			break;
			
			case 3: 
			break;
			
			default:
			System.out.println("Invalid input");
			}
			if(options==3){
				System.out.println("Program exited! ");
				break;
				}
		}
			
		}
	}
