package March21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class digits {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;

		// si me entregan mas de 9 digitos , respondo 3
		// si me entregan un 1, respondo 1
		// si me entregan entre 2-9, respondo 2

		while (!((line = br.readLine()).equals("END"))) {

			int i = 0;
			int next = line.length();
			if (next == 1 && Integer.parseInt(line) == 1) {
				System.out.println("1");
			} else {
				for (i = 0; next != 1; i++) {
					next = (int) Math.log10(next);
					next++;
				}

				System.out.println(i + 2);
			}
		}

	}

}
