import java.util.*;
public class LoginDAO {
	ArrayList<Login> loginlist = new ArrayList<Login>(); 
	public boolean addLogin(Login obj)
	{
	    boolean flag=false;
	    if (obj != null){
	        flag = loginlist.add(obj);    
	       
	    }
	    //System.out.println(flag);
	    
	    
	    System.out.println(loginlist.get(0).getUserName());
	    
	    return flag;

	}
	
	public boolean deleteLogin(Login obj)
	{
	    boolean flag = false;
	    if(obj!=null){
		    flag = loginlist.remove(obj);
		 
	    }
	    
	    return flag;
	}


}
