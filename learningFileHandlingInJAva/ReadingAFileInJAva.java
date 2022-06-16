package learningFileHandlingInJAva;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadingAFileInJAva {
public static void main(String[] args) {
	try {
		File myObj = new File("C:\\Users\\t_akarshit.nigam\\eclipse-workspace\\Learning\\src\\learningFileHandlingInJAva\\myNEWTEXTFILE.txt");
		Scanner myReader = new Scanner(myObj);
		while(myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println(data);
		}
		myReader.close();
		
	}
	catch(FileNotFoundException e) {
		System.out.println("An error occurred.");
		e.printStackTrace();
	}
}
	
}
