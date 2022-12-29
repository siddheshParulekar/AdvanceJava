package staticFinalDemo;

import abstraction.interfaceDemo;

public class StaticDemo {

	static int count = 1;
	static String msgString = "StreamApi";
     static int num ;
	int count2 = 1;

	static void change() {
		msgString = "LambdaExpression";
		num=10;
		
	}

	public StaticDemo() {
		super();
		count++;
		count2++;
	}

	public static void main(String[] args) {
		StaticDemo staticDemo = new StaticDemo();
		System.out.println(staticDemo.count2);
		System.out.println(StaticDemo.count);
		StaticDemo staticDemo2 = new StaticDemo();
		System.out.println(staticDemo2.count2);
		System.out.println(StaticDemo.count);
		
		System.out.println(StaticDemo.msgString);
		StaticDemo.change();
		System.out.println(staticDemo.msgString);
		System.out.println(StaticDemo.num);

	}

}
