package moving_uppercase_letters;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MovingUppercase 
{
	public static void main(String args[]) 
	{
	    String input;
	    String specialChars ="";
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the sentence:");
	    input=sc.nextLine();
	    
	    Pattern p = Pattern.compile("[A-Z]");
	    Matcher m = p.matcher(input);
	    StringBuffer sb = new StringBuffer();
	    
	    while (m.find()) 
	    {
	    	specialChars = specialChars+m.group();
	        m.appendReplacement(sb, "");
	    }
	    m.appendTail(sb);
	    System.out.println("Result: "+ sb.toString()+specialChars );
	}
}