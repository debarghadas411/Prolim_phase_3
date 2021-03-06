package com.prolim.phase3;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class MyCustomEvent extends ApplicationEvent {
	private String msg;
	public MyCustomEvent(Object source,String msg) {
		super(source);
		this.msg=msg;
	}
	public String getMessage() {
		return msg;
	}
}
