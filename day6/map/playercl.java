package activitys;

public class playercl {
	private String name;
	private String team;
	private String skill;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	 public String toString(){
	        return  this.getName() + "--" + this.getTeam() +  "--" + this.getSkill() ;
	    }
	

}
