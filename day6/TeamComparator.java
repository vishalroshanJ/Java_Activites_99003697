package democollection1;

import java.util.Comparator;

public class TeamComparator implements Comparator<Team>{

	@Override
	public int compare(Team arg0, Team arg1) {
		
		return arg1.getName().compareTo(arg0.getName());
	}

}
