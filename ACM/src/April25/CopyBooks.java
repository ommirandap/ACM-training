package April25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyBooks {

	/**
	 * @param args
	 * @throws IOException
	 * @throws
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < testcases; ++i) {
			String[] values = br.readLine().split(" ");
			int escribas = Integer.parseInt(values[1]);
			int libros = Integer.parseInt(values[0]);

			String[] pages = br.readLine().split(" ");

			long totalpages = 0;
			for (int j = 0; j < libros; ++j)
				totalpages += Integer.parseInt(pages[j]);
			int escribasaux = escribas;
			int max = (int) (totalpages / escribas);
			System.out.println(max);

			int suma = 0;
			int escribascontados = 0;
			for (int indice = 0; indice < libros; ++indice) {

				if (escribascontados < escribas - 1 && suma != 0
						&& suma + Integer.parseInt(pages[indice]) > max) {
					result.append("/ ");
					suma = 0;
					escribascontados++;
					--indice;
				} else {
					result.append(pages[indice]);
					if (indice != libros - 1)
						result.append(" ");
					suma += Integer.parseInt(pages[indice]);
					totalpages -= Integer.parseInt(pages[indice]);
					--escribasaux;
					if (escribasaux!=0)	max = (int) (totalpages / (escribasaux));
				}
			}

			if (i != testcases - 1)
				result.append("\n");

		}

		System.out.println(result);

	}

}
