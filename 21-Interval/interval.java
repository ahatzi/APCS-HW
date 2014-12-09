import java.io.*;
import java.util.*;
public class interval{

    private int low;
    private int high;
    private Random r = new Random();
    private int numIntervals = 0;

    public interval(int l,int h){
	low=l;
	high=h;
	numIntervals++;
    }
    public interval(){
        low = r.nextInt(100);
	high = low + 1 + r.nextInt(100);
	numIntervals++;
    }
    
    public String toString(){
        return "{"+low+","+high+"}";
    }

    public static void main(String[] args){
	interval[] a = new interval[10];
	for (int i=0;i<a.length;i++){
	    a[i] = new interval();
	}
	System.out.println(Arrays.toString(a));
    }

}
