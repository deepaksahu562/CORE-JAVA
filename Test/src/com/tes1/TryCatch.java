package com.tes1;

public class TryCatch {

	public static void main(String[] args) {

		System.out.println(ret());

	}
	
	static boolean ret(){
		try {
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			int i = 1;
			if(i == 1)
				return false;
			else
				return true;
		}
	}

}
