package testregx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegx {
    public static void main(String[] args) {
        String text = "When in Rome, do as the Romans ";
        String textSplit [] = text.split(" ");
        Pattern myPattern = Pattern.compile("Ro. + ");
        for (int i = 0; i<textSplit.length; i++)
        {
            Matcher myMatcher = myPattern.matcher(textSplit[i]);
            boolean myBoolean = myMatcher.matches();
            System.out.println("myBoolean");
        }
      //  Pattern myPattern = Pattern.compile("[abc]at");
       // Matcher myMatcher = myPattern.matcher("bat");
      //  boolean myBoolean = myMatcher.matches();
      //  if(myBoolean)
          //  System.out.println("Expression Matched");
       // else
          //  System.out.println("Expression not Matched");
    }
}
