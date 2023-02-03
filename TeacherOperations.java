package interfaces;
import java.lang.*;
import classes.Teacher;

public interface TeacherOperations
{
	boolean insertTeacher(Teacher t);
	boolean removeTeacher(Teacher t);
	Teacher searchTeacher(String tId);
	void showAllTeachers();
}