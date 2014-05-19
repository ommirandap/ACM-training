package CompetenciaMay16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class digit2 {

	static int[] arr;

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());

		for (int i = 0; i < testcases; i++) {

			int max = Integer.parseInt(br.readLine());
			arr = new int[10];

			for (int k = 1; k <= max; k++) {
				int aux = k;
				
				for (int j = 0; j <=Math.log10(k); j++) {
					
					int val = aux % 10;
					arr[val]=arr[val]+1;
					aux = aux / 10;
				}
			}

			for (int j = 0; j < 10; ++j) {
				System.out.print(arr[j]);
				if (j != 9)
					System.out.print(" ");
			}
			System.out.println("");
		}

	}
}
