
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

    public void addWordHforward (String w,int row,int col){
	int r=row, c=col;
	if ((c + w.length()) > board[1].length){
	    c = c - ((c + w.length()) - board[1].length);
	}
	for (int i=0;i<w.length();i++){
	    int x = c;
	    if (board[r][x]!='.'){
		throw new UnsupportedOperationException();
	    }
	    x++;
	}
	for (int i=0;i<w.length();i++){
	    board[r][c] = w.charAt(i);
	    c++;
	}
    }

    public void addWordHbackward (String w,int row,int col){
	int r=row, c=col;
	if ((c + w.length()) > board[1].length){
	    c = c - ((c + w.length()) - board[1].length);
	}
	for (int i=0;i<w.length();i++){
	    int x = c;
	    if (board[r][x]!='.'){
		throw new UnsupportedOperationException();
	    }
	    x++;
	}
	for (int i=w.length()-1;i>=0;i--){
	    board[r][c] = w.charAt(i);
	    c++;
	}
    }

    public void addWordVdown (String w,int row,int col){
	int r=row, c=col;
	if ((r + w.length()) > board.length){
	    r = r - ((r + w.length()) - board.length);
	}
	for (int i=0;i<w.length();i++){
	    int x = r;
	    if (board[x][c] != '.'){
		throw new UnsupportedOperationException();
  	    }
	    x++;
	}
	for (int i=0;i<w.length();i++){
	    board[r][c]=w.charAt(i);
	    r++;
	}
    }

    public void addWordVup (String w,int row,int col){
	int r=row, c=col;
	if ((r + w.length()) > board.length){
	    r = r - ((r + w.length()) - board.length);
	}
	for (int i=0;i<w.length();i++){
	    int x = r;
	    if (board[x][c] != '.'){
		throw new UnsupportedOperationException();
	    }
	    x++;
	}
	for (int i=w.length()-1;i>=0;i--){
	    board[r][c]=w.charAt(i);
	    r++;
	}

    }

    public void addWordForDown(String w, int row, int col){
	int r=row, c = col;
	if ((r + w.length()) > board.length){
	    r = r - ((r + w.length()) - board.length);
	}
	if ((c + w.length()) > board[1].length){
	    c = c - ((c + w.length()) - board[1].length);
	}
	for (int i=0;i<w.length();i++){
	    int x = r;
	    int y = c;
	    if (board[x][y] != '.'){
		throw new UnsupportedOperationException();
	    }
	    y++;
	    x++;
	}
	for (int i =0;i<w.length();i++){
	    board[r][c]= w.charAt(i);
	    r++;
	    c++;
	}
    }
    
    public void addWordForUp(String w, int row, int col){
	int r=row, c = col;
	if ((r - w.length()) < 0){
	    r = r - ((r + w.length()) - board.length);
	}
	if ((c + w.length()) > board[1].length){
	    c = c - ((c + w.length()) - board[1].length);
	}
	for (int i=0;i<w.length();i++){
	    int x = r;
	    int y = c;
	    if (board[x][y] != '.'){
		throw new UnsupportedOperationException();
	    }
	    y++;
	    x--;
	}
	for (int i =0;i<w.length();i++){
	    board[r][c]= w.charAt(i);
	    r--;
	    c++;
	}
    }

    public void addWordBackDown(String w, int row, int col){
	int r=row, c = col;
	if ((r + w.length()) > board.length){
	    r = r - ((r + w.length()) - board.length);
	}
	if ((c + w.length()) > board[1].length){
	    c = c - ((c + w.length()) - board[1].length);
	}
	for (int i=0;i<w.length();i++){
	    int x = r;
	    int y = c;
	    if (board[x][y] != '.'){
		throw new UnsupportedOperationException();
	    }
	    y++;
	    x++;
	}
	for (int i =w.length() -1;i>= 0;i--){
	    board[r][c]= w.charAt(i);
	    r++;
	    c++;
	}
    }
    
    public void addWordBackUp(String w, int row, int col){
	int r=row, c = col;
	if ((r - w.length()) < 0){
	    r = r + ((r + w.length()) - board.length);
	}
	if ((c + w.length()) > board[1].length){
	    c = c - ((c + w.length()) - board[1].length);
	}
	for (int i=0;i<w.length();i++){
	    int x = r;
	    int y = c;
	    if (board[x][y] != '.'){
		throw new UnsupportedOperationException();
	    }
	    y++;
	    x--;
	}
	for (int i =w.length() -1;i>= 0;i--){
	    board[r][c]= w.charAt(i);
	    r--;
	    c++;
	}
    }

    public boolean addWord (String w){
	Random r = new Random();
	int num = r.nextInt(8);
	int row = r.nextInt(board.length);
	int col = r.nextInt(board[0].length);
	try{
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
	    return true;
	}
	catch (UnsupportedOperationException e){
	    return false;
	}
    }
    
   
    public static void main(String[] args){
	WordSearch2 w = new WordSearch2();
	/*
	  System.out.println(w);
	  w.addWord("hello");	
	  w.addWord("computer");
	  w.addWord("television");
	  w.addWord("dog");
	  w.addWord("daisy");

	  System.out.println(w);
	*/

	
	w.addWordForUp("hello",7,12);
	w.addWordVdown("television",4,13);
	System.out.println(w);
    }
}
