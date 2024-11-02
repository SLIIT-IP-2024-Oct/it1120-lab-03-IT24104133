import java.util.Scanner;
	public class IT24104133Lab3Q2 {
	public static void main(String[] args){

	double monthlysalary,OThours,OThourlyrate,OTamount,Totalsalary;

	Scanner input=new Scanner(System.in);

	System.out.println("Enter the monthly salary");
	monthlysalary=input.nextDouble();

	System.out.println("Enter the number of OT Hours");
	OThours=input.nextDouble();

	System.out.println("Enter the OT hourly rate");
	OThourlyrate=input.nextDouble();

	OTamount=OThours*OThourlyrate;
	Totalsalary=monthlysalary+OTamount;

	System.out.println("The total salary including OT is=" +Totalsalary);
	}
}

	
	
 