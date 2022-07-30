import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User{
    public boolean Rule4(String str) {
        String regex="[A-Z]+[0-9]+[~!@#$%^&*]{1}[a-zA-Z0-9!@#$%]{5}";
        Pattern p=Pattern.compile(regex);
        Matcher mat=p.matcher(str);
        boolean result=mat.find();
        return result;
    }
}