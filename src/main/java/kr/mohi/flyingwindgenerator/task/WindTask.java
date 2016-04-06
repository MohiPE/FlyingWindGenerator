package kr.mohi.flyingwindgenerator.task;

import java.util.Random;
import java.util.TimerTask;

import kr.mohi.flyingwindgenerator.Main;
import kr.mohi.flyingwindgenerator.Wind;

public class WindTask extends TimerTask{
	private Wind wind;
	
	public WindTask(Wind wind) {
		this.wind = wind;
	}
	
	@Override
	public void run() {
		Random random = new Random();
		if((random.nextInt(100) + 1) <= Wind.sameHeightProbability) {
			if((random.nextInt(100) + 1) <= Wind.strongWindProbability) {
				wind.setCustom((random.nextInt(10) + 11));
				return;
			}
			wind.setCustom(Math.random() + random.nextInt(10) + 1);
			return;
		}
		if((random.nextInt(100) + 1) <= Wind.strongWindProbability) {
			wind.setCustom((random.nextInt(10) + 11));
			return;
		}
		wind.setHeight(random.nextInt(Main.MAX_HEIGHT) + 1);
		wind.setCustom(Math.random() + random.nextInt(10) + 1);
	}
	
}
