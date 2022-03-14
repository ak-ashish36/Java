
package customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class myfirsttag extends TagSupport{

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out =pageContext.getOut();
            
            out.println("<h1>This is my first Custom tag</h1>");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
        
    }
    
    
}
