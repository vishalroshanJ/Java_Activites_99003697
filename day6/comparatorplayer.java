package democollection1;

import java.util.Comparator;

public class comparatorplayer implements Comparator<playercomparator>{

	@Override
	public int compare(playercomparator arg0, playercomparator arg1) {
		
		if(arg0.getSkill().compareTo(arg1.getSkill())==0)
			return (arg0.getName().compareTo(arg1.getName()));
		else		
		   return (arg0.getSkill().compareTo(arg1.getSkill()));
	}
	
	

}
