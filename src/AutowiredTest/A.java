package AutowiredTest;

public class A {

	B b;
	A(){

		System.out.println("a is create");
	}
	
	B getB(){
		return b;
	}
	
	
	void setB(B b){
		this.b =b;
	}
	
	void print() {
		System.out.println("hello a");
	}
	void display() {
		
		print();
		b.print();
	}

}

