package Git.TreeDSA;



class PrintAllPairs {

	// Returns number of pairs
	// in arr[0..n-1] with sum
	// equal to 'sum'
	static void printPairs(int arr[], int n, int sum)
	{
		// int count = 0;

		// Consider all possible pairs
		// and check their sums
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				if (arr[i] + arr[j] == sum)
					System.out.println("(" + arr[i] + ", "+ arr[j] + ")");
	}

	// Driver Code
	public static void main(String[] arg)
	{
		int arr[] = { 1, 5, 7, -1, 5 };
		int n = arr.length;
		int sum = 6;
		printPairs(arr, n, sum);
	}
}


