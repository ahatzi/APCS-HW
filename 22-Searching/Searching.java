import java.io.*;
import java.util.*;
public class Searching{
    Comparable[] a;

    public Searching(int l){
	a = new Comparable[l];
    }

    public void additem(Comparable x){
	Comparable[] b = new Comparable[a.length+1];
	for (int i = 0;i<a.length;i++){
	    b[i] = a[i];
	}
	b[b.length-1] = x;
    }
    
    public void sort(){
	Arrays.sort(a);
    }
 
    public Comparable lsearch(Comparable[] a,Comparable x){
	for (int i=0;i<a.length;i++){
	    if (a[i].equals(x)){
		return x;
	    }
	}
	return null;
    }

    /*
    public Comparable bsearch(Comparable[] a,Comparable x){
	if (a[a.length/2].equals(x)){
	    return x;
	}
	else if (a[a.length/2].compareTo(x) == -1){
	    for (int i=(a.length/2)+1;i<a.length;i++){
		if (a[i].equals(x)){
		    return x;
		}
	    }
	    return -1;
	}
	else {
	    for (int i
	}
    }

    public Comparable rbsearch(Comparable[] a,Comparable x){
	
    }
    */

    public static void main(String[] args){
	Searching x = new Searching(10);
	Random r = new Random();
	for (int i=0;i<x.a.length;i++){
	    x.additem(r.nextInt(100));
	}
    }
}
