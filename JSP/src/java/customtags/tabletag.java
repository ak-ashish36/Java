package customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import static javax.servlet.jsp.tagext.Tag.SKIP_BODY;
import javax.servlet.jsp.tagext.TagSupport;

public class tabletag extends TagSupport{
    public int number;
    public String color;
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
   
     @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out =pageContext.getOut();
            
            out.print("<div style='color:"+color+"; text-align: center;'>");  
            for(int i=1;i<=10;i++){
                out.println("<h3>"+number+" * "+i+" = "+number*i+"</h3>");        
            }
            out.print("</div>");
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
        
    }
    
}
