
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Third_HttpServlet extends  HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
           
        res.setContentType("text/html");
        
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello from ThirdServlet using HttpServlet</h1>");
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 
    }
    
}
