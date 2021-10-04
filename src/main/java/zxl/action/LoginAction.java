package zxl.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginAction extends ActionSupport {


    private HttpServletRequest request;

    @Override
    public String execute() throws Exception {

        request= ServletActionContext.getRequest();
        Cookie[] cookies = request.getCookies();
        int num=0;
        for (Cookie c:cookies
             ) {
            System.out.println(c.getName());
            if(c.getName().equals("vaild")){
               num=Integer.parseInt(c.getValue());
            }
        }
        int vaildA= Integer.parseInt(request.getParameter("text1"));
        int vaildB= Integer.parseInt(request.getParameter("text2"));
        if(vaildA+vaildB==num){
            return "success";
        }
        return "failed";
    }


}
