package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author yoyo
 */
public class Second_GenericServlet extends GenericServlet{
    
     @Override
    public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
        System.out.println("Servicing Servlet using GenericServlet...");
        //set the content type of the response
        res.setContentType("text/html");
        
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello from SecondServlet using GenericServlet</h1>");
        out.println("<h2>Todays Date and time is:"+new Date().toString()+"</h2>");

    }
    
    
}
