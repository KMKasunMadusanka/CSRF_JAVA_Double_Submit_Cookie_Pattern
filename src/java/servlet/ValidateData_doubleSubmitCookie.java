package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/ValidateData_doubleSubmitCookie"})
public class ValidateData_doubleSubmitCookie extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String csrf_form = request.getParameter("csrf");
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("csrf")) {

                    HttpSession session = request.getSession();
                    // check the responce csrf is equal with server csrf
                    if (cookie.getValue().equals(csrf_form)) {
                        session.setAttribute("result_value", "Your responce has been ensured with CSRF Double submit cookie pattern!");
                    } else {
                        session.setAttribute("result_value", "Your responce is recoded but not ensured with CSRF");
                    }

                }
            }
            response.sendRedirect("result.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
