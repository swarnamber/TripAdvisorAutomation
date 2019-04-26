package scripts;

import java.util.Scanner;

class MinimumDistance  
{ 
    int minDist(int arr[], int n, int x, int y)
    { 
        int i, j; 
        int min_dist = Integer.MAX_VALUE; 
        for (i = 0; i < n; i++)  
        { 
            for (j = i + 1; j < n; j++)  
            { 
                if ((x == arr[i] && y == arr[j] 
                    || y == arr[i] && x == arr[j]) 
                    )  
                    min_dist = Math.abs(i - j); 
            } 
        } 
        return min_dist; 
    } 
  
    public static void main(String[] args)  
    { 
        MinimumDistance min = new MinimumDistance(); 


        Scanner arrIn=new Scanner(System.in);
        System.out.println("Enter array range");
        int range=arrIn.nextInt();
		int arr[]=new int[range];
		System.out.println("Enter array Elements");
        for(int i=0;i<range;i++){ 
        arr[i]=arrIn.nextInt();
        }
        System.out.println("Enter starting value");
        int x = arrIn.nextInt(); 
        System.out.println("Enter ending value");
        int y = arrIn.nextInt(); 
  
        System.out.println("Minimum distance between " + x + " and " + y  
                + " is " + min.minDist(arr, range, x, y)); 
    
        arrIn.close();
    } 
} 