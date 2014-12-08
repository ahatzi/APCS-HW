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
	int comparisons = 0;
	int assignments = 0;
	for (int i=1;i<data.length;i++){
	    for (int j=i;j>0;j--){
		if (data[j] < data[j-1]){
		    int shift1 = data[j];
		    int shift2 = data[j-1];
		    data[j-1] = shift1;
		    data[j] = shift2;
		    assignments = assignments + 4;
		}
	    }   
	} 
	System.out.println(assignments);
    }

    public void ssort(){
	int comparisons = 0;
	int assignments = 0;
	for (int j=0;j<data.length-1;j++){
	    int lowestIndex = j;
	    assignments++;
	    for (int i=j+1;i<data.length;i++){
		if (data[i] < data[lowestIndex]){
		    lowestIndex = i;
		    assignments++;
		}
	    }
	    int swap1 = data[j];
	    int swap2 = data[lowestIndex];
	    data[j] = swap2;
	    data[lowestIndex] = swap1;
	    assignments = assignments + 4;
	}
	System.out.println(assignments);
    }

    public void bsort(){
	int comparisons = 0;
	int assignments = 0;
	for (int i=data.length-1;i>0;i--){
	    for (int j=0;j<i;j++){
		if (data[j] > data[j+1]){
		    int swap1 = data[j];
		    int swap2 = data[j+1];
		    data[j] = swap2;
		    data[j+1] = swap1;
		    assignments = assignments + 4;
		}
	    }
	}
	System.out.println(assignments);
    }
   
    //-------------------Testing--------------------

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
	
	System.out.println();
	
	//for isort()
	myArray y = new myArray();
	y.add(1);
	y.add(192);
	y.add(5);
	y.add(9);
	y.add(200);
	y.add(98);
	y.add(6);
	y.add(298);
	y.add(0);
	y.add(87);
	y.add(240);
	y.add(80);
	y.add(8);
	System.out.println(y);
	y.isort();
	System.out.println(y);
	
	System.out.println();

	//for ssort()
	myArray z = new myArray();
	z.add(1);
	z.add(192);
	z.add(5);
	z.add(9);
	z.add(200);
	z.add(98);
	z.add(6);
	z.add(298);
	z.add(0);
	z.add(87);
	z.add(240);
	z.add(80);
	z.add(8);
	System.out.println(z);
	z.ssort();
	System.out.println(z);
    }
}
