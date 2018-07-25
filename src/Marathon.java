
public class Marathon {

	static int athletes;
	int bibNumber;
	String name;
	int speed;
	static final String location = "California";

	public static void main(String[] args) {

		Marathon jerry = new Marathon("Jerry", 5);
		Marathon sally = new Marathon("Sally", 7);
		Marathon larry = new Marathon("Larry", 8);
		System.out.println(Marathon.location);
		System.out.println("athlete "+ jerry.bibNumber  +" is "+ jerry.name +" and his speed is "+ jerry.speed+"mph");
		System.out.println("athlete "+sally.bibNumber+ " is "+ sally.name +" and his speed is "+ sally.speed+"mph");
		System.out.println("athlete "+larry.bibNumber+" is " +larry.name +" and his speed is "+ larry.speed+"mph");
		System.out.println("there are "+ athletes+ " athletes");
		
	}

	public Marathon(String name, int speed) {
		this.name = name;
		this.speed = speed;
		athletes++ ;
		bibNumber = athletes; 
	}

}
