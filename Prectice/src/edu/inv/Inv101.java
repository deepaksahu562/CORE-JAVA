package src.edu.inv;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Inv101 {

	public static void main(String[] args) {

			int num = 21;
			String str = Integer.toBinaryString(num);
			System.out.println(str);
			
			char [] ch = str.toCharArray();
			System.out.println(ch);
			
			List list = new ArrayList();
			for (char c : ch) {
				list.add(c);
			}
			
			
			long count = list.stream().filter(ele -> (char)ele == '1').count();
			
			System.out.println(count);
			
			//Stream.of(ch).filter(ele -> ele == '1').count();
			
			
	}

}
