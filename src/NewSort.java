
public class NewSort 
{
	public static void main(String[] args)
	{
        int arr[] = {64,25,12,22,11};
        System.out.println("unS0rt3d 4rr4y us1ng (s3l3ct1on s0rt)");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        System.out.println("\nS0rt3d 4rr4y us1ng s3l3ct1on s0rt");
        int n1 = arr.length;
        for (int i=0; i<n1; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();

	}

}
