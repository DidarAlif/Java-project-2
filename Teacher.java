package classes;
import java.lang.*;

public class Teacher
{
	private String tId;
	private String name;
	private String email;

	public Teacher(){};
	public Teacher( String tId ,String name,String email)
	{
		this.tId = tId;
		this.name = name;
		this.email = email;
	}
	
	public void setTId(String tId){this.tId = tId;}
	public void setName(String name){this.name = name;}
	public void setEmail(String email){this.email = email;}


	public String getTId(){return tId;} 
	public String getName(){return name;}
	public String getEmail(){return email;}
 

}