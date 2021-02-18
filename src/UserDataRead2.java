import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UserDataRead2 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Admin\\Documents\\Spring 2021\\Advanced Java\\ExceptionHandling\\ExceptionHandling\\src\\UserData.csv";		
		File f = new File(path);
		
		// if file does not exits then throws exception and do nothing else
		if(!f.exists()) {
			throw new IOException("This file does not exits.");
		} 
		
		// else continue running the program
		else {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = br.readLine(); // This is done so the first row is not  added to the array list
			//System.out.println(line); // add if you want to display the first row of the file
			
			String firstName, lastName, eMail, phone;
			ArrayList<User> users = new ArrayList<User>();
			
			while((line = br.readLine())!=null) {
				String[] s = line.split(","); // to store contents of the file
				firstName = s[0];
				lastName = s[1];
				eMail = s[2];
				phone = s[3];
				
				users.add(new User(firstName, lastName, eMail, phone)); 
			}
			br.close();
			System.out.println("Printing users:\n");
			
			for(User u:users) {
				System.out.println(u.toString());
			}
		}
	}

}
