package democollection1;

public class playercomparator {
	
	String name;
	String Skill;
	
	
	public playercomparator() {
		super();
	}
	public playercomparator(String name, String skill) {
		super();
		this.name = name;
		Skill = skill;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return Skill;
	}
	public void setSkill(String skill) {
		Skill = skill;
	}
	@Override
	public String toString() {
		return "player name=" + name + " Skill " + Skill ;
	}
	
	
	
	
	

}
