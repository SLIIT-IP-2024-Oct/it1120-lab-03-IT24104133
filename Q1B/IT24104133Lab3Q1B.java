import java.util.Scanner;
 public class IT24104133Lab3Q1B {
	public static void main(String[] args){

	double pay,prize,rice,discount,PAdiscount;

	Scanner input=new Scanner(System.in);

	System.out.println("Enter the prize of 1kg of rice");
	prize=input.nextDouble();

	System.out.println("Enter the number of kilograms you want to buy");
	rice=input.nextDouble();

	pay=rice*prize;
	discount=pay*10/100;
	PAdiscount=(pay-discount);
	
	System.out.println("The total amount with 10% Discount is =" +PAdiscount);
	}
}

	