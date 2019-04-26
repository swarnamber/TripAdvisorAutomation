package scripts;

public class RepeatedNumberinArray {

	static void getDuplicateNumber(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i] + " ");
				}

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 5, 4, 2, 4, 8, 7, 9, 6 };
		getDuplicateNumber(arr);

	}

}
