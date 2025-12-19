package Assignment1;

import java.util.*;

class ArrayOperations {
	
	public static void insert(int arr[], int n) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter element to insert");
	        int val = sc.nextInt();
	        arr[n] = val;
	        n++;

	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	}
	public static void delete(int arr[], int n) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter index to delete");
	        int index = sc.nextInt();
	        for (int i = index; i < n - 1; i++)
	            arr[i] = arr[i + 1];
	        n--;

	      	}

	
	public static void linearsearch(int arr[], int n) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter element for linear search");
	        int key = sc.nextInt();
	        int pos = -1;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] == key) {
	                pos = i;
	                break;
	            }
	        }
	        System.out.println(pos);
	}

	
	public static void binarysearch(int arr[], int n) {
		 Scanner sc = new Scanner(System.in);
		 int key = sc.nextInt();
	        int pos = -1;

	        System.out.println("Enter element for binary search");
	        key = sc.nextInt();

	        for (int i = 0; i < n - 1; i++)
	            for (int j = 0; j < n - 1 - i; j++)
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	        int low = 0, high = n - 1;
	        pos = -1;
	        while (low <= high) {
	            int mid = (low + high) / 2;
	            if (arr[mid] == key) {
	                pos = mid;
	                break;
	            } else if (arr[mid] < key)
	                low = mid + 1;
	            else
	                high = mid - 1;
	        }
	        System.out.println(pos);
	}

	public static void Max(int arr[], int n) {
		 int max = arr[0];
	        for (int i = 1; i < n; i++)
	            if (arr[i] > max)
	                max = arr[i];
	        System.out.println(max);

	}
	public static void evenodd(int arr[], int n) {
		 int even = 0, odd = 0;
	        for (int i = 0; i < n; i++)
	            if (arr[i] % 2 == 0)
	                even++;
	            else
	                odd++;
	        System.out.println(even);
	        System.out.println(odd);
		 
	}
	
	
	public static void insertionsort(int arr[], int n) {
		 Scanner sc = new Scanner(System.in);
		  for (int i = 1; i < n; i++) {
	            int temp = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > temp) {
	                arr[j + 1] = arr[j];
	                j--;
	            }
	            arr[j + 1] = temp;
	        }

	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[100];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        insert(arr, n);
        delete(arr, n);
        linearsearch(arr, n);
        insertionsort(arr, n);
        binarysearch(arr, n);
        evenodd(arr, n);
        Max(arr, n);

       
      
    }
}

