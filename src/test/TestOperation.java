package test;

public class TestOperation {

	public static void main(String[] args) {
		int myAge = 23;
		int techerAge = 38;
		
		boolean value = (myAge>25);
		System.out.println(value);
		
		System.out.println(myAge<=25);
		System.out.println(myAge == techerAge);
		
		char ch ;
		ch=(myAge>techerAge)?'T':'F';
		System.out.println(ch);

	}

}
