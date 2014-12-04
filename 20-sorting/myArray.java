public class myArray {
    private int[] data;
    private int last;

    public myArray() {
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
	for (int i = 0; i < data.length; i++) {
	    Arraystring += data[i] + ", ";
	}
	return Arraystring + "}";
    }

    //---------------3 different sorting methods----------------

    public void isort(){
	for (int i=1;i<data.length;i++){
	    for (int j=i;j>0;j--){
		if (data[j] < data[j-1]){
		    int shift1 = data[j];
		    int shift2 = data[j-1];
		    data[j-1] = shift1;
		    data[j] = shift2;
		}
	    }   
	} 
    }

    public void ssort(){
	for (int j=0;j<data.length-1;j++){
	    int lowestIndex = j;
	    for (int i=j+1;i<data.length;i++){
		if (data[i] < data[lowestIndex]){
		    lowestIndex = i;
		}
	    }
	    int swap1 = data[j];
	    int swap2 = data[lowestIndex];
	    data[j] = swap2;
	    data[lowestIndex] = swap1;
	}
    }

    public void bsort(){
	for (int i=data.length-1;i>0;i--){
	    for (int j=0;j<i;j++){
		if (data[j] > data[j+1]){
		    int swap1 = data[j];
		    int swap2 = data[j+1];
		    data[j] = swap2;
		    data[j+1] = swap1;
		}
	    }
	}
    }
    
    public static void main(String[] args){
	myArray x = new myArray();
	//for bsort()
	x.add(1);
	x.add(192);
	x.add(5);
	x.add(9);
	x.add(200);
	x.add(98);
	x.add(6);
	x.add(298);
	x.add(0);
	x.add(87);
	x.add(240);
	x.add(80);
	x.add(8);
	System.out.println(x);
	x.bsort();
	System.out.println(x);
	//for isort()
	x.add(1);
	x.add(192);
	x.add(5);
	x.add(9);
	x.add(200);
	x.add(98);
	x.add(6);
	x.add(298);
	x.add(0);
	x.add(87);
	x.add(240);
	x.add(80);
	x.add(8);
	System.out.println(x);
	x.isort();
	System.out.println(x);
	//for ssort()
	x.add(1);
	x.add(192);
	x.add(5);
	x.add(9);
	x.add(200);
	x.add(98);
	x.add(6);
	x.add(298);
	x.add(0);
	x.add(87);
	x.add(240);
	x.add(80);
	x.add(8);
	System.out.println(x);
	x.ssort();
	System.out.println(x);
    }
}
