
/**
 * Creates a word search puzzle
 *
 */
import java.io.*;
import java.util.*;

public class WordSearch2{
    private char[][] board;

    public WordSearch2(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }

    public WordSearch2(){
	this(20,30);
    }

    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public boolean doesOverlap (String w,int row,int col,int num){
	int r = row;
	int c = col;
	for (int i=0;i<w.length();i++){
	    if (board[r][c] != '.'){
		return true;
	    }
	    if (num == 0){
		c++;
	    }
	    else if (num == 1){
	        r++;
	    }
	    else if (num == 2){
		c++;
		r--;
	    }
	    else if (num == 3){
		c++;
		r++;
	    }
	}
	return false;
    }


    public boolean addWordHforward (String w,int row,int col){
	int r=row, c=col;
	if ((c + w.length()) > board[1].length){
	    c = c - ((c + w.length()) - board[1].length);
	}
	if (doesOverlap(w,r,c,0)){
	    return false;
	}
	for (int i=0;i<w.length();i++){
	    board[r][c] = w.charAt(i);
	    c++;
	}
	return true;
    }

    public boolean addWordHbackward (String w,int row,int col){
	int r=row, c=col;
	if ((c + w.length()) > board[1].length){
	    c = c - ((c + w.length()) - board[1].length);
	}
	if (doesOverlap(w,r,c,0)){
	    return false;
	}
	for (int i=w.length()-1;i>=0;i--){
	    board[r][c] = w.charAt(i);
	    c++;
	}
	return true;
    }

    public boolean addWordVdown (String w,int row,int col){
	int r=row, c=col;
	if ((r + w.length()) > board.length){
	    r = r - ((r + w.length()) - board.length);
	}
	if (doesOverlap(w,r,c,1)){
	    return false;
	}
	for (int i=0;i<w.length();i++){
	    board[r][c]=w.charAt(i);
	    r++;
	}
	return true;
    }

    public boolean addWordVup (String w,int row,int col){
	int r=row, c=col;
	if ((r + w.length()) > board.length){
	    r = r - ((r + w.length()) - board.length);
	}
	if (doesOverlap(w,r,c,1)){
	    return false;
	}
	for (int i=w.length()-1;i>=0;i--){
	    board[r][c]=w.charAt(i);
	    r++;
	}
	return true;
    }

    public boolean addWordForDown(String w, int row, int col){
	int r=row, c = col;
	if ((r + w.length()) > board.length){
	    r = r - ((r + w.length()) - board.length);
	}
	if ((c + w.length()) > board[1].length){
	    c = c - ((c + w.length()) - board[1].length);
	}
	if (doesOverlap(w,r,c,3)){
	    return false;
	}
	for (int i =0;i<w.length();i++){
	    board[r][c]= w.charAt(i);
	    r++;
	    c++;
	}
	return true;
    }
    
    public boolean addWordForUp(String w, int row, int col){
	int r=row, c = col;
	if ((r - w.length()) < 0){
	    r = r - ((r + w.length()) - board.length);
	}
	if ((c + w.length()) > board[1].length){
	    c = c - ((c + w.length()) - board[1].length);
	}
	if (doesOverlap(w,r,c,2)){
	    return false;
	}
	for (int i =0;i<w.length();i++){
	    board[r][c]= w.charAt(i);
	    r--;
	    c++;
	}
	return true;
    }

    public boolean addWordBackDown(String w, int row, int col){
	int r=row, c = col;
	if ((r + w.length()) > board.length){
	    r = r - ((r + w.length()) - board.length);
	}
	if ((c + w.length()) > board[1].length){
	    c = c - ((c + w.length()) - board[1].length);
	}
       	if (doesOverlap(w,r,c,3)){
	    return false;
	}
	for (int i =w.length() -1;i>= 0;i--){
	    board[r][c]= w.charAt(i);
	    r++;
	    c++;
	}
	return true;
    }
    
    public boolean addWordBackUp(String w, int row, int col){
	int r=row, c = col;
	if ((r - w.length()) < 0){
	    r = r + ((r + w.length()) - board.length);
	}
	if ((c + w.length()) > board[1].length){
	    c = c - ((c + w.length()) - board[1].length);
	}
	if (doesOverlap(w,r,c,2)){
	    return false;
	}
	for (int i =w.length() -1;i>= 0;i--){
	    board[r][c]= w.charAt(i);
	    r--;
	    c++;
	}
	return true;
    }

    public void fillBoard (){
	Scanner n = null;
	try{
	    n = new Scanner(new File("words.txt"));
	} catch(Exception e){e.printStackTrace();}
	ArrayList<String> list = new ArrayList<String>();
	while (n.hasNext()){
	    list.add(n.nextLine());
	}
	System.out.println(list);
	Random r = new Random();
	int i = 0;
	while (i<list.size()){
	    int num = r.nextInt(8);
	    int row = r.nextInt(board.length);
	    int col = r.nextInt(board[0].length);
	    if (num == 0){
		if (addWordHforward(list.get(i),row,col)){
		    list.remove(i);
		}
	    }
	    else if (num == 1){
		if (addWordHbackward(list.get(i),row,col)){
		    list.remove(i);
		}
	    }
	    else if (num == 2){
		if (addWordVup(list.get(i),row,col)){
		    list.remove(i);
		}
	    }
	    else if (num == 3){
		if (addWordVdown(list.get(i),row,col)){
		    list.remove(i);
		}
	    }
	    else if (num == 4){
		if (addWordForDown(list.get(i),row,col)){
		    list.remove(i);
		}
	    }
	    else if (num == 5){
		if (addWordForUp(list.get(i),row,col)){
		    list.remove(i);
		}
	    }
	    else if (num == 6){
		if (addWordBackDown(list.get(i),row,col)){
		    list.remove(i);
		}
	    }
	    else if (num == 7){
		if (addWordBackDown(list.get(i),row,col)){
		    list.remove(i);
		}
	    }
	}
    }
    
   
    public static void main(String[] args){
	WordSearch2 w = new WordSearch2();
	w.fillBoard();
	System.out.println(w);
    }
}
