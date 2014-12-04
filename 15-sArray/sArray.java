public class sArray{
    private String[] data; //should be Object[]
    int items;
    
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
	    data[index]="";
	    return a;
	}catch (IndexOutOfBoundsException e){
	    System.out.println("Error: " + e);
	}
    }
}
