package com.test;

import java.util.StringTokenizer;

public class StrRev_Word {

	public static void main(String[] args) {
		String str = "Hello this is java";
		StringTokenizer st = new StringTokenizer(str," ");
		int z = st.countTokens();
		String stng[] = new String[z];
		
		for (int i = z-1; i >= 0; i--) {
			stng[i] = st.nextToken();
		}
		for (int i = 0; i < z; i++) {
			System.out.print(stng[i]+" ");
		}
	}

}
