package learningFileHandlingInJAva;
import java.io.File;

public class DeletingAFileInJAva {
public static void main(String[] args) {
	File myObj = new File("C:\\Users\\t_akarshit.nigam\\eclipse-workspace\\Learning\\src\\learningFileHandlingInJAva\\myNewTextFile.txt");
	
	if(myObj.delete()) {
		System.out.println("Deleted the file: "+myObj.getName());
		
	}else {
		System.out.println("Failed to delete the file");
	}
}
	
}
