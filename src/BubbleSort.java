
public class BubbleSort {

	public static void main(String[] args) 
	{
	        int arr[] = {65, 35, 26, 13, 23, 12, 91};
	        int n = arr.length;
	        System.out.println("unS0rt3d 4rr4y");
	        for (int i=0; i<n; ++i) 
	        {
	            System.out.print(arr[i] + " ");
	        }
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++) 
	            {
	                if (arr[j] > arr[j+1])
	                {
	                    
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	             }
	        System.out.println("\nS0rt3d 4rr4y");
	        int n1 = arr.length;
	        for (int i=0; i<n1; ++i) 
	        {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();

	}

}
