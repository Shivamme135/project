import java.util.Scanner;

public class shivam1{
	
	/*public static int max(int a, int b){
		if(a>=b)
			return a;
		else
			return b;
	}*/

	public static int min(int[] arr){
		int index = 0;
		for(int i=0;i<3;i++)
		{
			for(int j=i;j<3;j++)
			{
				if(arr[i]>arr[j])
				{
					index = j;
				}
			}
		}
		return index;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value of N > ");
		int N = sc.nextInt();
		int arr[][] = new int[N][3];

		System.out.println("enter "+N*2+" values");

		for(int i=0;i<N;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		int minimulCost = 0;
		int minIndex = min(arr[0]);
		for(int j=0;j<N;j++)
		{
			if(j==0)
			{
				minimulCost += arr[j][minIndex];
			}
			else{
				if(minIndex == 0){
					if(arr[j][1]>arr[j][2])
					{
						minIndex = 2;
					}
					else{
						minIndex = 1;
					}
				}
				else if(minIndex == 1)
				{
					if(arr[j][0]>arr[j][2])
					{
						minIndex = 2;
					}
					else{
						minIndex = 0;
					}	
				}
				else{
					if(arr[j][1]>arr[j][0])
					{
						minIndex = 0;
					}
					else{
						minIndex = 1;
					}
				}
				minimulCost += arr[j][minIndex];
			}
		}
		System.out.println(minimulCost);

		
		/*
		System.out.println("2D array > ");
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}*/


	}
}