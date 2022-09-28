package Programs;
import Methods.chainstructure.ChainStructure;
public class Test{

	public static void shwoList(ChainStructure l)
	{
				String s="";
				int i = 0;
			
				for (i = 0; i < l.getQtElements(); i++){
					try {
                        s = l.searchForPlace(i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }				
					System.out.print(s + " ");
				}
					
				System.out.println(" End.");
	}

	public static void main(String[] args) {
		ChainStructure l = new ChainStructure();		
		String s1 = new String("a");
		String s2 = new String("b");
		String s3 = new String("c");
		String s4 = new String("d");
		String s5 = new String("e");

		//addFirst()

		System.out.println("\n\n addFirst()\n");
		l.addFirst(s1);
		l.addFirst(s2);
		l.addFirst(s3);
		l.addFirst(s4);
		l.addFirst(s5);
		shwoList(l);
		//System.exit(0);

		//End of First test.

		//-------------------------------		
		//	add() no final		
		System.out.println("\n\n add() \n");
		l.addLast(s1);
		l.addLast(s2);
		l.addLast(s3);
		l.addLast(s4);
		l.addLast(s5);
		shwoList(l);		
		//System.exit(0);

		//End of second test.

		//-------------------------------		
		//	get()		
		System.out.println("\n\n get() \n");
		shwoList(l);
		
		for (int i = 0; i < l.getQtElements(); i++)
            System.out.println("i = " + i + "  get(i) = " + l.searchForPlace(i));
		try {
            System.out.println(l.searchForPlace(30));
			System.out.println("Found element 30.");
		}
		catch (Error ex) {
			System.out.println("Element 30 not found.");
		}
		try {
            System.out.println(l.searchForPlace(-1));
			System.out.println("Found element -1.");
		}
		catch (Error ex) {
			System.out.println("Element -1 not found.");
		}

		
		l.remove(4);
		shwoList(l);
		l.remove(3);
		shwoList(l);
		l.remove(2);
		shwoList(l);
		l.remove(1);
		shwoList(l);
		l.remove(0);
		shwoList(l);


		//-------------------------------		
		//		add(0) e remove(0)		
		System.out.println("\n\nadd(0) e remove(0)\n");
		l.add(0,s1);
		l.add(0,s2);
		l.add(0,s3);
		l.add(0,s4);
		l.add(0,s5);

		try {
            System.out.println(l.searchForPlace(30));
		}
		catch (Error ex) {
			System.out.println("Element 30 not found.");
		}

		shwoList(l);

		l.remove(0);
		shwoList(l);
		l.remove(0);
		shwoList(l);
		l.remove(0);
		shwoList(l);
		l.remove(0);
		shwoList(l);
		l.remove(0);
		shwoList(l);

		//-------------------------------		
		//-------------------------------		
		//		add(i) e remove(i)		
		System.out.println("\n\nadd(i) e remove(i)\n");
		l.add(0, s1);
		l.add(1, s5);
		l.add(1, s3);
		l.add(2, s4);
		l.add(1, s2);
		shwoList(l);
		
		l.remove(0);
		shwoList(l);
		l.remove(0);
		shwoList(l);
		l.remove(0);
		shwoList(l);
		l.remove(0);
		shwoList(l);
		l.remove(0);
		shwoList(l);

		l.add(0, s4);
		l.add(0, s1);
		l.add(2, s5);
		l.add(1, s3);
		l.add(1, s2);
		shwoList(l);

		try {
			l.remove(5);
		}
		catch (Error ex){
			System.out.println("Element number 5 does not exist.");
		}
		shwoList(l);
		l.remove(0);
		shwoList(l);
		l.remove(3);
		shwoList(l);
		l.remove(1);
		shwoList(l);
		l.remove(0);
		shwoList(l);
		l.remove(0);
		shwoList(l);

	}

}