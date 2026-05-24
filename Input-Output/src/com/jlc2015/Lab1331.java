package src.com.jlc2015;

import java.io.IOException;

public class Lab1331 {

	public static void main(String[] args) throws IOException {
		JlcReader rd = new JlcReader();
		System.out.println("Enter sid");
		String sid =  rd.readLine();
		
		System.out.println("Enter Name");
		String name =  rd.readLine();
		
		System.out.println("Enter phone");
		String phn =  rd.readLine();
		
		System.out.println("Enter fee");
		String fee =  rd.readLine();
		
		System.out.println(sid+"\t"+name +"\t"+phn +"\t"+fee );
	}
}

class JlcReader{
	public String readLine() throws IOException{
		StringBuilder val = new StringBuilder();
		while (true) {
			int asc = System.in.read();
			if(asc == 13);
				else if (asc == 10)
					break;
			else {
				char ch = (char) asc;
				val.append(ch);
			}
		}
		return val.toString();
	}
}

