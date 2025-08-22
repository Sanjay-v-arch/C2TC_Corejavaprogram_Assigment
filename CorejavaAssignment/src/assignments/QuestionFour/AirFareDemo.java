package assignments.QuestionFour;
import java.util.Scanner;
public class AirFareDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c =sc.nextInt();
		int h=sc.nextInt();
		double p=sc.nextDouble();
		Airfare airfare = null;
		switch(c) {
		case 1:
			airfare=new AirIndia(h,p);
			break;
		case 2:
			airfare=new KingFisher(h,p);
			break;
		case 3:
			airfare=new Indigo(h,p);
			break;
		
		default:
			System.out.println("Invalid choice.");
			sc.close();
			return;
		}
		double amount = airfare.calculate();
		System.out.printf("%.2f\n", amount);
		sc.close();
		

	}

}
