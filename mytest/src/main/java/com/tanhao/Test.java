package com.tanhao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author tanchaowen
 */
public class Test {

	public static void main(String[] args) {
		test1();
	}

	public static void test1(){

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		System.out.println(context.getBean("user"));

	}

}