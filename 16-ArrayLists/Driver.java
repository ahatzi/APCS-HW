import java.io.*;
import java.util.*;
public class Driver{

    public ArrayList<Integer> removeDuplicates(ArrayList<Integer> a){
	for (int i=0;i<a.size();i++){
	    if (a.get(i+1) == a.get(i)){
		a.remove(i+1);
		i--;
	    }
	}
	return a;
    }

    public static void main (String[] args){
	Random r = new Random();
	ArrayList<Integer> b = new ArrayList<Integer>();
	for (int i = 0;i<20;i++){
	    b.add(r.nextInt(10));
	}
	System.out.println(removeDuplicates(b));
    }
}
