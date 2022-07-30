import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User{
    public boolean email(String str) {
        String regex="[a-zA-Z0-9.]+[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.][a-z]*";
        Pattern p=Pattern.compile(regex);
        Matcher mat=p.matcher(str);
        boolean result=mat.find();
        return result;
    }
}