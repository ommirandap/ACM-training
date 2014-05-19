package April4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cds {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] ble;
		
		while (true) {
			int jack, jill;
			ble = br.readLine().split(" ");
			jack = Integer.parseInt(ble[0]);
			jill = Integer.parseInt(ble[1]);
			if (jack == 0 && jill == 0){
				break;
			}
			if (jack == 0 || jill == 0) {
				System.out.println("0");
				return;
			}

			int cd[] = new int[jack];

			for (int j = 0; j < jack; j++) {
				cd[j] = Integer.parseInt(br.readLine());
			}

			int ind = 0;
			int total = 0;
			for (int j = 0; j < jill; j++) {
				int elem = Integer.parseInt(br.readLine());
				if (elem > cd[jack - 1])
					continue;
				else {
					if (elem < cd[ind])
						continue;
					else {
						for (; ind < jack && cd[ind] < elem; ind++)
							;
						if (cd[ind] == elem) {
							total++;
							ind++;
						}
					}
				}

			}

			System.out.println(total);

		}
	}

}
