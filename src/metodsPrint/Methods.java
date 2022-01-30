package metodsPrint;

import java.util.Scanner;

public class Methods {
	
	// эти два метода печатают текст
	static void printHello() {
		printText("Hello from static methods!", 1);
	}

	static void printText(String text, int num) {
		for (int i = 0; i < num; i++) {
			System.out.println(text);
		}
	}
	// Расчет Max, Min, AVG
	static int getMax(int x, int y, int z) {
		return x > y ? (x > z ? x : (y > z ? y : z)) : y > z ? y : z;
	}

	static int getMin(int x, int y, int z) {
		return x < y ? (x < z ? x : (y < z ? y : z)) : y < z ? y : z;
	}

	static double findAVG(int x, int y, int z, int x1, int x2) {
		return (x + y + z + x1 + x2) / 5.0;
	}
	// Switch
	static void tasksManager() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu : \n\t1 Find Max: \n\t2 Find Min: \n\t3 Find AVG \n\t0 finish:");
		int answer = sc.nextInt();
		while (answer != 0) {
			switch (answer) {
			case 1:
				System.out.println("Imput : a,b,c");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				System.out.println("Max is :" + getMax(a, b, c));
				break;
			case 2:
				System.out.println("Imput : a,b,c");
				int a1 = sc.nextInt();
				int b1 = sc.nextInt();
				int c1 = sc.nextInt();
				System.out.println("Min is :" + getMin(a1, b1, c1));
				break;
			case 3:
				System.out.println("Imput : a,b,c,d,e");
				int a2 = sc.nextInt();
				int b2 = sc.nextInt();
				int c2 = sc.nextInt();
				int d = sc.nextInt();
				int e = sc.nextInt();
				System.out.println("Find AVG is " + findAVG(a2, b2, c2, d, e));
				break;

			default:
				System.out.println("Finish");
				break;
			}
			System.out.println("Menu : \n\t1 Find Max: \n\t2 Find Min: \n\t3 Find AVG \n\t0 finish:");
			answer = sc.nextInt();
		}
	}
	/**
	 * Print specified array . The print way can be regulated via flag.
	 * Перераспределение метода.
	 * @param arr    -incoming array
	 * @param inline - the way of printing.
	 */
	public static void printArray(int arr[], boolean inline) {
		for (int index = 0; index < arr.length; index++) {
			if (inline) { // arr = {1, 2, 3}
				if (index == 0) {// first elem
					System.out.print("arr = {" + arr[index] + (arr.length == 1 ? "}\n" : ", "));
				} else if (index == arr.length - 1) {
					System.out.print(arr[index] + "}\n");
				} else {
					System.out.print(arr[index] + ", ");
				}
			} else { // arr [0] = 1;
				System.out.println("arr[" + index + "] = " + arr[index]);
			}
		}
	}
	/**
	 * Print specified array in single line.
	 * 
	 * @param arr-incoming array
	 */
	public static void printArray(int arr[]) {
		printArray(arr, true);
	}
	
	// Создание рандомного массива
	public static int[] getRandomArray(int size) {
		int[] arr = new int[size];
		// populate array
		for (int i = 0; i < arr.length; i++) {
			int j = (int) (Math.random() * 2);
			if (j != 0) {
				arr[i] = (int) (Math.random() * 101 * -1);
			} else {
				arr[i] = (int) (Math.random() * 101);
			}
		}
		return arr;
	}
	// Копируется массив и добавляется определенное количество ячеек <extraCells>
	public static int[] arraysCopy(int original[], int extraCells) {
		int array[] = new int[original.length + extraCells];
		for (int i = 0; i < original.length; i++) {
			array[i] = original[i];
		}
		return array;
	}
	// Реверс массива
	public static void reverseArray(int arr[]) {
		int[] arrRevers = new int[arr.length];
		for (int i = 0, j = arr.length - 1; i < arr.length; i++) {
			arrRevers[j] = arr[i];
			j--;
		}
		printArray(arrRevers);
	}
	// Создание массива с отрицательными числами
	public static void negativeArray(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				count++;
			}
		}
		int[] negative = new int[count];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				negative[j] = arr[i];
				j++;
			}
		}
		printArray(negative);
	}
	// Сортировка массиса
	System.out.println("Before");
	int [] arr6 = getRandomArray(10);
	printArray(arr6);
	System.out.println("After");
	bublesort(arr6, true);
	printArray(arr6);
	bublesort(arr6, false);
	printArray(arr6);
	
	public static void bublesort(int arr[], boolean asc) {
		// внешний цикл реализует сокращение элементов с конца
		for (int i = arr.length - 1; i > 0; i--) { // внутренний цикл будет отбрасывать макс значение с конца
			for (int j = 0; j < i; j++) {
				if (asc ? arr[j] > arr[j + 1] : arr[j] < arr[j + 1]) {
					// В случае неправильного порядка иеняем между собой
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	Before
	arr = {58, -52, 19, -6, -66, -49, 77, 23, -35, -66}
	After
	arr = {-66, -66, -52, -49, -35, -6, 19, 23, 58, 77}
	arr = {77, 58, 23, 19, -6, -35, -49, -52, -66, -66}
	
	// Реверс массива
	public static int[] reversArray (int arr[]) {
		int[] arrNew = new int[arr.length];
		for (int i = 0, j = arr.length - 1; i < arr.length; i++) {
			arrNew[j] = arr[i];
			j--;
		}
		return arrNew;
	}
	// Этот метод находит количество чисел в числе
	public static int countNumber(int number) {
		int count = 0;
		boolean flag = false;
		int delitel = 1;
		while (!flag) {
			int a = number / delitel;
			if (a != 0) {
				delitel = delitel * 10;
				count++;
			} else {
				flag = true;
			}
		}
		return count;
	}
	// Этот метод создает массив из числа
	public static int[] dividingNumber(int number, int count) {
		int num[] = new int[count];
		if (number < 0) {
			number = number * (-1);
		}
		for (int i = count - 1, j = 1; i >= 0; i--) {
			num[i] = number / j % 10;
			j = j * 10;
		}
		return num;
	}
}
