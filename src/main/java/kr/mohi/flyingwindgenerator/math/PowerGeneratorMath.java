package kr.mohi.flyingwindgenerator.math;

import kr.mohi.flyingwindgenerator.Wind;
import kr.mohi.flyingwindgenerator.WindPoweredGenerator;

public class PowerGeneratorMath {
	public static double getOutPutPower(Wind wind, WindPoweredGenerator generator) {
		return generator.isRunning() ? (wind.getCustom() * 76.9) : 0; //단위는 W(와트)
	}
}
