package com.partialabsract;

public class FullyAbsractChild implements FullyAbstract {
//	public class FullyAbsractChild implements FullyAbstract,interface1 {
	public static void main(String[] args) {
		FullyAbsractChild child = new FullyAbsractChild();
		child.sample1();
		child.sample2();
		child.newfun();
		child.machine();
		child.machineName();
	}

	@Override
	public void sample1() {
		int a = 0, b = 1, c = 0;
		for (int i = 2; i <= 10; i++) {

			c = a + b;
			a = b;
			b = c;

			System.out.println("The value of fibanaci series " + c);
		}

	}

	@Override
	public void sample2() {
		System.out.println("\n\tUser can write here them logics");
//		example
		int a = 10, b = 20, c;
		c = a + (-b);
		System.out.println("th value of c" + c);

	}

	@Override
	public void newfun() {
		int r = 121, s = 0, t = r;
		r = r % 10;
		s = s * 10 + r;
		r = r / 10;
		if (t == r) {
			System.out.println("is polyndrome");
		} else {
			System.out.println("not polyndrome");
		}
	}

	@Override
	public void machine() {
	
//		factorial
		int f=1;
		for (int i = 1; i <10; i++) {
			f=f*i;
			System.out.println("the factrial of given value"+f);
		}
		
	}

	@Override
	public void machineName() {
	
		System.out.println("The machine name = Engine");
	}

}
