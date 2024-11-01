import java.util.Scanner;
	public class IT24104133Lab3Q3{
	public static void main(String[] args){

	int amount,count5000notes,count1000notes,count500notes,count200notes,count100notes,count50notes,count20notes,count10notes,count05notes,count02notes,count01notes;
	

	Scanner input=new Scanner(System.in);
	System.out.println("Enter your amound");
	amount=input.nextInt();
	
	
	count5000notes=amount/5000;
	amount=amount%5000;
	count1000notes=amount/1000;
	amount=amount%1000;
	count500notes=amount/500;
	amount=amount%500;
	count200notes=amount/200;
	amount=amount%200;
	count100notes=amount/100;
	amount=amount%100;
	count50notes=amount/50;
	amount=amount%50;
	count20notes=amount/20;
	amount=amount%20;
	count10notes=amount/10;
	amount=amount%10;
	count05notes=amount/5;
	amount=amount%5;
	count02notes=amount/2;
	amount=amount%2;
	count01notes=amount/1;

	System.out.println("5000 Notes-" +count5000notes);
	System.out.println("1000 Notes-" +count1000notes);
	System.out.println("500 Notes-" +count500notes);
	System.out.println("200 Notes-" +count200notes);
	System.out.println("100 Notes-" +count100notes);
	System.out.println("50 Notes-" +count50notes);
	System.out.println("20 Notes-" +count20notes);
	System.out.println("10 Notes-" +count10notes);
	System.out.println("05 Notes-" +count05notes);
	System.out.println("02 Notes-" +count02notes);
	System.out.println("01 Notes-" +count01notes);
	}
}

	
	
	
	