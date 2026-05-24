package com.jlc2015;

public class Lab1295 {

	public static void main(String[] args) {
		Thread th = Thread.currentThread();
		ThreadGroup tg = th.getThreadGroup();
		System.out.println("Thread Id: "+th.getId()+"\tThread Name :"+th.getName()+"\tThreadGroup :"+tg.getName());
		
		// args -> Deepak 0203 Hello world
		for (int i = 0; i < args.length; i++) {
			String str = args[i];
			System.out.println("Thread Id: "+th.getId()+"\tThread Name :"+th.getName()+"\tThreadGroup :"+tg.getName()+"\t"+str);
		}
	}

}
