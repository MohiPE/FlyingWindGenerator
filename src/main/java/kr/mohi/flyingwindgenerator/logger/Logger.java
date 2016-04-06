package kr.mohi.flyingwindgenerator.logger;

import java.util.Timer;

import kr.mohi.flyingwindgenerator.Wind;
import kr.mohi.flyingwindgenerator.WindPoweredGenerator;
import kr.mohi.flyingwindgenerator.task.LoggerTask;

public class Logger {
	WindPoweredGenerator generator;
	Wind wind;
	public Logger(Wind wind, WindPoweredGenerator generator) {
		this.generator = generator;
		this.wind = wind;
	}
	public void start() {
		Timer timer = new Timer();
		timer.schedule(new LoggerTask(this), 1000, 1000);
	}
	public void printLog() {
		System.out.println("Generator Height : " + this.generator.getHeight() + "m" + " | " +  "Wind Height : " + wind.getHeight() + "m" + " | " + "W : " + this.generator.getW() + " | " + "Custom : " + this.wind.getCustom() + "m/s");
	}
}
