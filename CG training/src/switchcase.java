
public class switchcase {

	public static void main(String[] args) {
		int x = 10;
		 if (x == 10) 
		 { System.out.println("The value of x is 1"); } 
		 else if
		 (x== 5) 
		 {
		 System.out.println("The value of x is 2"); } 
		 else if (x == 9)
		 { 
		 System.out.println("The value of x is 3"); } 
		 else
		 {
		System.out.println("The value of x is other than 1,2,3"); 
		 }
		switch (x) 
		{
		case 1: 
		System.out.println("The value of x is 1");
		break;
		case 2:
		System.out.println("The value of x is 2");
		break;
		case 3:
		System.out.println("The value of x is 3");
		break;
		default:
		System.out.println("The value of x is other than 2,3");
		break;
		}
	}

	}

