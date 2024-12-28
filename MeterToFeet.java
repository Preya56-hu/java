import java.util.Scanner;
public class MeterToFeet{
	public static void main(String[]args){
	Scanner SC=new Scanner(System.in);
	System.out.println("enter value of meter");
	int meter=SC.nextInt();
	
	System.out.println(meter*3.28);
	System.out.println("enter value of feet");
	double feet=SC.nextDouble();
	
	System.out.println(feet/3.28);
	}
}