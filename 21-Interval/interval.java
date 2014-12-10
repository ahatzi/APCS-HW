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

    public int compareTo(interval other){
	int low1 = this.low;
	int low2 = other.low;
	int high1 = this.high;
	int high2 = other.high;
	if ((low1 == low2)&&(high1 == high2)){
	    return 0;
	}
	else if (low1 < low2){
	    return -1;
	}
	else if (low1 > low2){
	    return 1;
	}
	else if (high1 > high2){
	    return 1;
	}
	else {
	    return -1;
	}
    }

    public static void main(String[] args){
	interval[] a = new interval[10];
	for (int i=0;i<a.length;i++){
	    a[i] = new interval();
	}
	//System.out.println(Arrays.toString(a));
	
	interval x = new interval(9,30);
	interval y = new interval(9,20);
	System.out.println(y.compareTo(x));
    }

}
