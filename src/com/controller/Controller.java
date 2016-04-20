package com.controller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
/*
 * 		RetentionPolicy.RUNTIME : 프로그램 종료시까지 저장.
 * 		RetentionPolicy.SOURCE : 컴파일후에 자동으로 메모리 해제
 * 		RetentionPolicy.CLASS : 
 * 		===========================> 저장기간
 */
@Target(ElementType.TYPE)
/*
 * 		구분
 * 		@ 클래스 구분   : ElementType.TYPE
 * 		public class A{
 * 			@ ElementType.FIELD
 * 			B b;
 * 
 * 			public A(@ ElementType.PARAMETER B b)
 * 			{
 * 				
 * 			}
 * 
 * 			@ ElementType.METHOD
 * 			public void setA(B b){
 * 
 * 			}
 *  	}
 */
public @interface Controller {
	public String value();
}













































