package kr.mohi.flyingwindgenerator.task;

import java.util.TimerTask;

import kr.mohi.flyingwindgenerator.Wind;
import kr.mohi.flyingwindgenerator.WindPoweredGenerator;

public class GeneratorMovingTask extends TimerTask {
	private WindPoweredGenerator generator;
	private Wind wind;

	public GeneratorMovingTask(Wind wind, WindPoweredGenerator generator) {
		this.generator = generator;
		this.wind = wind;
	}
	
	@Override
	public void run() {
		if(wind.getHeight() == generator.getHeight())
			return;
		this.chaseWind();
	}
	
	public void chaseWind() {
		if(generator.getHeight() < wind.getHeight()) {
			generator.addHeight(generator.getMovingSpeed());
			return;
		} else if(generator.getHeight() > wind.getHeight()) {
			generator.subHeight(generator.getMovingSpeed());
			return;
		}
		else if(generator.getHeight() == wind.getHeight()) {
			return;
		}
	}
}
