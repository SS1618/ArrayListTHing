import java.util.ArrayList;
public class ArrayListPrac{
	public static void main(String[]args){

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
}