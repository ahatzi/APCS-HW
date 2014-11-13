import java.io.*;
import java.util.*;
public class Driver{
    
    public static void main (String[] args){
	Random r = new Random();
	ArrayList<Integer> b = new ArrayList<Integer>();
	for (int i = 0;i<20;i++){
	    b.add(r.nextInt(5));
	}
	System.out.println(b);

	for (int i=0;i<b.size()-1;i++){
	    if (b.get(i+1) == b.get(i)){
		b.remove(i+1);
		i--;
	    }
	}
        System.out.println(b);
    }

}
