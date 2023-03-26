import java.util.Iterator;

/**
   CSIS 225 Exam 1 Spring 2023

   @author Jim Teresco (starter framework)
   @author Ira Goldstein (Solutions)
*/
public class IntArrayBigValsIterator implements Iterator<Integer> {
	Integer[] a;
	int bigVal;
	int current;

	// Constructor
    public IntArrayBigValsIterator(Integer a[], int bigVal) {
		this.a = a;
		this.bigVal = bigVal;
		current = 0;
    }
	
	
	// hasNext - returns boolean
	// return is based upon there being an item that i>= the threshold bigVal
	public boolean hasNext() {
		for (int i = current; i < a.length; i++) {
			if (a[i] >= bigVal) {
				current = i;
				return true;	
			}
		}
		current = a.length;
		return false;
	}

	// next - returns an int or throws an exception if the .next() goes beyond the end of the list
	public Integer next() {
		for (int i = current; i < a.length; i++) {
			if (a[i] >= bigVal) {
				current = i + 1;
				return a[i];
			}
		}
		throw new RuntimeException("Attempted To .next() Beyond End 	Of Array\n\tShould have checked for .hasNext()");
		//return null;
	}


    public static void main(String args[]) {

		Integer a1[] = new Integer[5];
		a1[0] = 8;
		a1[1] = 3;
		a1[2] = 0;
		a1[3] = 10;
		a1[4] = 5;

		Iterator<Integer> i = new IntArrayBigValsIterator(a1, 5);
		while (i.hasNext()) {
			System.out.println(i.next());
		}
    }  
}
