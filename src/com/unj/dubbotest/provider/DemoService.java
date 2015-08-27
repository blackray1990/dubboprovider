package com.unj.dubbotest.provider;

import java.util.List;
/**
 * 接口和使用到的类单独打成jar包给消费者引用
 * @author Hejinsheng
 *
 */
public interface DemoService {

	String sayHello(String name);

	public List getUsers();

}