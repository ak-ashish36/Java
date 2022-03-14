package form;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;


public class registerServlet extends  HttpServlet{
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
           
        res.setContentType("text/html");
        
        PrintWriter out = res.getWriter();
        out.println("<h2>Welcome to Register Servlet</h2>");
        
        String name=req.getParameter("user_name");
        String pass=req.getParameter("user_password");
        String email=req.getParameter("user_email");
        String gender=req.getParameter("user_gender");
        String course=req.getParameter("user_course");
        String conditions=req.getParameter("checkbox");
        
     
       

        if(conditions!=null){
        out.println("<h3>Name : "+name+"</h3>");
        out.println("<h3>Email : "+email+"</h3>");
        out.println("<h3>Password : "+pass+"</h3>");
        out.println("<h3>Gender : "+gender+"</h3>");
        out.println("<h3>Course : "+course+"</h3>");

        }
        else{
           out.println("<h3>You have not accepted our Terms and conditions</h3>");
           
           //Create object of Request dispatcher
           RequestDispatcher rd =req.getRequestDispatcher("index.html");
          
           // Include with current response
          rd.include(req, res);
          
          //Forward new fresh response
//            rd.forward(req, res);
        }

     

        
    }
}

