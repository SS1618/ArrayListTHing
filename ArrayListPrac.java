import java.util.ArrayList;
public class ArrayListPrac{
	public static void main(String[]args){
		ArrayList<Integer> koo = new ArrayList<>();
		koo.add(1);
		koo.add(2);
		koo.add(3);
		ArrayList<Integer> moo = new ArrayList<>();
		moo.add(5);
		moo.add(8);
		moo.add(4);
		System.out.println(combineList(koo,moo));
		printList(moo);
		ArrayList<Integer> joo = new ArrayList<>();
		joo.add(3);
		joo.add(4);
		joo.add(3);
		joo.add(9);
		joo.add(9);
		System.out.println();
		System.out.println(joo);
		System.out.println(removeDuplicates(joo));
	}
	public static ArrayList<Integer> combineList(ArrayList<Integer> foo, ArrayList<Integer> poo){
		ArrayList<Integer> goo = new ArrayList<>();
		for(int i = 0; i<foo.size(); i++){
			goo.add(foo.get(i));
		}
		for(int i = 0; i<poo.size(); i++){
			goo.add(poo.get(i));
		}
		return goo;
	}
	public static void printList(ArrayList<Integer> foo){
		for(int i = 0; i<foo.size(); i++){
			System.out.print(foo.get(i));
			if(i != foo.size()-1){
				System.out.print(", ");
			}
		}
	}
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> foo){
		ArrayList<Integer> fooCopy = new ArrayList<>();
		/*for(int i = 0; i<foo.size(); i++){
			fooCopy.add(foo.get(i));
		}*/
		for(int i = 0; i<foo.size(); i++){
			fooCopy.add(foo.get(i));
			for(int j = i; j<foo.size(); i++){
				if(foo.get(i) == foo.get(j)){
					fooCopy.remove(fooCopy.size()-1);
				}
			}

		}
		return fooCopy;
	}
}