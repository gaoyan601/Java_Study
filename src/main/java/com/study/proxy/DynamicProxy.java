package com.study.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

	private Object proxied;

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("proxy:" + proxy.getClass() + "\tmethod:" + method + "\targs:" + args.toString());
		return method.invoke(proxied, args);
	}

	public DynamicProxy(Object proxied) {
		super();
		this.proxied = proxied;
	}

}
