package com.prolim.phase3;

import java.beans.JavaBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class MyEventPublisher {
	@Autowired
	private ApplicationEventPublisher AEP;
	
	public MyEventPublisher(ApplicationEventPublisher aEP) {
		AEP = aEP;
	}

	public void beforePublishEvent(final String msg) {
		System.out.println("Publishing custom event .");
		MyCustomEvent event=new MyCustomEvent(this,msg);
		AEP.publishEvent(event);
		
	}
}
