package Models;
import java.util.Date;

public class Token {

    private static String csrf;
    private static String sesssion;
    
    public String getCsrf() {
        return csrf;
    }

    public String getSesssion() {
        return sesssion;
    }

    public void setCsrf() {
        Date date = new Date();
        long timeinMiliSeconds = date.getTime();
        Token.csrf = Long.toString(timeinMiliSeconds);
    }

    public void setSesssion(String sesssion) {
        Token.sesssion = sesssion;
    }
}
