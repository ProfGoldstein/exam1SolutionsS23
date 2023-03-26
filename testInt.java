import java.util.*;

/**
   Question B1 testing, Exam 1, Spring 2022, CSIS-225

   @author Ira Goldstein
*/

class testInt {


	public static void main(String args[]) {

		Integer a1[] = new Integer[5];
		a1[0] = 8;
		a1[1] = 3;
		a1[2] = 0;
		a1[3] = 10;
		a1[4] = 5;

		Iterator<Integer> i = new IntArrayBigValsIterator(a1, 5);
		System.out.println("\n Testing 5");
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		Integer a3[] = new Integer[1];
		a3[0] = 0;
		
		Iterator<Integer> i3 = new IntArrayBigValsIterator(a3, 0);
		System.out.println("\n Testing a3 0");
		while (i3.hasNext()) {
			System.out.println(i3.next());	
		}
	
	
		Iterator<Integer> l = new IntArrayBigValsIterator(a1, -1);
		System.out.println("\n Testing -1");
		while (l.hasNext()) {
			System.out.println(l.next());
		}
		
		
		Integer a2[] = new Integer[1];
		a2[0] = 8;
		
		Iterator<Integer> i2 = new IntArrayBigValsIterator(a2, 9);
		System.out.println("\n Testing a2 9");
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		
		Iterator<Integer> k = new IntArrayBigValsIterator(a1, 10);
		System.out.println("\n Testing 10");
		while (k.hasNext()) {
			System.out.println(k.next());
		}
		
		Iterator<Integer> j = new IntArrayBigValsIterator(a1, 6);
		System.out.println("\n Testing 6");
		while (j.hasNext()) {
			System.out.println(j.next());
		}


		Iterator<Integer> k1 = new IntArrayBigValsIterator(a1, 11);
		System.out.println("\n Testing 11");
		while (k1.hasNext()) {
			System.out.println(k1.next());
		}		
	}
}
