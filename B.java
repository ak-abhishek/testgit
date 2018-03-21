import java.io.*;
class A{
	int a;
	A(){
		System.out.println("A constructor");
	}
}
class B {
int b;
	B(){
		A a;
	 this.b=0;
	 //System.out.println(this.a);
	}
	public static void main(String ar[])throws IOException{
		B b=new B();
	}
}