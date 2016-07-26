package com.study.proxy;

public class Proxies {
	ClassA ca;

	public Proxies(ClassA ca) {
		super();
		this.ca = ca;
	}

	public void proxy_A(String str1, String str2) {
		System.out.println("proxy_A" + str1);
		ca.method_A(str2);
	}

	public void proxy_B(String str1, String str2) {
		System.out.println("proxy_B" + str1);
		ca.method_B(str2);
	}

}
