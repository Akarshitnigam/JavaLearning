package learningFileHandlingInJAva;
import java.io.File;
import java.io.IOException;
public class CreatingFileToASpecifiedLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File myObj = new File("C:\\Users\\t_akarshit.nigam\\eclipse-workspace\\Learning\\src\\learningFileHandlingInJAva\\myNewTextFile.txt");
			if(myObj.createNewFile()) {
				System.out.println("File created: "+ myObj.getName());
				System.out.println("Absolute path: "+myObj.getAbsolutePath());
			}else {
				System.out.println("File already exists");
			}
		}catch(IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
		
		
	}

}
