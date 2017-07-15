import java.util.*;
class InputDemo{
public static void main(String a[]){
	System.out.println("Enter Number..");
	System.out.println("Enter Name..");
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	String name = scanner.next();
	System.out.println("Number is "+number);
	System.out.println("Name is "+name);
}
}
