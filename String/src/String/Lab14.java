package String;

public class Lab14 {
	public static void main(String[] args) {
		String st="JLCINDIA";
		char arr[]=st.toCharArray();
		for(int i=0;i<arr.length;i++){
			char c=arr[i];
			System.out.println(i+"\t"+c);
			System.out.println("-----------");
			byte bArr[]=st.getBytes();
			for (int j = 0; j < bArr.length; j++) {
				byte b=bArr[j];
				System.out.println(j+"\t"+b+"\t"+(char)b);
			}
			
		}

	}

}
