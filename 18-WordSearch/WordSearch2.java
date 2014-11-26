
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

    public void addWord (String w){
	Random r = new Random();
	int num = r.nextInt(8);
	int row = r.nextInt(board.length);
	int col = r.nextInt(board[0].length);
	if (num == 0){
	    addWordHforward(w,row,col);
	}
	else if (num == 1){
	    addWordHbackward(w,row,col);
	}
	else if (num == 2){
	    addWordVup(w,row,col);
	}
	else if (num == 3){
	    addWordVdown(w,row,col);
	}
	else if (num == 4){
	    addWordForDown(w,row,col);
	}
	else if (num == 5){
	    addWordForUp(w,row,col);
	}
	else if (num == 6){
	    addWordBackDown(w,row,col);
	}
	else if (num == 7){
	    addWordBackDown(w,row,col);
	}
    }
    
   
    public static void main(String[] args){
	WordSearch2 w = new WordSearch2();
	w.addWord("hello");	
	w.addWord("computer");
	w.addWord("television");
	w.addWord("dog");
	w.addWord("daisy");
	System.out.println(w);
    }
}
