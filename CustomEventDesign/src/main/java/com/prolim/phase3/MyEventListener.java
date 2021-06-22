package com.prolim.phase3;

import org.springframework.context.ApplicationListener;

public class MyEventListener implements ApplicationListener<MyCustomEvent>{

	@Override
	public void onApplicationEvent(MyCustomEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("My Custom Event is triggered and recieved "+arg0.getMessage());
		
	}

}
