package src.com.jlcindia;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerTest {

	public static void main(String[] args) throws IOException{

		Student st=new Student(23,"Sri","srinivas","javasree",101,5345345L);
		Student.branch=new BranchInfo();
		System.out.println(st);
		FileOutputStream fos=new FileOutputStream("C:\\stDetails.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(st);
		System.out.println("Object Serialized");
	}

}
/*
----- Person(int,String) Cons ----
-----User(int,String,Stirng) Cons-*-----
*** Student(Param) *Cons **
Age	:23
Name	:Sri
Uname	:srinivas
Pswrd	:javasree
Sid	:101
Phone	:5345345
Branch	:com.jlcindia.BranchInfo@422ede
Address	:com.jlcindia.Address@112f614
Batch	:B40
Object Serialized
*/