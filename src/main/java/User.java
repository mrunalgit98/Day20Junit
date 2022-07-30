import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User{
    public boolean Lastname(String str) {
        String regex="[A-Z]{1}[a-z]{2,}";
        Pattern p=Pattern.compile(regex);
        Matcher mat=p.matcher(str);
        boolean result=mat.find();
        return result;
    }
}