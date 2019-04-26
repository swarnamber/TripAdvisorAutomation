package scripts;

import java.util.Scanner;

public class PythogoreanTriplet {

	static void isTriplet(int arr[], int range) {

		for (int i = 0; i < range; i++) {
			for (int j = i + 1; j < range; j++) {
				for (int k = j + 1; k < range; k++) {
					int x = arr[i] * arr[i];
					int y = arr[j] * arr[j];
					int z = arr[k] * arr[k];
					if (x == y + z || y == x + z || z == x + y) {

						System.out.println("Triplets are :      { " + arr[i] + " " + arr[j] + " " + arr[k] + " }");
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter number of elements");
		 int n=s.nextInt();
		 int arr[]=new int[n];
		 System.out.println("enter elements");
	     for(int i=0;i<n;i++){//for reading array
	            arr[i]=s.nextInt();
	        }
	     
		int range = arr.length;
		s.close();
		isTriplet(arr, range);
	
	}
}
