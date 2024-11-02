import java.util.Scanner;
 public class IT24104133Lab3Q1A {
	public static void main(String[] args){

	double pay,prize,rice;

	Scanner input=new Scanner(System.in);

	System.out.println("Enter the prize of 1kg of rice");
	prize=input.nextDouble();

	System.out.println("Enter the number of kilograms you want to buy");
	rice=input.nextDouble();

	pay=rice*prize;
	
	System.out.println("prize to pay = " +pay);
	}
}

	