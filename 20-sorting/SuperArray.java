public class SuperArray {
    private int[] data;
    private int last;

    public SuperArray() {
        data = new int[0];
	last = 0;
    }

    public boolean add(int i){
	int[] data1 = new int[last + 1];
	for (int j = 0; j < last; j++) {
	    data1[j] = data[j];
	}
	data1[last] = i;
	data = data1;
	last++;
	return true;
    }
    
    public void add(int index, int i){
	int[] data1 = new int[last + 1];
	for (int j = 0; j < index; j++) {
	    data1[j] = data[j];
	}
	data1[index] = i;
	for (int j = index+1; j < last+1; j++) {
	    data1[j] = data[j-1];
	}
	last++;
	data = data1;
    }
    
    public int size() {
        return last;
    }

    public int get(int index) {
        return data[index];
    }

    public int set(int index, int i){
        int old = data[index];
	data[index] = i;
	return old;
    }

    public int remove(int index){
        int old = data[index];
	int[] data1 = new int[last-1];
	int j = 0;
	for (int i = 0; i < last; i++) {
	    if (i != index) {
		data1[j] = data[i];
		j++;
	    }
	}
	data = data1;
	last--;
	return old;	
    } 

    public String toString() {
	String Arraystring = "{";
	for (int i = 0; i < data.length - 1; i++) {
	    Arraystring += data[i] + ", ";
	}
	return Arraystring + data[data.length -1] + "}";
    }

    //**********HOMEWORK 20*****************
    public void shift(int change) {
	int i;

	int x = data[change];
	for (i = change; i > 0 && x < data[i-1] ; i--) {
	    data[i] = data[i-1];    
	}
	data[i]=x;
    }

    public void isort() {
	try {
	    for (int i=1; i < 10; i++){
		if (data[i] < data[i-1]){
		    shift(i);
		}
	    }
	}
	catch (Exception e){
	    System.out.println("whoopsie daisy");
	}
    }

    //************DRIVER*****************

    public static void main(String[] args) {
	SuperArray s = new SuperArray();
	System.out.println(s.add(5));
	System.out.println(s.add(3));
	System.out.println(s.add(1));
	s.add(0, 4);
	System.out.println("Before isort: " + s);
	s.isort();
	System.out.println("After isort: " + s);
    }
}
