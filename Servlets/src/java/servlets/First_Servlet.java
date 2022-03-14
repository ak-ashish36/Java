package servlets;

import javax.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 *
 * @author yoyo
 */
public class First_Servlet implements Servlet {
    //Life Cycle Methods
    ServletConfig conf;
    @Override
    public void init(ServletConfig conf){
        this.conf=conf;
        System.out.println("creating object...");
    }
    
    @Override
    public void service(ServletRequest request ,ServletResponse response)throws ServletException,IOException{
        System.out.println("Servicing.....");
        //set the content type of the response
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello from Servlet</h1>");
        out.println("<h2>Todays Date and time is:"+new Date().toString()+"</h2>");

    }
    
    @Override
    public void destroy(){
        System.out.println("goin to destrpy....");
    }
    
    //Non Life Cycle Methods
    
    @Override
    public ServletConfig  getServletConfig(){
        return this.conf;
    }
    
    @Override
    public String getServletInfo(){
        return "this servlet is created by ashish";
    }
    
}
