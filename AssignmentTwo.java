package assignment02;

import java.util.*;

public class AssignmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProblemOne();
		ProblemTwo();
		ProblemThree();
		ProblemFour();
		ProblemFive();
		ProblemSix();
	}
// Problem01
	public static void ProblemOne() {
		// TODO Auto-generated method stub
		System.out.println("Problem 01");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number of Strings: ");
		int n = scanner.nextInt();
		String[] arr = new String[n];
		System.out.println("Enter " + n + " Strings: ");

		for (int i = 0; i < n; i++) {
			String s = scanner.next();
			arr[i] = s;

		}

		Map<String, Integer> res = countStrings(arr);
		System.out.print("Input (S1): [");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
			if (count != arr.length)
				System.out.print("\"" + arr[i] + "\",");
			else
				System.out.print("\"" + arr[i] + "\"");
		}
		System.out.println("]");
		System.out.println("Output: ");
		count = 0;
		for (Map.Entry<String, Integer> entry : res.entrySet()) {
			count++;
			if (count != res.size()) {
				System.out.print(entry.getKey() + "-" + entry.getValue() + ", ");
			} else {
				System.out.print(entry.getKey() + "-" + entry.getValue());
			}
		}
	}

	public static Map<String, Integer> countStrings(String[] input) {
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < input.length; i++) {
			map.put(input[i], map.getOrDefault(input[i], 0) + 1);
		}
		return map;

	}	
// Problem02
	public static void ProblemTwo() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nProblem 02");
		System.out.print("Enter Number of Strings: ");
		int n = scanner.nextInt();
		String[] arr = new String[n];
		System.out.println("Enter " + n + " Strings: ");

		for (int i = 0; i < n; i++) {
			String s = scanner.next();
			arr[i] = s;

		}

		Map<String, String> res = concatStrings(arr);
		System.out.print("Input (S1): [");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
			if (count != arr.length)
				System.out.print("\"" + arr[i] + "\",");
			else
				System.out.print("\"" + arr[i] + "\"");
		}
		System.out.println("]");
		System.out.println("Output (M1): {");
		count = 0;
		for (Map.Entry<String, String> entry : res.entrySet()) {
			count++;
			if (count != res.size())
				System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"" + ",");
			else
				System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"");

		}
		System.out.print("}");
	}

	public static Map<String, String> concatStrings(String[] input) {
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			String s = input[i];
			map.put(s.charAt(0) + "", map.getOrDefault(s.charAt(0) + "", "") + s);
		}

		return map;
	}
	
//Problem 03
	public static void ProblemThree() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nProblem 03");
		System.out.print("Enter Number of Elements: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " Elements: ");

		for (int i = 0; i < n; i++) {
			int ele = scanner.nextInt();
			arr[i] = ele;

		}

		Set<Integer> res = printSequentialSet(arr);
		System.out.println("Input (A1): " + Arrays.toString(arr));
		System.out.println("Output (S): " + res);
	}

	public static Set<Integer> printSequentialSet(int[] input) {
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < input.length; i++) {
			int ele = input[i];
			while (set.contains(ele)) {
				ele++;
			}
			set.add(ele);
		}
		return set;
	}

//Problem 04

public static void ProblemFour() {
	// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);

	System.out.println("\nProblem 04");
	System.out.print("Enter number of Strings: ");
	int n = scanner.nextInt();
	ArrayList<String> input = new ArrayList<>();
	System.out.println("Enter " + n + " Elements: ");

	for (int i = 0; i < n; i++) {
		String ele = scanner.next();
		input.add(ele);

	}

	ArrayList<String> res = removeDuplicateChars(input);
	System.out.print("Input (A1): [");
	int count = 0;
	for (int i = 0; i < input.size(); i++) {
		count++;
		if (count != input.size())
			System.out.print("\"" + input.get(i) + "\",");
		else
			System.out.print("\"" + input.get(i) + "\"");
	}
	System.out.println("]");

	System.out.println("Output (A2): [");
	count = 0;
	for (int i = 0; i < res.size(); i++) {
		count++;
		if (count != res.size())
			System.out.print("\"" + res.get(i) + "\",");
		else
			System.out.print("\"" + res.get(i) + "\"");
	}
	System.out.println("]");

}

public static ArrayList<String> removeDuplicateChars(ArrayList<String> input) {
	ArrayList<String> res = new ArrayList<>();
	Set<Character> set = new HashSet<>();

	for (int i = 0; i < input.size(); i++) {
		String s = input.get(i);
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (!set.contains(c)) {
				sb.append(c);
				set.add(c);
			}
		}
		res.add(sb.toString());

		set.clear();
	}
	return res;
}

// Problem 05
public static void ProblemFive() {
	// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	System.out.println("\nProblem 05 ");
	System.out.print("Enter Number of Strings: ");
	int n = scanner.nextInt();
	ArrayList<String> input = new ArrayList<>();
	System.out.println("Enter " + n + " elements: ");

	for (int i = 0; i < n; i++) {
		String ele = scanner.next();
		input.add(ele);

	}

	Map<String, String> res = firstLastCharMap(input);
	System.out.print("Input: [");
	int count = 0;
	for (int i = 0; i < input.size(); i++) {
		count++;
		if (count != input.size())
			System.out.print("\"" + input.get(i) + "\",");
		else
			System.out.print("\"" + input.get(i) + "\"");
	}
	System.out.println("]");

	System.out.println("Output: {");
	count = 0;
	for (Map.Entry<String, String> entry : res.entrySet()) {
		count++;
		if (count != res.size())
			System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"" + ",");
		else
			System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"");

	}
	System.out.print("}");
}

public static Map<String, String> firstLastCharMap(ArrayList<String> input) {
	Map<String, String> map = new HashMap<>();
	for (int i = 0; i < input.size(); i++) {
		char firstChar = input.get(i).charAt(0);
		char lastChar = input.get(i).charAt(input.get(i).length() - 1);
		map.put(firstChar + "", lastChar + "");
	}
	return map;

}
// Problem 06
public static void ProblemSix() {
	// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);

	System.out.println("\n Problem 06 ");
	System.out.print("Enter Number of Strings: ");
	int n = scanner.nextInt();
	ArrayList<String> input = new ArrayList<>();
	System.out.println("Enter " + n + " Elements: ");

	for (int i = 0; i < n; i++) {
		String ele = scanner.next();
		input.add(ele);

	}

	Map<String, Boolean> res = setBooleanMap(input);
	System.out.print("Input (S1): [");
	int count = 0;
	for (int i = 0; i < input.size(); i++) {
		count++;
		if (count != input.size())
			System.out.print("\"" + input.get(i) + "\",");
		else
			System.out.print("\"" + input.get(i) + "\"");
	}
	System.out.println("]");

	System.out.println("Output (M1): {");
	count = 0;
	for (Map.Entry<String, Boolean> entry : res.entrySet()) {
		count++;
		if (count != res.size())
			System.out.print("\"" + entry.getKey() + "\"" + ":" + entry.getValue() + ", ");
		else
			System.out.print("\"" + entry.getKey() + "\"" + ":" + entry.getValue());

	}
	System.out.print("}");
}

public static Map<String, Boolean> setBooleanMap(ArrayList<String> input) {

	Map<String, Boolean> map = new HashMap<>();
	for (int i = 0; i < input.size(); i++) {
		if (map.containsKey(input.get(i))) {
			map.put(input.get(i), true);
		} else {
			map.put(input.get(i), false);
		}
	}
	return map;
}

}
