package com.controller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)				//외부에서 쓸때는 @RequestMapping("a.do")
public @interface RequestMapping {
	public String value();
}
