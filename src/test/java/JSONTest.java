import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




import javax.annotation.Resource;

import org.junit.Test;

import service.IUserService;
import service.impl.UserService;
import beans.User;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
 


public class JSONTest {
	   @Resource
	   private UserService userService;
	    
	    private User user;
	    
	    private List<User> userlist;

	@Test
	public void testArray() {

		String[] arr = { "asd", "dfgd", "asd", "234" };
		JSONArray jsonarray = JSONArray.fromObject(arr);
		System.out.println(jsonarray);
		
	}
	@Test
	public void testListToJSON() {
	       //userlist = userService.queryAllUser();
	    List<User> myUser =new ArrayList();	  
	    userService = new UserService();
	    myUser = userService.queryAllUser();	       
		try{
			JSONArray jsonarray = JSONArray.fromObject(myUser);
			System.out.println(jsonarray);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}

}
