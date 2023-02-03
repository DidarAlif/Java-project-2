package interfaces;
import java.lang.*;
import classes.Course;

public interface CourseOperations
{
	boolean insertCourse(Course c);
	boolean removeCourse(Course c);
	void showAllCourses( );
	Course searchCourse(int courseCode);
}