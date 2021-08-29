package replit;



interface infB{
	int x=3;
	int myMethod();
	
	
}

interface infA extends infB{
	int x =7;
	int y=9;
	int myMethod();
}

class MyClass implements infA{

	 int x=5;
	
	@Override
	public int myMethod() {
	
		return x;
	}
	
	

	
	public static void main(String[] args) {
	
		System.out.println(y);
		//System.out.println(x);

	}}

	
