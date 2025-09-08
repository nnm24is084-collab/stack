package stackperson;

public class Stack {
    private Person arr[];
    private int top;
    private int capacity;
    Stack(int size){
    	capacity=size;
    	arr=new Person[capacity];
    	top=-1;
    }
    Stack(Person[]inputArr){
    	capacity=inputArr.length;
    	arr=new Person[capacity];
    	top=-1;
    	for(int i=0;i<inputArr.length;i++) {
    		arr[++top]=inputArr[i];
    	}
    }
void push(Person p) {
	if(top==capacity-1) {
		System.out.println("stack overflow!"+p);
		return;
	}
	arr[++top]=p;
}
	
void push(Person p1,Person p2) {
	push(p1);
	push(p2);
}
Person pop() {
	if(top==-1) {
		System.out.println("stack underflow!");
		return null;
	}
	return arr[top--];
}
void pop(int n) {
	for(int i=0;i<n;i++) {
		Person p=pop();
		if(p !=null);
		System.out.println("popped");
		p.displayPerson();
		
	
	}
}

void display() {
	if(top==-1) {
		System.out.println("stack empty");
		return;
		
	}
	System.out.println("\n stack contents");
	for(int i=top;i>=0;i--) {
		arr[i].displayPerson();
	}
	}
	void display(int n) {
		if(top==-1) {
			System.out.println("stack is empty");
			return;
			
		}
	System.out.println("\n top"+n+"Person");
	for(int i=top;i>top-n&&i>=0;i--) {
		arr[i].displayPerson();
	}
	}
}





