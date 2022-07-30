import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User{
    public boolean MobileNo(String str) {
        String regex="(91-)[0-9]{10}$";
        Pattern p=Pattern.compile(regex);
        Matcher mat=p.matcher(str);
        boolean result=mat.find();
        return result;
    }
}