package scripts;

public class PythogoreanTriplet {

	static void isTriplet(int arr[], int range) {

		for (int i = 0; i < range; i++) {
			for (int j = i + 1; j < range; j++) {
				for (int k = j + 1; k < range; k++) {
					int x = arr[i] * arr[i];
					int y = arr[j] * arr[j];
					int z = arr[k] * arr[k];
					if (x == y + z || y == x + z || z == x + y) {

						System.out.println("{ " + arr[i] + " " + arr[j] + " " + arr[k] + " }");
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		int range = arr.length;
		isTriplet(arr, range);
	}
}
