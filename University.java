package classes;
import java.lang.*;
import interfaces.*;

public class University implements PortalOperations, TeacherOperations
{
	private Portal portals[] = new Portal [1500];
	private Teacher teachers[] = new Teacher [400];
	
	public boolean insertPortal(Portal p)
	{
		boolean flag = false;
		for(int i=0; i<portals.length; i++)
		{
			if(portals[i] == null)
			{
				portals[i] = p;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removePortal(Portal p)
	{
		boolean flag = false;
		for(int i=0; i<portals.length; i++)
		{
			if(portals[i] == p)
			{
				portals[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public Portal searchPortal(String id)
	{
		Portal p = null;
		
		for(int i=0; i<portals.length; i++)
		{
			if(portals[i] != null)
			{
				if(portals[i].getId().equals(id))
				{
					p = portals[i];
					break;
				}
			}
		}
		return p;
	}
	public void showAllPortals()
	{	
		for(int i=0; i<portals.length; i++)
		{
			if(portals[i] != null)
			{
				System.out.println("*************************************************");
				System.out.println("Portal ID : "+portals[i].getId());
				System.out.println("Portal Name : "+portals[i].getName());
				System.out.println("Portal Name : "+portals[i].getEmail());
				System.out.println("Portal Name : "+portals[i].getYear());
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
				portals[i].showAllCourses();
				System.out.println();
			}
		}
	}
		
	public boolean insertTeacher(Teacher t)
	{
		boolean flag = false;
		for(int i=0; i<teachers.length; i++)
		{
			if(teachers[i] == null)
			{
				teachers[i] = t;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeTeacher(Teacher t)
	{
		boolean flag = false;
		for(int i=0; i<teachers.length; i++)
		{
			if(teachers[i] == t)
			{
				teachers[i] = null;
				flag = true;
				break;
			}
		}   
		return flag;
	}

	public Teacher searchTeacher(String tId)
	{
		Teacher t = null;
		
		for(int i=0; i<teachers.length; i++)
		{
			if(teachers[i] != null)   
			{
				if(teachers[i].getTId().equals(tId))
				{
					t = teachers[i];
					break;
				}
			}
		}
		return t;
	}
	
	public void showAllTeachers()
	{
		System.out.println("++++++++++++++++++++++");
		for(int i=0; i<teachers.length; i++)
		{
			if(teachers[i] != null)
			{
				System.out.println("\n---------------------------------------------------\n");
				System.out.println("Teacher Id: " + teachers[i].getTId());
				System.out.println("Teacher Name: " + teachers[i].getName());
				System.out.println("Teacher Name: " + teachers[i].getEmail());
				System.out.println("\n---------------------------------------------------\n");
			}
		}
	}
}
