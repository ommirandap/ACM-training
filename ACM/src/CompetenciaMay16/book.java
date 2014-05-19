package CompetenciaMay16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class book {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		int cases = 1;

		while (length != 0) {
			String[] array = br.readLine().split(" ");

			int[][] lista = new int[2][length];

			for (int i = 0; i < length; ++i) {
				lista[0][i] = Integer.parseInt(array[i]);
				lista[1][i] = i;
			}
			int cortes = 0;

			for (int i = 0; i < length - 1; ++i) {
				if (lista[0][i] < lista[0][i + 1])
					continue;
				for (int j = 0; j < i; ++j) {
					if (lista[0][j] > lista[0][i + 1]) {
						int valor = lista[1][j];
						cortes++;
						if (lista[1][i] == valor - 1)
							--cortes;
						lista[1][i + 1] = valor;
						for (int k = j; k < i + 1; ++k) {
							if (lista[1][k] >= valor)
								lista[1][k]++;
						}
						break;
					}

				}
			}

			System.out.println("Case " + cases + ": " + cortes);
			cases++;
			length = Integer.parseInt(br.readLine());
		}
	}

}
