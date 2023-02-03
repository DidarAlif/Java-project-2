package classes;
import java.lang.*;

import interfaces.TotalCourse;

public abstract class Course implements TotalCourse
{
	protected int courseCode;
    protected String courseTitle;
	protected String section;
    protected String time;
	protected int capacity;
	protected int availableCourse;
	
	
	public Course(){System.out.println("Empty-Course");}
	public Course(int courseCode, String courseTitle, String section, String time,int capacity, int availableCourse)
	{
		System.out.println("Parameterized-Course");
		this.courseCode= courseCode;
		this.courseTitle = courseTitle;
		this.section =section;
		this.time =time;
		this.capacity=capacity;
		this.availableCourse=availableCourse;

	}	
	
	public void setCourseCode(int courseCode)
	{
		this.courseCode = courseCode;
	}
	public void setCourseTitle(String courseTitle)
	{
		this.courseTitle = courseTitle;
	}
	public void setSection(String section)
	{
		this.section =section;
	}
	public void setTime (String time)
	{
		this.time =time;
	}
	public void setCapacity (int capacity)
	{
		this.capacity =capacity;
	}
	
	public void setAvailableCourse(int availableCourse)
	{
		this.availableCourse=availableCourse;
	}
	
	
	public int getCourseCode()
	{
		return courseCode; 
	}
	public String getCourseTitle()
	{
		return courseTitle; 
	}
	public String getSection()
	{ 
		return section;
	}
	public String getTime()
	{ 
		return time;
	}
	public int getCapacity()
	{ 
		return capacity;
	}
	public int getAvailableCourse()
	{ 
		return availableCourse;
	}
	public boolean addCourse(int extent){
		if(extent>0){

			System.out.println("-------------------------------------------\n\n");
			System.out.println("Previous Quantity: "+ availableCourse);
			System.out.println("Added extent: "+ extent);

			availableCourse = availableCourse+extent;
			
			System.out.println("Current Courses: "+ availableCourse);
			
			System.out.println("-------------------------------------------\n\n");
			return true;
		}
		else{return false;}
	}
    public boolean dropCourse(int extent){

		if(extent>0 && extent<= availableCourse){

			System.out.println("-------------------------------------------\n\n");
			System.out.println("Previous Courses: "+ availableCourse);
			System.out.println("Drop extent: "+ extent);

			availableCourse = availableCourse - extent;
			
			System.out.println("Current Courses: "+ availableCourse);
			System.out.println("-------------------------------------------\n\n");
			
			return true;
		}
		else{return false;}
}
	
	public abstract void showDetails();
	
	
}