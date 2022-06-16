package learningRegularExpressionsInJava;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
 public class LearnRegularExpression {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Visit W3Schools!");
    boolean matchFound = matcher.find();
    System.out.println("matchfound is truw or false?:-->"+matchFound);
    
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
    
    
    //2nd example
    Pattern pt1 = Pattern.compile("Arijit", Pattern.CASE_INSENSITIVE);
    Matcher matchingSentence = pt1.matcher("Arijit is a good person");
    boolean isFound = matchingSentence.find();
    System.out.println(isFound);
    if(isFound) {
    	System.out.println("Arijit is there in the pt1");
    }else {
    	System.out.println("Arijit is not found in the pt1");
    }
    
    
    
    
    
    
    
    
    
    //3rd example
    // Create a pattern to be searched
    // Custom pattern
    Pattern pattern1 = Pattern.compile("geeks");

    // Search above pattern in "geeksforgeeks.org"
    Matcher m = pattern1.matcher("geeksforgeeks.org");

    // Finding string using find() method

    while (m.find())

        // Print starting and ending indexes
        // of the pattern in the text
        // using this functionality of this class
        System.out.println("Pattern found from "
                           + m.start() + " to "
                           + (m.end() - 1));
    
    
    
    
    
    
    
    
    
    
    
    
    System.out.println("Third example");
    //3rd example
 // Creating a pattern to be searched
    // Custom pattern to be searched
    Pattern pattern3 = Pattern.compile("ge*");

    // Searching for the above pattern in
    // "geeksforgeeks.org"
    Matcher m3 = pattern3.matcher("geeksforgeeks.org");

    // Checking whether the pattern is there or not
    // using find() method
    while (m3.find())

        // Print starting and ending indexes of the
        // pattern in text using method functionality of
        // this class
        System.out.println("Pattern found from "
                           + m3.start() + " to "
                           + (m3.end() - 1));
  
  
  
  System.out.println("4th Example");
  //4th example
    // Creating a pattern to be searched
    Pattern pattern4 = Pattern.compile(
        "ge*", Pattern.CASE_INSENSITIVE);

    // Searching above pattern in "geeksforgeeks.org"
    Matcher m4 = pattern4.matcher("GeeksforGeeks.org");

    // Find th above string using find() method
    while (m4.find())

        // Printing the starting and ending indexes of
        // the pattern in text using class method
        // functionalities
        System.out.println("Pattern found from "
                           + m4.start() + " to "
                           + (m4.end() - 1));
  
  
    
    
    //5th  Example
 // Java program Illustrating Working of split() Method
 // by Splitting a text by a given pattern
    // Custom string
    String text = "geeks1for2geeks3";

    // Specifies the string pattern
    // which is to be searched
    String delimiter = "\\d";
    Pattern pattern5 = Pattern.compile(
        delimiter, Pattern.CASE_INSENSITIVE);

    // Used to perform case insensitive search of the
    // string
    String[] result = pattern5.split(text);

    // Iterating using for each loop
    for (String temp : result)
        System.out.println(temp);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  }
}
