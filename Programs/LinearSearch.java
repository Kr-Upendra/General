Import java.util.*;

class LinearSearch {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Number of elements: ");
    int n = sc.nextInt();
    System.out.println("Enter array elements: ");
    int[] arr = new int[n];
    for (int i=0; i<n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter target element: ");
    int targetEle = sc.nextInt();
    int result = linearSearch(arr, targetEle);
    if (result == -1) {
      System.out.println("Target element not found");
    } else {
      System.out.println("Element founded");
    }
  }
  static int linearSearch(int[] arr, int targetEle) {
    int n = arr.length;
    for (int i=0; i<n; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }
}
  
