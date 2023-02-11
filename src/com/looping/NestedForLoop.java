package com.looping;

public class NestedForLoop {

	public static void main(String[] args) {
//				1			2	4
		for (int i = 0; i < 3; i++) {
//			3.1
			System.out.println(i);
//					  1.1	 2.1	4.1
			for (int j = 0; j < 3; j++) {
//				3.2
				System.out.println(j);
				
			}
			
			/*
1		2	3.1		3.2		1.1		2.2		4.1		4
i=0	  i<3t	s(i)	j=0		j<3		s(j)	j++		i++
==========================================================
i=0	  0<3t    0     j=0		0<3t	0		0+1
					j=1		1<3t	1		1+1
					j=2		2<3t	2		2+1
					j=3		3<3f.....................0+1
i=1	  1<3t    1     j=0		0<3t	0		0+1
					j=1		1<3t	1		1+1
					j=2		2<3t	2		2+1
					j=3		3<3f.....................1+1

			*/
		}
	}

}
