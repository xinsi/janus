package de.mslab.ciphers.helpers;

import de.mslab.core.ByteArray;


public class BKSQ96Helper extends BKSQHelper {
	
	protected int countActiveKeyBytes(int round, ByteArray key) {
		int sum = 0;
		
		for (int i = 9; i < 12; i++) {
			if (key.get(i) != 0) {
				sum++;
			}
		}
		
		return sum;
	}
	
}