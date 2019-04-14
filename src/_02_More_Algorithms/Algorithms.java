package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	static double runningHeight = 0.0;
	public static int findBrokenEgg(List<String> eggs) {
		return eggs.indexOf("cracked");
	}

	public static double findTallest(List<Double> peeps) {
		for(int i = 0; i<peeps.size(); i++) {
			if(peeps.get(i) > runningHeight) {
				runningHeight = i;
			}
	}
		return runningHeight;
	}
	
}
