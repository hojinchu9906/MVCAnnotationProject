package com.controller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
/*
 * 		RetentionPolicy.RUNTIME : ���α׷� ����ñ��� ����.
 * 		RetentionPolicy.SOURCE : �������Ŀ� �ڵ����� �޸� ����
 * 		RetentionPolicy.CLASS : 
 * 		===========================> ����Ⱓ
 */
@Target(ElementType.TYPE)
/*
 * 		����
 * 		@ Ŭ���� ����   : ElementType.TYPE
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













































