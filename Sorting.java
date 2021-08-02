// Getting the number of swap and compare of Bubble, Selection and Insertion Sorting

import java.util.*;

public class Sorting {	
	private static int[] numbers;

	public static void main(String[] args) {
		input();

		System.out.println("\n\t\tCompare\t\tSwap\t");
		bubbleSort();
		selectionSort();
		insertionSort();
	}

	public static void input() {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter unsorted numbers (separated by spaces)\n> ");
		String input = sc.nextLine();

		String[] inputs = input.split(" ");
		numbers = new int[inputs.length];

		for (int x = 0; x < inputs.length; x++)
			numbers[x] = Integer.parseInt(inputs[x]);
	}

	public static void bubbleSort() {
		int[] numBubble = new int[numbers.length];
		int range, compare = 0, swap = 0;

		for (int x = 0; x < numbers.length; x++)
			numBubble[x] = numbers[x];

		range = numBubble.length;

		for (int x = 0; x < numBubble.length - 1; x++) {
			for (int y = 0; y < range - 1; y++) {
				if (numBubble[y] > numBubble[y + 1]) {
					int cont = numBubble[y];
					numBubble[y] = numBubble[y + 1];
					numBubble[y + 1] = cont;
					swap++;				
				}
				compare++;
			}
			range--;
		}

		System.out.println("Bubble\t\t" + compare + "\t\t" + swap);
	}

	public static void selectionSort() {
		int[] numSelection = new int[numbers.length];
		int compare = 0, swap = 0;

		for (int x = 0; x < numbers.length; x++)
			numSelection[x] = numbers[x];

		for (int x = 0; x < numSelection.length - 1; x++) {
			int index = x;

			for (int y = x + 1; y < numSelection.length; y++) {
				if (numSelection[index] > numSelection[y])
					index = y;

				compare++;
			}
	
			if (numSelection[x] > numSelection[index]) {
				int cont = numSelection[index];
				numSelection[index] = numSelection[x];
				numSelection[x] = cont;
				swap++;
			}
		}

		System.out.println("Selection\t" + compare + "\t\t" + swap);
	}

	public static void insertionSort() {
		int[] numInsertion = new int[numbers.length];
		int compare = 0, swap = 0;

		for (int x = 0; x < numbers.length; x++)
			numInsertion[x] = numbers[x];
		
		for (int x = 0; x < numInsertion.length - 1; x++) {
			for (int y = x; y >= 0; y--) {
				compare++;
				
				if (numInsertion[y] > numInsertion[y + 1]) {
					int cont = numInsertion[y];
					numInsertion[y] = numInsertion[y + 1];
					numInsertion[y + 1] = cont;
					swap++;
				} else {
					break;
				}
			}
		}

		System.out.println("Insertion\t" + compare + "\t\t" + swap);
	}
}

/*
 
	References:
	https://www.geeksforgeeks.org/java-program-for-bubble-sort/
	https://www.geeksforgeeks.org/java-program-for-selection-sort/ 
 
*/