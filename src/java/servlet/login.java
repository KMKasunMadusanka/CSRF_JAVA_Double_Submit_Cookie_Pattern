package servlet;
import Models.Token;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    Token tkn = new Token();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("admin") && password.equals("admin")) {

            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("JSESSIONID")) {

                        // set session id
                        tkn.setSesssion(cookie.getValue());
                    }
                }
            }
            // set session cookie
            Cookie sessionCookie = new Cookie("sessionID", tkn.getSesssion());
            response.addCookie(sessionCookie);

            // set cookie to username
            Cookie usernameCookie = new Cookie("username", username);
            response.addCookie(usernameCookie);

            // create csrf token
            tkn.setCsrf();

            // set session cookie
            Cookie csrfCookie = new Cookie("csrf", tkn.getCsrf());
            response.addCookie(csrfCookie);

            response.sendRedirect("request.jsp");

        } else {
            response.sendRedirect("login.jsp");
        }

    }
}
