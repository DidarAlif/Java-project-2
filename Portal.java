package classes;
import java.lang.*;
import interfaces.*;

public class Portal implements CourseOperations
{

	private String id;
	private String name;
	private String email;
	private int year;
	

	private Course courses[ ] = new Course[6];
	
	public Portal()
	{
		System.out.println("Welcome To our Portal");
	}
	public Portal(String id, String name, String email, int year)
	{
		System.out.println("Portal");
		this.id = id;
		this.name = name;
		this.email = email;
		this.year = year;

	}
	public void setId(String id){this.id = id;}
	public void setName(String name){this.name = name;}
	public void setEmail(String email){this.email = email;}
	public void setName(int year){this.year = year;}

	
	public String getId(){return id;}
	public String getName(){return name;}
	public String getEmail(){return email;}
	public int getYear(){return year;}


	public boolean insertCourse(Course c)
	{
		boolean flag = false;
		for(int i = 0; i<courses.length; i++)
		{
			if(courses[i] == null)
			{
				courses[i] = c;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeCourse(Course c) 
	{
		boolean flag = false;
		for(int i=0; i<courses.length; i++)
		{
			if(courses[i] == c)
			{
				courses[i] = null;
				flag = true;
				break;
			}
		}
		return flag;		
	}
	
	public Course searchCourse(int courseCode)
	{
		Course flag = null;
		for(int i=0; i<courses.length; i++)
		{
			if(courses[i] != null)
			{
				if(courses[i].getCourseCode() == courseCode)
				{
					flag = courses[i];
					break;
				}
			}
		}
		return flag;
	}
	public void showAllCourses()
	{
		for(int i=0; i<courses.length; i++)
		{
			if(courses[i] != null)
			{
				courses[i].showDetails();
				System.out.println();
			}
			
		}
	}
}