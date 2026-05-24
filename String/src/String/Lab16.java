package String;

public class Lab16 {

	public static void main(String[] args) {
		String str="Hi this is java learning center.No 1 in java training and placement.Providing training on java and java related concepts";
		
		System.out.println(str);
		String res[]=str.split("java");
		for(int i=0;i<res.length;i++){
			String st=res[i];
			System.out.println(i+"\t"+st);
		}
		System.out.println("==============");
		res=str.split("java",2);
		for(int i=0;i<res.length;i++){
			String st=res[i];
			System.out.println(i+"\t"+st);
		}

	}

}
