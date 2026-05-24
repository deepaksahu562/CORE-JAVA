package com.test;

public interface MyInterFace extends Runnable,Cloneable{

}
class HelloClass{
	
}
class Haiclass extends HelloClass implements MyInterFace{

	public void run() {
		
	}
	
}

class HaiHelloClass implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
