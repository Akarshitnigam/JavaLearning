package learningFileHandlingInJAva;
import java.io.FileWriter;
import java.io.IOException;

public class WritingInAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter myWriter = new FileWriter("C:\\Users\\t_akarshit.nigam\\eclipse-workspace\\Learning\\src\\learningFileHandlingInJAva\\myNewTextFile.txt");
			myWriter.write("Files in Java might be tricky, but it is fun enough!");
			myWriter.close();
			System.out.println("Successfully wrote to the  myNEWTEXTFILE");
		}catch(IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
		
		
	}

}
