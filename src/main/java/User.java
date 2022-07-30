import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User{
    public boolean Rule1(String str) {
        String regex="[a-zA-Z0-9!@#$]{8}";
        Pattern p=Pattern.compile(regex);
        Matcher mat=p.matcher(str);
        boolean result=mat.find();
        return result;
    }
}