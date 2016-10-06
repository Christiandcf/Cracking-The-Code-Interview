package AsixthEdition;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Stack;

public class StringsNArrays {
	public static void main(String[] args) {
		// System.out.print(isUnique(""));

		// System.out.println(checkPermutation("iceman","manice"));

		// System.out.println(URLify("Mr John Smith"));

		// System.out.println(oneWay("pales", "bake"));

		// System.out.println(compress("aabcccccaaa"));

		int[][] bomb = new int[][] { { 1, 2, 0 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < bomb.length; i++) { // row
			for (int j = 0; j < bomb[0].length; j++) { // columns
				System.out.print(bomb[i][j]);
			}
			System.out.println();
		}

		System.out.println();

		int[][] test = setZeros(bomb);
		for (int i = 0; i < test.length; i++) { // row
			for (int j = 0; j < test[0].length; j++) { // columns
				System.out.print(test[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();

		// 1.9
		
		System.out.println(isRotation("hello", "lloha"));

	}

	// 1.1 Is Unique

	public static boolean isUnique(String str) {
		if (str.length() > 256) { // max ASCII
			return false;
		}
		str.toLowerCase();
		char[] ch = str.toCharArray();
		Arrays.sort(ch);

		for (int i = 0; i < str.length() - 1; i++) {
			if (ch[i] == ch[i + 1]) {
				return false;
			}
		}
		return true;
	}

	// 1.2 Check Permutation
	public static boolean checkPermutation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		char[] ss1 = s1.toCharArray();
		char[] ss2 = s2.toCharArray();

		Arrays.sort(ss1);
		Arrays.sort(ss2);

		// KEY POINT HERE
		String sss1 = new String(ss1);
		String sss2 = new String(ss2);

		return sss1.equals(sss2);

	}

	// 1.3 URLify

	public static String URLify(String s) {
		if (s == null) {
			return null;
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				sb.append("%20");
			} else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}

	// 1.4 Palindrome Permutation REVIEW THISSSS

	public static boolean isPermOfPalin(String phrase) {
		int countOdd = 0;
		// Let's get the numeric value!
		int[] table = new int[Character.getNumericValue('z')
				- Character.getNumericValue('a') + 1];

		for (char c : phrase.toCharArray()) {
			int x = getCharNumber(c);
			if (x != -1) {
				table[x]++;
				if (table[x] % 2 == 1) {
					countOdd++;
				} else {
					countOdd--;
				}
			}
		}
		return countOdd <= 1;
	}

	public static int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if (a <= val && val <= z) {
			return val - a;
		}
		return -1;
	}

	// 1.5 One Edit away i.e pale, ple -> true || pale, bale -> true

	public static boolean oneWay(String s1, String s2) {
		if (s1.equals(s2)) {
			return true;
		}

		Hashtable<Character, Integer> table = new Hashtable<Character, Integer>();

		for (int i = 0; i < s1.length() - 1; i++) {
			table.put(s1.charAt(i), i);
		}
		int count = 0;
		for (int j = 0; j < s2.length() - 1; j++) {
			if (!table.containsKey(s2.charAt(j))) {
				count++;
			}
		}

		if (count > 1) {
			return false;
		}
		return true;

	}

	// 1.6 String compression aabcccccaaa -> a2b1c5a3

	public static String compress(String s) {
		if (s == null) {
			return null;
		}

		StringBuilder sb = new StringBuilder();
		char last = s.charAt(0);
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == last) {
				count++;
			} else {
				sb.append(last);
				sb.append(count);
				last = s.charAt(i);
				count = 1;
			}
		}
		sb.append(last);
		sb.append(count);
		return sb.toString();
	}

	// 1.7 Rotate an Array
	public static int[][] rotate(int[][] arr) {
		if (arr.length == 0) {
			return null;
		}
		int[][] newArr = new int[arr.length][arr[0].length];
		int n = arr.length;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				newArr[i][j] = arr[n - j - 1][i];
			}
		}

		return newArr;
	}

	// 1.8 Zero matrix, MxN , if 0 is found set that row and colum to 0

	public static int[][] setZeros(int[][] arr) {
		int[] row = new int[arr.length];
		int[] col = new int[arr[0].length];
	//	int[][] newArr = new int[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] == 0){
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		
		// IMPORTANT STEP HERE, needs to pass twice
		for (int i = 0; i < arr.length; i++) { // row
			for (int j = 0; j < arr[0].length; j++) { // columns
				if (row[i] == 1 || col[j] == 1) {
					arr[i][j] = 0;
				}
			}
		}
		return arr;
	}
	
	// 1.9 String Rotation
	
	public static boolean isRotation(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}
		
		char[] ss1 = s1.toCharArray();
		char[] ss2 = s2.toCharArray();
		
		Arrays.sort(ss1);
		Arrays.sort(ss2);
		
		String r1 = new String(ss1);
		String r2 = new String(ss2);
		
		return r1.equals(r2);
	}
}













