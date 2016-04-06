package kr.mohi.flyingwindgenerator;

import kr.mohi.flyingwindgenerator.logger.Logger;

public class Main {
	public final static int MAX_HEIGHT = 100;
	public final static int startHeight = 50;
	
	public static void main(String[] args) {
		Wind wind = new Wind();
		WindPoweredGenerator generator = new WindPoweredGenerator(Main.startHeight, wind);
		Logger logger = new Logger(wind, generator);
		wind.start();
		generator.start();
		logger.start();
	}
}
