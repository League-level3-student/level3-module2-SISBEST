package _02_More_Algorithms;

import java.util.Arrays;
import java.util.List;

public class Algorithms {
	static double runningHeight = 0.0;
	static double runningLength = 0.0;
	static String rlnocomp;
	static int oystersct;
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
		Double[] array = (Double[])
		results.toArray();
		Arrays.sort(array);
		return Arrays.asList(array);
	}
	public static List<String> sortDNA(List<String> results) {
		String[] array = (String[])results.toArray();
		for(int i = 1; i<array.length; i++) {
			//2. make another for loop that starts at i and counts down
        	//   while j is greater than 0
			for(int j = i; j > 0; j--) {
				//3. if the element at j is less than the element at j - 1,
            	//   then swap them
				if(array[j].length() < array[j-1].length()) {
					String a = array[j];
					String b = array[j-1];
					array[j] = b;
					array[j-1] = a;
				}
			}
	}
		return Arrays.asList(array);
	}

	public static List<String> sortWords(List<String> words) {
		String[] array = (String[])words.toArray();
				Arrays.sort(array);
				return Arrays.asList(array);
		}

	public static Object countPearls(List<Boolean> oyslist) {
		for(int i = 0; i < oyslist.size(); i++) {
			if(oyslist.get(i)) {
				oystersct++;
			}
		}
		return oystersct;
	}
	
}
