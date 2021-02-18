import java.util.Scanner;

public class Driver {

	public static void main(String[] args){
		/*Employee emp = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first name, phone number, and age");
			String name = sc.next();
			String phone = sc.next();
			int age = sc.nextInt();
			sc.close();
			if (age < 0 ||age > 65) throw new InvalidEmployeeException();
			emp = new Employee(name, phone, age);
			System.out.println(emp.toString());
			
		}catch(InvalidEmployeeException iee){
			System.out.println("Too young or old");
		}*/
		
		MilitaryCadet mc = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter age and weight");
			int age = sc.nextInt();
			int weight = sc.nextInt();
			sc.close();
			if (age > 40) throw new InvalidMilitaryCadetException("Youre too old!\n");
			if (weight < 40) throw new InvalidMilitaryCadetException("Youre too skinny!\n");
			mc = new MilitaryCadet(age, weight);
			System.out.println(mc.toString());
			
		}catch(InvalidMilitaryCadetException badCadetEx){
			System.out.println(badCadetEx.getMessage()+"Bad luck");
		}
		
		

	}

}
