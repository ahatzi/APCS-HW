import java.util.*;

public class Arraystuff {
    /*-------------------- Instance Variables --------------------*/

    private int[] a;
    private Random rnd;
    /* by making a variable final we can't change
       the value after the initial asssignment 
    */
    public final int final_example = 123;

    /*-------------------- Constructors --------------------*/
    
    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }
    
    public Arraystuff() {
	this(100);
    }

    /*-------------------- Methods --------------------*/
    public String toString(){
	String s="";
	for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	return s;
    }

    public int find(int n) {
	for (int i = 0;i<a.length;i++) {
	    if (a[i] == n) {
		return i;
	    }
	}
	return -1;
    }

    public int maxVal() {
	int max = 0;
	for (int i = 0;i<a.length;i++) {
	    if (a[i] > max) {
		max = a[i];
	    }
	}
	return max;
    }

    /*-----------------Test----------------------*/
    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	System.out.println(as);
	System.out.println(as.find(1));
	System.out.println(as.maxVal());
    }
}
