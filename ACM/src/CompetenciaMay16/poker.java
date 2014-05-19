package CompetenciaMay16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class poker {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	
	static boolean pair(int []a){
		int can = 0;
		int carta;
		
		for(int i=0; i<a.length; i++){
			can=0;
			if(a[i]==2){
				carta=i;
				can++;
			}
		}
	
		if(can == 1)
			return true;
		else return false;
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		
		while((line=br.readLine())!=null){
			
			String [] cards = new String[10];
			cards = line.split(" ");
			String [] whitecards = new String[5];
			String [] blackcards = new String[5];
			
			int [] valuewhite = new int[14]; // 0->nada 1->A 2->2 ... 10->T 11->J 12->Q 13->K
			int [] suitwhite = new int[4]; // C D H S
			int [] valueblack = new int[14];// 0->nada 1->A 2->2 ... 10->T 11->J 12->Q 13->K
			int [] suitblack = new int[4]; // C D H S
					
			for(int i=0; i<5; i++){
				blackcards[i]=cards[i];
				whitecards[i+5]=cards[i];
			}
			
			for(int i=0; i<5; i++){
				if(whitecards[i].charAt(0) == 'C')
					suitwhite[0]++;
				else if(whitecards[i].charAt(0) == 'D')
					suitwhite[1]++;
				else if(whitecards[i].charAt(0) == 'H')
					suitwhite[2]++;
				else if(whitecards[i].charAt(0) == 'S')
					suitwhite[3]++;
				
				if(whitecards[i].charAt(1) == 'A')
					valuewhite[1]++;
				else if(whitecards[i].charAt(1) == '2')
					valuewhite[2]++;
				else if(whitecards[i].charAt(1) == '3')
					valuewhite[3]++;
				else if(whitecards[i].charAt(1) == '4')
					valuewhite[4]++;
				else if(whitecards[i].charAt(1) == '5')
					valuewhite[5]++;
				else if(whitecards[i].charAt(1) == '6')
					valuewhite[6]++;
				else if(whitecards[i].charAt(1) == '7')
					valuewhite[7]++;
				else if(whitecards[i].charAt(1) == '8')
					valuewhite[8]++;
				else if(whitecards[i].charAt(1) == '9')
					valuewhite[9]++;
				else if(whitecards[i].charAt(1) == 'T')
					valuewhite[10]++;
				else if(whitecards[i].charAt(1) == 'J')
					valuewhite[11]++;
				else if(whitecards[i].charAt(1) == 'Q')
					valuewhite[12]++;
				else if(whitecards[i].charAt(1) == 'K')
					valuewhite[13]++;
			}
			
			for(int i=0; i<5; i++){
				if(blackcards[i].charAt(0) == 'C')
					suitblack[0]++;
				else if(blackcards[i].charAt(0) == 'D')
					suitblack[1]++;
				else if(blackcards[i].charAt(0) == 'H')
					suitblack[2]++;
				else if(blackcards[i].charAt(0) == 'S')
					suitblack[3]++;
				
				if(blackcards[i].charAt(1) == 'A')
					valueblack[1]++;
				else if(blackcards[i].charAt(1) == '2')
					valueblack[2]++;
				else if(blackcards[i].charAt(1) == '3')
					valueblack[3]++;
				else if(blackcards[i].charAt(1) == '4')
					valueblack[4]++;
				else if(blackcards[i].charAt(1) == '5')
					valueblack[5]++;
				else if(blackcards[i].charAt(1) == '6')
					valueblack[6]++;
				else if(blackcards[i].charAt(1) == '7')
					valueblack[7]++;
				else if(blackcards[i].charAt(1) == '8')
					valueblack[8]++;
				else if(blackcards[i].charAt(1) == '9')
					valueblack[9]++;
				else if(blackcards[i].charAt(1) == 'T')
					valueblack[10]++;
				else if(blackcards[i].charAt(1) == 'J')
					valueblack[11]++;
				else if(blackcards[i].charAt(1) == 'Q')
					valueblack[12]++;
				else if(blackcards[i].charAt(1) == 'K')
					valueblack[13]++;
			}
			
			
		}
		
	}

}
