package learningLambdaExpressionsInJAva;
interface MyStringFunction{
	String runMine(String str);
}
public class UseLambdaExpressionInMethod {


public static void printFormatted(String str, MyStringFunction f) {
String result = f.runMine(str);
System.out.println(result);
	
}
	

public static void main(String[] args) {
		// TODO Auto-generated method stub
	MyStringFunction e = (s)->s+"!";
	MyStringFunction a = (s)->s+"?";
	printFormatted("Hello", e);
	printFormatted("Bye", a);

	}

}
