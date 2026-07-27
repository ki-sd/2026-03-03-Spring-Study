package com.sist.commons;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonsException {
	@ExceptionHandler(Exception.class)
	public void exception(Exception ex) {
		ex.printStackTrace();
	}
	@ExceptionHandler(Throwable.class)
	public void throwable(Throwable th) {
		th.printStackTrace();
	}
}
