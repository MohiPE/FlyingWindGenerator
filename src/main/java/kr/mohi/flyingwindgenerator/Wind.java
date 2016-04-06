package kr.mohi.flyingwindgenerator;

import java.util.Timer;

import kr.mohi.flyingwindgenerator.task.WindTask;

public class Wind {
	public final static int sameHeightProbability = 75;
	public final static int strongWindProbability = 30;
	private double custom; // m/s
	private int height;

	public void start() {
		Timer timer = new Timer();
		timer.schedule(new WindTask(this), 500, 7000);
		this.setHeight(60);
	}
	public double getCustom() {
		return this.custom;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setCustom(double custom) {
		this.custom = custom;
	}

}
