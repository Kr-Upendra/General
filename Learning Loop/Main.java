// import java.util.Arrays;
//import java.util.Random;
// import java.util.Scanner;
/*
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);


		 String who = scan.nextLine();
		 System.out.println(who + " Wale idiot hai");

		 for(int i = 1; i <=10;i++) {
		 	System.out.println(i);
		 }

		 for(int i = 1; i <= 3; i++) {
		 	for(int j=1;j<=3;j++){
		 		System.out.println(i+" "+j);
		 	}
		 }

		 pyramid shape
		 for(int i=1;i<=5;i++) {
		 	for(int j=1;j<=i;j++) {
		 		System.out.print("* ");
		 	}
		 	System.out.println();
		 }

		 reverse pyramid
		 for(int i = 1; i <= 5; i++) {
		 	for(int j = 5; j>= i; j--) {
		 		System.out.print("* ");
		 	}
		 	System.out.println();
		 }

		 for(int i = 10; i >= 1; i--) {
		 	System.out.println(i);
		 }

 Write a program to print the first 10 natural numbers
		 for(int i = 1; i <= 10; i++) {
		 	System.out.println(i);
		 }

 Write a program to print the sum of first 10 natural numbers
		 int sum = 0;
		 for (int i = 1;i <= 10; i++) {
		 	sum = sum + i;

		 }
		 System.out.println("Sum of first 10 natural number is: " + sum);

		 Write a program to print the table of a number given by user
		 System.out.println("Enter a number: ");
		 int number = scan.nextInt();
		 int table;
		 for(int i = 1; i <= 10; i++) {
		 	table = number * i;
		 	System.out.println(number + " * " + i + " = " + table);
		 }


		 Write a program to print the table of a number given by user in reverse
		 System.out.print("Enter a number: ");
		 int reverseTable;
		 int number = scan.nextInt();
		 for (int i=10; i >= 1; i--) {
		 	reverseTable = number * i;
		 	System.out.println(number + " * " + i + " = " + reverseTable);
		 }


		 Write a program to find the factorial of a number given by user
		 System.out.print("Enter a number: ");
		 int number = scan.nextInt();

		 long factorial = 1;
		 for (int i = 1; i<= number; i++) {
		 	factorial *= i;
		 }
		 System.out.println("factorial: " + factorial);


		 Write a program to get square of two number which are entered by the user
		 System.out.println("Enter two numbers: ");
		 int base = scan.nextInt();
		 int power = scan.nextInt();
		 int result = 1;
		 for(int i=1; i<=power; i++) {
		 	result *= base;
		 }
		 System.out.println(base + "^" + power + " = " + result);


		System.out.print("Enter some Numbers: ");
		int number = scan.nextInt();
		int reverse = 0;
		int temp = number;
		int remainder = 0;
		while (temp>0) {
			remainder = temp % 10;
			reverse = reverse * 10 + remainder;
			temp /= 10;
		}

		System.out.print("Reverse of: " + number + " is " + reverse);

		System.out.println("Enter some numbers: ");
		int number = scan.nextInt();
		System.out.println(number);
		int temp = number;
		int reverse = 0;
		int remainder = 0;
		while (temp>0) {
			remainder = temp % 10;
			reverse = reverse * 10 + remainder;
			temp /= 10;
		}
		System.out.print(reverse);

		Array

		String[] fruits = {"Apple", "Banana", "grapes", "Litchi", "Guava"};
		System.out.println(fruits[0]);
		fruits[0] = "Allahabad";
		System.out.println(fruits[0]);
		System.out.println(fruits.length);
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		int[][] myNumber = {{1, 2, 4, 8}, {5, 7, 10}};
		int x = myNumber[1][2];
		System.out.println(x);


		int[][] integers = { {1, 2, 3, 4}, {8, 9, 10}};
		for (int i = 0; i < integers.length; i++) {
			for(int j= 0; j<integers[i].length; ++j) {
				System.out.println(integers[i][j]);
			}
		}


		Write A Java program to sort a numeric array and a string array
		int[] number = new int[] {3, 8, 2, 8, 10};
		Arrays.sort(number);
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}

		String[] strArr = {"Mango", "Banana", "Mouse", "Error", "Toxic"};
		Arrays.sort(strArr, Collections.reverseOrder());
		System.out.println("Array Elements in descending order: " + Arrays.toString(strArr));


		Write A Java program to sort a numeric array and a string array
		numeric array sorting
		int[] arr = {3, 5, 2, 8, 9, 1};
		Arrays.sort(arr);
		System.out.println("The sorted array is: ");
		for (int i = 0; i<=arr.length; i++) {
			System.out.println(arr[i]);
		}

		String Array sorting
		String[] stringArray = {"Kumar", "Mouse", "copy", "Laptop", "India"};
		Arrays.sort(stringArray);
		System.out.println("The sorted String array is: ");
		for (int i = 0; i <= stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}



		Write a program to print the sum of an array
		int[] arr = new int[] {4, 3, 2, 1, 5, 89};
		int sum = 0;
		for (int i : arr) {
			sum = sum + i;
		}
		System.out.println(sum);



		sorting an array using toString function
		int[] arr = {3, 5, 2, 8, 9, 1, 6, 4, 10};
		System.out.println("Array before sorted: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Array : " + Arrays.toString(arr));
		for (int i : arr) {
			System.out.println(Arrays.toString(arr));
		}


		Write a program to find the sum of an array
		int[] arr = {3, 5, 8, 9, 7, 6, 2};
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		System.out.println(sum);


//		Write a program to print the underScore symbols for 10 times in 10 row
		int [][]a = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j ++) {
				System.out.printf("%2d ", a[i][j]);
			}
			System.out.println();
		}


		Write a Java program to calculate the average of an array
		double[] numbers = new double[] {20, 39, 10, 34, 40};
		double sum = 0;
		for (int j = 0; j < numbers.length; j++) {
			sum = sum + numbers[j];
		}
		System.out.println(sum);
		double ave = sum / numbers.length;
		System.out.println(ave);

	}
}


class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("the average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
//        int number = scanner.nextInt();
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}

//HackerRank 1st day challenge of 30 day challenges
//class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String inputString = scan.nextLine();
//        System.out.println("Hello World!\n" + inputString);
//    }
//}



//Create a program using array that sorts a list of integers in descending order
class  Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myInt = getIntegers(5);
        int[] sorted = sortIntegers(myInt);
        printArray(sorted);
    }


    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for(int i = 0; i<array.length; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elements " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
//        System.arraycopy(array, 0, sortedArray, 0, array.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }

            }
        }
        return sortedArray;
    }

}


// Find minimum element in an array challenge

// first create a method called readIntegers with count parameter that represent how many integers the user needs to enter

import java.util.Scanner;
class Main {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a count: ");
		int count = scanner.nextInt();
		scanner.nextLine();
		int[] returnedArray = readIntegers(count);
		int returnedMin = findMin(returnedArray);
		System.out.println("Min = " + returnedMin);
	}import java.util.Scanner;

//find minimum element in an array
class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of array element: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("Min Array element is: " + returnedMin);

    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
//        using foreach loop
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
        //        using normal for loop
//        for (int i = 0; i < array.length; i++) {
//            int value = array[i];
//            if (value < min) {
//                min = value;
//            }
//
//        }
    }

	private static int[] readIntegers(int count) {
		int[] array = new int[count];
		for (int i = 0; i < array.length; i++) {
		 	System.out.println("Enter a number: ");
		 	int number = scanner.nextInt();
		 	scanner.nextLine();
		 	array[i] = number;
		} 
		return array;
	}

	private static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int value : array) {
			if (value < min) {
				min = value;
			}
		}
		return min;
	}
}


// find maximum element in array 

// import java.util.scanner;


//Write a program to find the average of array's elements
class Main {
    public static void main(String[] args) {
        int[] array = {34, 32, 89, 98, 10};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int ave = sum / array.length;
        System.out.println(sum);
        System.out.println(ave);
    }
}


//Write a program te test if an array contains a specific value.
class Main {
    public static void main(String[] args) {
        int[] myArray = {1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000, 2905, 2903};
        System.out.println(contains(myArray, 1995));
        System.out.println(contains(myArray, 2523));
    }
    public static boolean contains(int[] array, int item) {
        for (int n : array) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
}


//Write a java program to find the index of an array element

class Main {
    public static void main(String[] args) {
        int[] myArray = {25, 14, 53, 89, 98, 9, 90};
        System.out.println("Index position of 25 is: " + findIndex(myArray,53));
        System.out.println("Index position of 25 is: " + findIndex(myArray,9));
    }
    public static int findIndex(int[] myArray, int t) {
        if (myArray == null)
            return -1;
        int len = myArray.length;
        int i = 0;
        while (i < len) {
            if (myArray[i] == t)
                return i;
            else i = i + 1;
        }
        return -1;
    }
}


import java.util.Arrays;
//Write a program to remove a specific element from the array
class Main {
    public static void main(String[] args) {
        int[] array = {25, 14, 16, 26, 18, 29};
        System.out.println("Original Array: "+Arrays.toString(array));
        int removeIndex = 1;
        for (int i = removeIndex; i < array.length -1; i++) {
            array[i] = array[i + 1];
        }
        System.out.println("After removing: " + Arrays.toString(array));
    }
}
*/


import java.util.Scanner;

class Main {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        printNumbers();
        calculateSum();
        multiplicationTable();
        factorial();
        power();
        reversed();
        oddEven();

    }
//    Write a program to print numbers from 1 to 10
    private static void printNumbers() {
        for (int i = 1; i < 11; i++) {
            System.out.println("first 10 number is: " + i);
        }
    }

//    Write a program to calculate sum of first 10 natural numbers
    private static void calculateSum() {
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum = sum + i;
        }
        System.out.println("\nsum of first 10 natural number is: " + sum);
    }

//    Write a program to print the multiplication table of number that is entered by user
    private static void multiplicationTable() {
        System.out.println("Enter a number for multiplication table: ");
        double number = scan.nextDouble();
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

//    Write a program to find the factorial value of any number which is entered by the user
    private static void factorial() {
        int number;
        int factorial = 1;
        System.out.println("Enter a number: ");
        number = scan.nextInt();
        for (int i = 1; i < number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + ": " + factorial);
    }
//    Write a program to find the power of a number which is entered by the user
    private static void power() {
        System.out.println("Enter base number: ");
        int base = scan.nextInt();
        System.out.println("Enter expo number: ");
        int expo = scan.nextInt();
        int result = 1;
        for (int i = 0; i < expo; i++) {
            result *= base;
        }
        System.out.println(base + " Power of " + expo + " is: " + result);
    }

//    Write a program that print the reversed
    private static void reversed() {
        System.out.println("Enter some numbers: ");
        int number = scan.nextInt();
        int reverse = 0;
        int temp = number;
        int remainder;
        while (temp > 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        System.out.println("Reverse of " + number + " is " + reverse);
    }

//    Write a program to reads a set of integers, and then prints the sum of the even and odd integers.
    private static void oddEven() {
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.println("Enter the number: ");
            int number = scan.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            }
            else {
                oddSum += number;
            }
            System.out.println("Do you want to continue: y/n? ");
            choice = scan.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y');
        System.out.println("Sum of even number: " + evenSum);
        System.out.println("Sum of odd number: " + oddSum);
    }






}



















