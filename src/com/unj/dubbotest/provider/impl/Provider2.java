package com.unj.dubbotest.provider.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 服务提供者2
 * 与服务提供者1组成分布式服务
 * @author Hejinsheng
 *
 */
public class Provider2 {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext2.xml" });
		context.start();
		System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
	}
}