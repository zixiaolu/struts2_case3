package zxl.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.*;
import java.util.Random;

public class initAction extends ActionSupport {
    HttpServletRequest request;
    HttpServletResponse resp;
    int random;

    public String execute() throws Exception {

        resp=ServletActionContext.getResponse();
        request=ServletActionContext.getRequest();
        HttpSession session=request.getSession();
        Random rd=new Random();
        random=rd.nextInt(4000);
        random+=1000;
        String aim=String.valueOf(random);
        Cookie cookie=new Cookie("vaild",aim);
        resp.addCookie(cookie);

        return "index";
    }

    public int getRandom(){
        return random;
    }
}
