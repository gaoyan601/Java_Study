package com.study.clazz;

public class InnerClass {

	/**
	 * 如果在内部类中使用外部方法的参数，该参数的类型必须是final型！
	 * 
	 * @param age
	 * @param name
	 */
	public void innerClass_mothod(int age, final String name) {
		class Inner_Method {
			String iname;
			int iage;

			public Inner_Method(String iname, int iage) {
				// TODO Auto-generated constructor stub
				this.iname = iname;
				this.iage = iage;
			}

			public void tt() {
				InnerClass ic = InnerClass.this;
				ic.innerClass_mothod(10, "nihao");
				iname = name;
				System.out.println(iname + iage);
			}
		}
		Inner_Method i = new Inner_Method("gaoyan", 30);
		i.tt();
	}

	class Inner {
		String name;
		int age;

		public Inner(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public void print() {
			System.out.println(name + age);
		}
	}

	InnerClass ic = new InnerClass();
	Inner i = ic.new Inner(null, 0);
}
