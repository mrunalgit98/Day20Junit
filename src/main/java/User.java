import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    public boolean Firstname(String str) {
        String regex = "[A-Z]{1}[a-z]{2,}";
        Pattern p = Pattern.compile(regex);
        Matcher mat = p.matcher(str);
        boolean result = mat.find();
        return result;
    }

    public boolean Lastname(String str) {
        String regex = "[A-Z]{1}[a-z]{2,}";
        Pattern p = Pattern.compile(regex);
        Matcher mat = p.matcher(str);
        boolean result = mat.find();
        return result;
    }

    public boolean email(String str) {
        String regex = "[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$";
        Pattern p = Pattern.compile(regex);
        Matcher mat = p.matcher(str);
        boolean result = mat.find();
        return result;
    }

    public boolean MobileNo(String str) {
        String regex = "(91-)[0-9]{10}$";
        Pattern p = Pattern.compile(regex);
        Matcher mat = p.matcher(str);
        boolean result = mat.find();
        return result;
    }

    public boolean Password(String str) {
        String regex = "[A-Z]+[0-9]+[~!@#$%^&*]{1}[a-zA-Z0-9!@#$%]{5}";
        Pattern p = Pattern.compile(regex);
        Matcher mat = p.matcher(str);
        boolean result = mat.find();
        return result;
    }


    }
