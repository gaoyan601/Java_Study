package com.study.proxy;

import java.lang.reflect.Proxy;

public class MClass {

	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ca.method_A("---a");
		ca.method_B("---b");

		Proxies p = new Proxies(ca);
		p.proxy_A("---a1", "---a2");
		p.proxy_B("---b1", "---b2");

		ClassA dca = (ClassA) Proxy.newProxyInstance(ClassA.class.getClassLoader(), new Class[] { ClassA.class },
				new DynamicProxy(ca));
		
		dca.method_A("---a");
		dca.method_B("---b");
	}
}
