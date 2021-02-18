import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UserDataRead{
	public static void main(String[] args ){
		String firstName, lastName, eMail, phone;
		
		String path = "C:\\Users\\Admin\\Documents\\Spring 2021\\Advanced Java\\ExceptionHandling\\ExceptionHandling\\src\\UserData.csv";
		ArrayList<User> users = new ArrayList<User>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line = br.readLine(); // done so first row of the file is not read
			while ((line = br.readLine()) != null) {
				String[] user = line.split(",");
				firstName = user[0]; 
				lastName = user[1];
				eMail = user[2];
				phone = user[3];
					
				users.add(new User(firstName, lastName, eMail, phone));
	
			}
			br.close();
		}catch(IOException e) {
			System.out.println("IOException has occured; stopping program.");
			return;
		}
		System.out.println("Printing users:\n");

		for(User u : users) {
			System.out.println(u.toString());
		}
	}
	
}
