import java.util.Scanner;
	public class IT24104133Lab3Q4{
	public static void main(String[] args){

	int amount,count10000,count1000,count100,count10,count1;
	

	Scanner input=new Scanner(System.in);
	System.out.println("Enter your amound");
	amount=input.nextInt();
	
	
	count10000=amount/10000;
	amount=amount%10000;
	count1000=amount/1000;
	amount=amount%1000;
	count100=amount/100;
	amount=amount%100;
	count10=amount/10;
	amount=amount%10;
	count1=amount/1;

	System.out.print(" "+count10000);
	System.out.print(" "+count1000);
	System.out.print(" "+count100);
	System.out.print(" "+count10);
	System.out.print(" "+count1);
	}
}

	
	
	
	