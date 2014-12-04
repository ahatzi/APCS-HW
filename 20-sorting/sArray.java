import java.util.Arrays;

public class sArray{
    private String[] data; //should be Object[]
    int items;




    public int[] datanum;




    //This is for hw 20
    public sArray(){
	
	int[]datanum = new int[10];
	datanum[0] = 9;
	datanum[1] = 10;
	datanum[2] = 3;
	datanum[3] = 4;
	datanum[4] = 5;
	datanum[5] = 6;
	datanum[6] = 7;
	datanum[7] = 8;
	datanum[8] = 1;
	datanum[9] = 2;
	
	System.out.println(" SArray before isort: " + Arrays.toString(datanum));
	
	isort();
	System.out.println(" SArray after isort; " + Arrays.toString(datanum));
    }



    /*
    public sArray(){
	//start array at size 100
	int[] data = new int[100];
	items = 0;
    }
    
    public boolean add(String i){ //add to end
	if (items == data.length){
	    String[] newdata = new String[data.length+1];
	    for (int a = 0;a<data.length;a++){
		newdata[a]=data[a];
	    }
	    newdata[data.length]=i;
	    data = newdata;
	}
	else{
	    data[items]=i;
	}
	items++;
	return true;
    }
    public void add(int index,String i){ //add to location index; shift everything else down
	try{
	    if (items == data.length){
		String[] newdata = new String[data.length+1];
		for (int a = 0;a<index;a++){
		    newdata[a]=data[a];
		}
		newdata[index]=i;
		for (int a = index+1;a<newdata.length;a++){
		    newdata[a]=data[a-1];
		}
		data=newdata;
	    }
	    else{
		for (int a = items;a>index;a--){
		    data[a] = data[a-1];
		}
		data[index]=i;
	    }
	    items++;
	}catch (Exception e){
	    System.out.println("Error: " + e);
	}
    }
    public String get(int index){
	try{
	    return data[index];
	}catch (IndexOutOfBoundsException e){
	    System.out.println("Error: " + e); 
	}
    }
    public String set(int index,String i){
	try{
	    String a = data[index];
	    data[index]=i;
	    return a;
	}catch (IndexOutOfBoundsException e){
	    System.out.println("Error: " + e);
	}
    }
    public int size(){
	return items;
    }
   
     public String remove(int index){
	try{
	    String a = data[index];
	    data[index]=0;
	    return a;
	}catch (IndexOutOfBoundsException e){
	    System.out.println("Error: " + e);
	}
    }
    */

    //**********HOMEWORK 20*****************
    public void shift(int change) {
	int i;

	int x = datanum[change];
	for (i = change; i > 0 && x < datanum[i-1] ; i--) {
	    datanum[i] = datanum[i-1];    
	}
	datanum[i]=x;
    }


    public void isort() {
	try {
	    for (int i=1; i < 10; i++){
		if (datanum[i] < datanum[i-1]){
		    shift(i);
		}
	    }
	}
	catch (Exception e){
	    System.out.println("whoopsie daisy");
	}
    }
    //******DRIVER***********
    public static void main(String[] args){
	sArray s = new sArray();

    }

}
