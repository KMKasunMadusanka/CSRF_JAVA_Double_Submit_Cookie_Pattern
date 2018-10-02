package Models;

import java.util.Date;
import java.util.HashMap;


/**
 *
 * @author User
 */
public class Token {

    private static String csrf;
    private static String sesssion;
    private static HashMap<String,String> sessionMap = new HashMap<String, String>();

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

    public HashMap<String, String> getSessionMap() {
        return sessionMap;
    }

    public void setSessionMap() {
        Token.sessionMap.put(this.sesssion, this.csrf);
    }
    

    
}
