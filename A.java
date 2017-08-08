package Lictp1;


interface i1{
	
	void D();
	
	
	
}


interface i2{
	
	void Q();
	void Z();
	
	
}

class B implements i1,i2{

	@Override
	public void Q() {
		// TODO Auto-generated method stub
		
		System.out.println(" this is abstract method1");

		
	}

	@Override
	public void Z() {
		// TODO Auto-generated method stub
		System.out.println(" this is abstract method2");

	}

	@Override
	public void D() {
		// TODO Auto-generated method stub
		System.out.println(" this is abstract method3");

	}
	
	
	
	
}

public class A {

	public static void main(String[] args) {
		
		
		
		B obb=new B();
		obb.D();
		obb.Q();
		obb.Z();
		
		
		//userB obaz=new userB();
		//obaz.M2();
		
		
		// TODO Auto-generated method stub

	}




}