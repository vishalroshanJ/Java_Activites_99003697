package interfaceacttivity;
import java.util.*;
public abstract class Match {
	
private int currentscore;
private float currentover;
private int  target;

public Match() {
	super();
}
public Match(int currentscore, float currentover, int target) {
	super();
	this.currentscore = currentscore;
	this.currentover = currentover;
	this.target = target;
}
public int getCurrentscore() {
	return currentscore;
}
public void setCurrentscore(int currentscore) {
	this.currentscore = currentscore;
}
public float getCurrentover() {
	return currentover;
}
public void setCurrentover(float currentover) {
	this.currentover = currentover;
}
public int getTarget() {
	return target;
}
public void setTarget(int target) {
	this.target = target;
}
abstract float calculaterunRate();

abstract float calculateballs();

abstract void display(double reqRunrate,int balls);
}
