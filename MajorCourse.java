package classes;
import java.lang.*;

public class MajorCourse extends Course
{
	private String category;
	
	public MajorCourse()
	{
		super();
		System.out.println("MajorCourse-C");
	}
	public MajorCourse(int courseCode,	String courseTitle, String section, String time,int capacity, int availableCourse,String category)
	{
		super(courseCode,courseTitle,section,time,capacity, availableCourse);
		System.out.println("MajorCourse-C");
		this.category = category;
	}
	
	public void setCategory(String category){this.category = category;}
	public String getCategory(){return category;}
	
	public void showDetails()
	{
		System.out.println("CourseCode: "+ courseCode);
		System.out.println("CourseTitle: "+ courseTitle);
		System.out.println("Section: "+ section);
		System.out.println("Time: "+ time);
		System.out.println("Capacity: "+ capacity);
		System.out.println("AvailableCourse: "+ availableCourse);
		System.out.println("Category : "+ category);
		System.out.println("-------------------------------------------\n\n");

	}
}