package interfaceacttivity;

public class TestMatch extends  Match{

	@Override
	float calculaterunRate() {
		float a=(getTarget()-getCurrentscore())/(90-getCurrentover());
		return a;
	}

	@Override
	float calculateballs() {
		float b=(90-getCurrentover())*6;
		return b;
	}

	@Override
	void display() {
		System.out.println("NEED"+(getTarget()-getCurrentscore())+"Runs in "+calculateballs()+"Balls");
		System.out.println("Required Runrate:"+calculaterunRate());
	}

}
