package _02_More_Algorithms;

import java.util.Arrays;
import java.util.List;

public class Algorithms {
	static double runningHeight = 0.0;
	static double runningLength = 0.0;
	static String rlnocomp;
	public static int findBrokenEgg(List<String> eggs) {
		return eggs.indexOf("cracked");
	}

	public static double findTallest(List<Double> peeps) {
		for(int i = 0; i<peeps.size(); i++) {
			if(peeps.get(i) > runningHeight) {
				runningHeight = peeps.get(i);
			}
	}
		return runningHeight;
	}

	public static Object findLongestWord(List<String> words) {
		for(int i = 0; i<words.size(); i++) {
			if(words.get(i).length() > runningLength) {
				runningLength = words.get(i).length();
				rlnocomp = words.get(i);
			}
	}
		return rlnocomp;
	}

	public static Object containsSOS(List<String> message1) {
		for(int i = 0; i<message1.size(); i++ ) {
			if(message1.get(i).indexOf(" ... --- ... ") != -1) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		Double[] array = (Double[]) results.toArray();
		Arrays.sort(array);
		return Arrays.asList(array);
	}
	public static List<String> sortDNA(List<String> results) {
		String[] array = (String[]) results.toArray();
		Arrays.sort(array);
		return Arrays.asList(array);
	}

	public static List<String> sortWords(List<String> words) {
		if(words[1].compareto)
		return null;
	}
	
}
