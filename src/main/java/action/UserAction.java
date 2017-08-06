package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import beans.User;
import service.IUserService;

@Controller
@Scope("prototype")
public class UserAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

	@Resource
    private IUserService userService;
    
    private User user;
    private JSONArray resultObj;
    private Map<String,Object> dataMap;
    private List<User> userlist;
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
   
    public JSONArray getResultObj() {
		return resultObj;
	}

	public void setResultObj(JSONArray resultObj) {
		this.resultObj = resultObj;
	}

    public List<User> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<User> userlist) {
        this.userlist = userlist;
    }

    public String execute() throws Exception {
        System.out.println("execute");
        return SUCCESS;
    }

    public String addUser() {
        userService.addUser(user);
        return SUCCESS;
    }

    public String deleteUser() {
        userService.deleteUser(user.getId());
        return SUCCESS;
    }

    public String queryAllUser() {
        List<User> users =new ArrayList();
        users = userService.queryAllUser();
        userlist = userService.queryAllUser();	    
        JSONArray jsonarray = JSONArray.fromObject(users);
		this.setResultObj(jsonarray);
		dataMap = new HashMap<String, Object>();
		//dataMap.put("success",true);
		dataMap.put("user",users);		
		System.out.println(jsonarray);
        return "success";
    }

    public void validate() {
        System.out.println("validate()会对action中的所有方法进行校验");
//        if(this.user.getName() == null || this.user.getName().trim().equals("")) {  
//            this.addFieldError("name", "用户名不能为空！");  
//        }  
    } 
    
    //直接返回一个字符串
    public String queryUserNameByID() throws IOException{
        HttpServletResponse response = ServletActionContext.getResponse();  
        response.setContentType("text/html;charset=UTF-8");
        //response.sendError(401,"timeout");
        PrintWriter out = response.getWriter();  
        out.println("luangeng123");//返回的字符串数据 
        out.flush();
        out.close();
        return null;  
    }
    
    public String query(){
		dataMap = new HashMap<String, Object>();
		User user = new User();
		user.setName("张三");
		user.setPwd("123");
		dataMap.put("user", user);
		// 放入一个是否操作成功的标识
		dataMap.put("success", true);
		// 返回结果
		return "success";
    }
    
    
	public Map<String, Object> getDataMap() {
		return dataMap;
	}

}