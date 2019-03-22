package Model;

import java.io.Serializable;

public class PackMan implements Serializable{
	
	
	public final static String LEFT = "left";
	public final static String RIGHT = "right";
	public final static String UP = "up";
	public final static String DOWN = "down";
	
	private int diameter;
	private int xPosition;
	private int yPosition;
	private int waiTime;
	private String initialDirection;
	private int aRebounds;
	private boolean isDead;

	public PackMan(int diameterr, int xPositionn, int yPositionn, int waiTimee, String initialDirectionn, int aReboundss,
			boolean isDeadd) {

		diameter = diameterr;
		xPosition = xPositionn;
		yPosition = yPositionn;
		waiTime = waiTimee;
		initialDirection = initialDirectionn;
		aRebounds = aReboundss;
		isDead = isDeadd;
	}
	public int getDiameter() {
		return diameter;
	}
	public int getxPosition() {
		return xPosition;
	}
	public int getyPosition() {
		return yPosition;
	}
	public int getWaiTime() {
		return waiTime;
	}
	public String getInitialDirection() {
		return initialDirection;
	}
	public int getaRebounds() {
		return aRebounds;
	}
	public boolean isDead() {
		return isDead;
	}	




}
