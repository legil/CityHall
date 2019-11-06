package weekthree;

import java.util.Arrays;
import java.util.Scanner;

public class LottoTix {
	private static void generateTicket(int[] ticket, int currentPos) {
		ticket[currentPos] = (int) (1 + Math.random() * 99);
		
		int i = 0;
		
		while( i < currentPos) {
			if(ticket[currentPos] == ticket[i]) {
				ticket[currentPos] = (int) (1 + Math.random() * 99);
				i = 0;
			} else {
				i++;
			}
		}

	}

	public static void main(String[] args) {
		
		int[] ticket = new int[10];
		boolean[] haveLottoNums = new boolean[100];

		for (int i = 0; i < haveLottoNums.length; i++) {
			haveLottoNums[i] = false;
		}

		int count = 0, numTickets = 0;
		while (count < 99) {
			for (int i = 0; i < ticket.length; i++) {
				generateTicket(ticket, i);
				if (!haveLottoNums[ticket[i]]) {
					haveLottoNums[ticket[i]] = true;
					count++;
				}
			}
			System.out.println(Arrays.toString(ticket));
			System.out.println(Arrays.toString(haveLottoNums));
			System.out.println();
			numTickets++;

		}

		System.out.println(numTickets  + " tickets needed to get all lotto numbers");
	}

}
