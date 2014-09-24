public class codingbat2 {
    public boolean nearHundred(int n) {
	if (Math.abs(100-n)<= 10){
	    return true;
	}
	else if (Math.abs(200-n)<= 10){
	    return true;
	}
	else{
	    return false;
	}
    }
    public boolean mixStart(String str) {
	if (str.length() < 3) {
	    return false;
	}
	else {
	    String str2 = str.substring(1);
	    return str2.startsWith("ix");
	} 
    }
    public int teaParty(int tea, int candy) {
	if (tea< 5 || candy<5){
	    return 0;
	}
	else if ((tea>= (candy*2)) || (candy >= (tea * 2))) {
	    return 2;
	}
	else{
	    return 1;
	}  
    }
    public boolean lastDigit(int a, int b, int c) {
	int a2 = a % 10;
	int b2 = b % 10;
	int c2 = c % 10; 
	if (a2 ==b2 || a2 == c2 || c2 == b2) {
	    return true;
	}
	else {
	    return false;
	}
    }
}
