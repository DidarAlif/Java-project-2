package interfaces;

import java.lang.*;
import classes.Portal;

public interface PortalOperations
{
	boolean insertPortal(Portal p);
	boolean removePortal(Portal p);
	Portal searchPortal(String id);
	void showAllPortals();

}