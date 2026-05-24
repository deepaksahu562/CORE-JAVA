package com.jlc2015;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab1244 {
	public static void main(String[] args) {
		//1.
		Collection col = new ArrayList();
		col.add("Deepak");
		col.add(101);
		col.add("shahdol");
		System.out.println(col);
		System.out.println(col.size());
		
		Object arr[] = col.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i] = "YYYYYYY";
		}
		
		System.out.println(col);

		List coln = new ArrayList();
		coln.add("Vineeta");
		coln.add(101);
		coln.add(true);
		System.out.println(coln);
		coln.remove(1);
		System.out.println(coln);
		
		
		/*//2.
		Collection coll = new ArrayList();
		coll.add(new Account1244(1201, "ICICI Bank"));
		coll.add(new Account1244(1402, "HSBC Bank"));
		coll.add(new Account1244(1503, "SBI Bank"));
		coll.add(new Account1244(1704, "YES Bank"));
		
		System.out.println("Collection : "+coll+"\nSize : "+coll.size());
		Object obj[] = coll.toArray();
		for (Object object : obj) {
			Account1244 account = (Account1244)object;
			System.out.println("Account No. : "+account.getAccno()+"\tBank Name : "+account.getBank());
			
		}
		*/
	}
}

class Account1244{
	private int accno;
	private String bank;
	
	public Account1244(int accno, String bank) {
		this.accno = accno;
		this.bank = bank;
	}
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	@Override
	public String toString() {
		return "Acc No. : "+accno+"\tBank Name : "+bank;
	}
}