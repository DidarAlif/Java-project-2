package classes;
import java.lang.*;

public class MinorCourse extends Course
{
	private int standard;
	
	public MinorCourse()
	{
		super();
		System.out.println("MinorCourse-C");
	}
	public MinorCourse(int courseCode,String courseTitle, String section,String time,int capacity,int availableCourse,int standard)
	{
		super(courseCode,courseTitle,section,time,capacity,availableCourse);
		System.out.println("MinorCourse-C");
		this.standard = standard;
	}
	
	public void setStandard(int standard){this.standard = standard;}
	public int getStandard(){return standard;}
	
	public void showDetails()
	{
		System.out.println("-------------------------------------------\n\n");
		System.out.println("CourseCode: "+ courseCode);
		System.out.println("CourseTitle: "+ courseTitle);
		System.out.println("Section: "+ section);
		System.out.println("Time: "+ time);
		System.out.println("Capacity: "+ capacity);
		System.out.println("AvailableCourse: "+ availableCourse);
		System.out.println("Standard : "+ standard);
		System.out.println("-------------------------------------------\n\n");

	}
}