import java.util.Scanner;

public class mergesort {
	void merge(int arr[], int beg, int mid, int end)  
	{  	
	  
	int l = mid - beg + 1;  
	int r = end - mid;  
	  
	int LeftArray[] = new int [l];  
	int RightArray[] = new int [r];  
	  
	for (int i=0; i<l; ++i)  
	LeftArray[i] = arr[beg + i];  
	  
	for (int j=0; j<r; ++j)  
	RightArray[j] = arr[mid + 1+ j];  
	  
	  
	int i = 0, j = 0;  
	int k = beg;  
	while (i<l&&j<r)  
	{  
	if (LeftArray[i] <= RightArray[j])  
	{  
	arr[k] = LeftArray[i];  
	i++;  
	}  
	else  
	{  
	arr[k] = RightArray[j];  
	j++;  
	}  
	k++;  
	}  
	while (i<l)  
	{  
	arr[k] = LeftArray[i];  
	i++;  
	k++;  
	}  
	  
	while (j<r)  
	{  
	arr[k] = RightArray[j];  
	j++;  
	k++;  
	}  
	}  
	  
	void sort(int arr[], int beg, int end)  
	{  
	if (beg<end)  
	{  
	int mid = (beg+end)/2;  
	sort(arr, beg, mid);  
	sort(arr , mid+1, end);  
	merge(arr, beg, mid, end);  
	}  
	}  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		// TODO Auto-generated method stubScanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		//reading the number of elements from the that we want to enter  
		int n=sc.nextInt();  
		//creates an array in the memory of length 10  
		int[] arr = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		arr[i]=sc.nextInt();  
		}  
          
          System.out.println("Array Before Bubble Sort");  
          for(int i=0; i < arr.length; i++){  
                  System.out.print(arr[i] + " ");  
          }  
          System.out.println(); 
          
		mergesort ob = new mergesort();  
		ob.sort(arr, 0, arr.length-1);  
		  
		System.out.println("\nSorted array");  
		for(int i =0; i<arr.length;i++)  
		{  
		    System.out.println(arr[i]+"");  
		}  
	}

}
