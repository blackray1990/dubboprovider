package com.unj.dubbotest.provider.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务提供者1
 * @author Hejinsheng
 *
 */
public class Provider {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		context.start();
		System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
	}
}