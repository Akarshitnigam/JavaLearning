package learningFileHandlingInJAva;
import java.io.File; //Import the File Class
import java.io.IOException;//Import IOException class to handle errors


public class CreatingAndWritingAFile {
public static void main(String[] args) {
	try {
		File myObj = new File("meriFileName.txt");
		
		if(myObj.createNewFile()) {
			System.out.println("File created: "+myObj.getName());
			
		}else {
			System.out.println("File already exists");
		}
		
	}catch(IOException e) {
		System.out.println("An error occured while creating a file");
		e.printStackTrace();
		
	}
}

	
}
