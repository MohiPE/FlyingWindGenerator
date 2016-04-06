package kr.mohi.flyingwindgenerator.task;

import java.util.TimerTask;

import kr.mohi.flyingwindgenerator.logger.Logger;

public class LoggerTask extends TimerTask {
	Logger logger;

	public LoggerTask(Logger logger) {
		this.logger = logger;
	}

	@Override
	public void run() {
		this.logger.printLog();
	}
}
