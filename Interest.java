public class Interest{
public static void main(String[] args){
	double principal;
	double rate;
	double duration;
	double maturity;
	double interest;



	principal=20000;
	rate=9.50;
	duration=3;
	interest=(principal*duration*rate)/3;
	maturity=interest+principal;


	System.out.println("Principal amount:"+ principal + "Rupees");
	System.out.println("Deposit for duration of"+ duration + "years");
	System.out.println("Interest rate:"+ rate + "%");
	System.out.println("Interest amount:"+ interest + "Rupees");
	System.out.println("Maturity amount:"+ maturity + "Rupees");
}

}