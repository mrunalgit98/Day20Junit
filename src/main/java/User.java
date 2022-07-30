import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User{
    public boolean Rule2(String str) {
        String regex="[A-Z]+[a-zA-Z0-9!@#$%]{7}";
        Pattern p=Pattern.compile(regex);
        Matcher mat=p.matcher(str);
        boolean result=mat.find();
        return result;
    }
}