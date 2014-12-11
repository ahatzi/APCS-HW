public class search{
    public Comparable lsearch(Comparable[] a,Comparable x){
	for (int i=0;i<a.length;i++){
	    if (a[i].equals(x)){
		return x;
	    }
	}
	return -1;
    }

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
}
