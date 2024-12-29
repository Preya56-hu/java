public class Ticket{
	public static void main(String[] args){

	int age=15;
	int ticket=0;
	float showtime=10;
	if((age>=13)){
		if((showtime>=10)){
			ticket=100;
		}
		else{
			ticket=50;
		}
	}
	else if((age<13)){
		if((showtime>=10)){
			ticket=60;
		}
		else{
			ticket=40;
		}
	}
	System.out.println("Customer Age:"+age);
	System.out.println("ShowTime:"+showtime);
	System.out.println("Ticket:"+ticket);

	}
}