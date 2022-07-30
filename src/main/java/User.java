import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User{
    public boolean Rule3(String str) {
        String regex="[A-Z]+[0-9][a-zA-Z0-9!@#$%]{6}";
        Pattern p=Pattern.compile(regex);
        Matcher mat=p.matcher(str);
        boolean result=mat.find();
        return result;
    }
}