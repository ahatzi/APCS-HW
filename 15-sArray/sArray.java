public class sArray{
    private int[] data; //should be Object[]
    int items;
    
    public sArray(){
	//start array at size 100
	int[] data = new int[100];
	items = 0;
    }
    
    public boolean add(int i){ //add to end
	if (items = data.length){
	    int[] newdata = new int[data.length+1];
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

    public void add(int index,int i){ //add to location index; shift everything else down
	try{
	    if (items = data.length){
		int[] newdata = new int[data.length+1];
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
	    items++
	}catch (Exception e){
	    System.out.println("Error: " + e);
	}
    }

    public int get(int index){
	try{
	    return data[index];
	}catch (IndexOutOfBoundsException e){
	    System.out.println("Error: " + e); 
	}
    }

    public int set(int index,int i){
	try{
	    int a = data[index];
	    data[index]=i;
	    return a;
	}catch (IndexOutOfBoundsException e){
	    System.out.println("Error: " + e);
	}
    }

    public int size(){
	return items;
    }

    public int remove(int index){
	try{
	    int a = data[index];
	    data[index]=0;
	    return a;
	}catch (IndexOutOfBoundsException e){
	    System.out.println("Error: " + e);
	}
    }
}
