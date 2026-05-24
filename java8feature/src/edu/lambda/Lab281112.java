package edu.lambda;

interface Sayable {
	public String say();
}

interface Showable{
	public String show(String str);
}

interface Displayable{
	public void display(String str);
}

public class Lab281112 {
	public static void main(String[] args) {
		
		// Without argument
		Sayable s = () -> {
			return "I have nothing to say.";
		};
		System.out.println(s.say());
		
		//With argument
		Showable sho = (String str) ->{
			return "Hello-"+str;
		};
		
		System.out.println(sho.show("World......!"));
		
		Showable sh = (str) ->{
			return "Hello-"+str;
		};
		
		System.out.println(sh.show("Indore......!"));
		
		Showable shh = str ->{
			return "Hello-"+str;
		};
		
		System.out.println(shh.show("India......!"));
		
		Showable shhh = str -> "Hello-"+str;
		System.out.println(shhh.show("Shahdol......!"));
		
		
		Displayable dis = str -> System.out.println(str + " is the cleanest city.....!");
		dis.display("Indore");
		
	}
}