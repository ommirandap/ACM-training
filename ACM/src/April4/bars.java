package April4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bars {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int testcases = Integer.parseInt(br.readLine());
		int max, nBars;

		while (testcases > 0 && (line = br.readLine()) != null) {

			max = Integer.parseInt(line);
			nBars = Integer.parseInt(br.readLine());
			int[] largos = new int[nBars];
			int[] bitmap = new int[nBars];

			int j = 0;
			for (String i : (br.readLine()).split(" ")) {
				largos[j] = Integer.parseInt(i);
				j++;
			}

			System.out.println(backtracking(max, 0, 0, bitmap, largos) ? "YES"
					: "NO");
			
			--testcases;

		}

	}

	public static boolean backtracking(int max, int suma, int indice,
			int[] usados, int[] barras) {

		if (suma == max)
			return true;

		if (indice == usados.length)
			return false;

		if (backtracking(max, suma, indice + 1, usados, barras)) {
			return true;
		}

		usados[indice] = 1;
		suma = suma + barras[indice];
		if (backtracking(max, suma, indice + 1, usados, barras)) {
			return true;
		}

		return false;

	}
}
