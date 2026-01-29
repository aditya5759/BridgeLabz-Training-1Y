import java.util.Scanner;
class SwitchCaseExample {
	public static void main (String args[]){
		Scanner ab=new Scanner (System.in);
		int a;
		System.out.println("Enter a Number :");
		a= ab.nextInt();
		switch (a) {
			case 1: System.out.println("Hello Aryan !!");
			break;
			case 2: System.out.println("Hey Rajput G !!");
			break;
			default : System.out.println("Boliye na G !!");
		}
		ab.close();
		
	}
}
