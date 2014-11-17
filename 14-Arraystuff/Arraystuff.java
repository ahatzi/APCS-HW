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

    public int sum67(int[] nums) {
	int sum = 0;
	for (int i = 0;i<nums.length;i++) {
	    if (nums[i] != 6) {
		sum = sum + nums[i];
	    }
	    else {
		while (nums[i] != 7) {
		    i++;
		}
	    }
	}
	return sum;
    }

    public boolean more14(int[] nums) {
	int fours = 0;
	int ones = 0;
	for (int i = 0;i<nums.length;i++) {
	    if (nums[i] == 1) {
		ones++;
	    }
	    else if (nums[i] == 4) {
		fours++;
	    }
	}
	return (ones > fours);
    }

    public int[] tenRun(int[] nums) {
	for(int i = 0; i <nums.length; i ++){
	    if (nums[i]%10==0){
		if (i+1<nums.length){
		    if (nums[i+1]%10!=0){
			nums[i+1]=nums[i];
		    }
		}
	    }
	}
	return nums;
    }

    public boolean tripleUp(int[] nums) {
	for (int i = 0;i<nums.length-2;i++) {
	    if (nums[i+1] == nums[i]+1) {
		if (nums[i+2] == nums[i+1]+1) {
		    return true;
		}
	    }
	}
	return false;
    }

    public boolean canBalance(int[] nums) {
	int sum = 0;
	for (int i = 0;i<nums.length;i++) {
	    sum = sum + nums[i];
	}
	int halfsum = 0;
	for (int i = 0;i<nums.length;i++) {
	    halfsum = halfsum + nums[i];
	    if (halfsum == sum/2.0) {
		return true;
	    }
	}
	return false;
    }

    public int[] seriesUp(int n) {
	int[] nums = new int[n*(n+1)/2];
	int a = 1;
	int count = 0;
	for (int i = 0;i<n;i++) {
	    int b = 1;
	    while (b <= a) {
		nums[count] = b;
		count = count + 1;
		b++;
	    }
	    a++;
	}
	return nums;
    }

    public int freq(int i) {
	int num = a[i];
	for (int b = 0;b<a.length;b++) {
	    if (a[b] == num) {
		num++;
	    }
	}
	return num;
    }

    public int mode(int[] A) {
	int[] buckets = new int[A.length];
	for (int b = 0;b<A.length;b++) {
	    buckets[A[b]]++;
	}
	int biggest = buckets[0];
	for (int b=0;b<buckets.length;b++) {
	    if (buckets[b] > biggest) {
		biggest = buckets[b];
	    }
	}
	retnum = 0;
	for (int b = 0;b<buckets.length;b++) {
	    if (buckets[b] == biggest) {
		retnum = b;
	    }
	}
	return retnum;
    }
    /*-----------------Test----------------------*/
    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	//System.out.println(as);
	//System.out.println(as.find(1));
	//System.out.println(as.maxVal());
	//System.out.println(as.sum67({1,2,3,6,5,4,7,3}));
	//System.out.println(as.tenRun({));
	//System.out.println(as.more14(a));
	//System.out.println(as.tripleUp(a));
	//System.out.println(as.canBalance(a));
	//System.out.println(as.seriesUp(5));
	//System.out.println(as.freq(2));
	int[] hi = {1,2,3,4,4,4,5,1,2};
	System.out.println(as.mode(hi));
    }
}
