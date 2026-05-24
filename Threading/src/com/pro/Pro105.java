package com.pro;

public class Pro105 {

	public static void main(String[] args) {
		//MeThread.test();
		new Thread(){
			public void run(){
				for(int i=1;i<=20;i++){
					System.out.println("Thread : "+i);
					try {
						Thread.sleep(100);	
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			}
		}.start();
		
		
	
		new MiThread(){
			public void run(){
				for(int i=1;i<=20;i++){
					System.out.println("Thread : "+i);
					try {
						//Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	
	}
}
class MiThread extends Thread{
	
}


class MeThread{
	public static void test(){
		new Thread(){
			public void run(){
				for(int i=101;i<=220;i++){
					System.out.println("Thread : "+i);
					try {
						Thread.sleep(150);	
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			}
		}.start();
	}
}
