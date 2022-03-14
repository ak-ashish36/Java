
package attribute_parameter;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class s2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
       
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<h1>Welcome to Servlet 2</h1>");

        int num1=Integer.parseInt(request.getParameter("num1"));
        int num2=Integer.parseInt(request.getParameter("num2"));
        int prod=num1*num2;
        
        //Requesting Attribute
        int sum =(int)request.getAttribute("Sum");
        
        out.println("<h1>Sum is :"+sum+"</h1>");
        out.println("<h1>Product is :"+prod+"</h1>");


        


    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
