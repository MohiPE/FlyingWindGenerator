package kr.mohi.flyingwindgenerator;

import java.util.Timer;

import kr.mohi.flyingwindgenerator.math.PowerGeneratorMath;
import kr.mohi.flyingwindgenerator.task.GeneratorMovingTask;

public class WindPoweredGenerator {
	private double height;
	private Wind wind;
	private final double speed = 0.2;

	public WindPoweredGenerator(int startHeight, Wind wind) {
		this.height = startHeight;
		this.wind = wind;
	}
	
	public void start() {
		Timer timer = new Timer();
		timer.schedule(new GeneratorMovingTask(wind, this), 100, 50); // 초당 5미터
	}

	public double getHeight() {
		return Math.round(this.height);
	}

	public void setHeight(int height) {
		if (this.height < 0 || height <= 0)
			return;
		this.height = height;
	}

	public void addHeight(double add) {
		height += add;
		if (height < 0)
			this.height = 0;
	}
	
	public void subHeight(double sub) {
		height -= sub;
		if (height < 0)
			this.height = 0;
	}

	public double getMovingSpeed() {
		return this.speed;
	}

	public double getW() {
		return PowerGeneratorMath.getOutPutPower(wind, this);
	}

	public boolean isRunning() {
		if (wind.getHeight() == this.getHeight())
			return true;
		return false;
	}
}
