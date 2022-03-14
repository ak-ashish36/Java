
package login_logout;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        PrintWriter out =response.getWriter();
        HttpSession session =request.getSession();
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if(username.equals("ashish") && password.equals("12345")){
            session.setAttribute("id", username);
            response.sendRedirect("welcome.jsp");
        }
        else{
            response.sendRedirect("login.jsp");
        }

    }

}
