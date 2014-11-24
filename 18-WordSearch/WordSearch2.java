
/**
 * Creates a word search puzzle
 *
 */
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
	    if (board[r][c]!='.'){
		throw new OutOfBoundsException();
	    }
	    c++;
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
	     if (board[r][c]!='.'){
		 throw new OutOfBoundsException();
	     }
	     c--;
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
	    if (board[r][c] != '.'){
		throw new OutOfBoundsException();
	    }
	    r++;
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
	    if (board[r][c] != '.'){
		throw new OutOfBoundsException();
	    }
	    r--;
	}
	for (int i=w.length()-1;i>=0;i--){
	    board[r][c]=w.charAt(i);
	    r++;
	}
    }

    public void addWordForDown(String w, int row, int col){
	int r=row, c = col;
	for (int i=0;i<w.length();i++){
	    if (board[r][c] != '.'){
		throw new OutOfBoundsException();
	    }
	    c++;
	    r++;
	}
	for (int i =0;i<w.length();i++){
	    board[r][c]= w.charAt(i);
	    r++;
	    c++;
	}
    }
    
    public void addWordForUp(String w, int row, int col){
	int r=row, c = col;
	for (int i=0;i<w.length();i++){
	    if (board[r][c] != '.'){
		throw new OutOfBoundsException();
	    }
	    c++;
	    r--;
	}
	for (int i =0;i<w.length();i++){
	    board[r][c]= w.charAt(i);
	    r--;
	    c++;
	}
    }

    public void addWordBackDown(String w, int row, int col){
	int r=row, c = col;
	for (int i=0;i<w.length();i++){
	    if (board[r][c] != '.'){
		throw new OutOfBoundsException();
	    }
	    c--;
	    r++;
	}
	for (int i =w.length() -1;i>= 0;i--){
	    board[r][c]= w.charAt(i);
	    r++;
	    c++;
	}
    }
    
    public void addWordBackUp(String w, int row, int col){
	int r=row, c = col;
	for (int i=0;i<w.length();i++){
	    if (board[r][c] != '.'){
		throw new OutOfBoundsException();
	    }
	    c--;
	    r--;
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
	int row = r.nextInt(20);
	int col = r.nextInt(30);
	try{
	    if (num == 0){
		addWordHforward(w,row,col);
	    }
	    else if (num == 1){
		addWordHbackward(w,row,col);
	    }
	    else if (num == 2){
		addWordVUp(w,row,col);
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
	catch (IndexOutOfBoundsException()){
	    return false;
	}
    }
    
   
    public static void main(String[] args){
	WordSearch2 w = new WordSearch2();
	w.addWordforDown("banana",8,6);
	System.out.println(w);
	/*
	//System.out.println(w);
        w.addWordHforward("hello",1,3); //adds word normally
	//System.out.println(w);
	w.addWordHforward("howdy",1,6); //overlaps with hello but moves down a row
	//System.out.println(w);
	w.addWordHforward("alligator",4,22); //goes off the board but moves back
      	//System.out.println(w);
	
        w.addWordHbackward("computer",1,19); //adds word normally backward
	//System.out.println(w);
	w.addWordHbackward("lemon",18,27); //goes off the side of the board
	//System.out.println(w);

	w.addWordVdown("Ari",4,3); //adds word normally down
	//System.out.println(w);
	w.addWordVdown("monkey",2,6); //adds word overlapped
	w.addWordVdown("elevator",17,10); //adds word but goes off edge
	System.out.println(w);

	w.addWordVup("Jack",8,9); //adds word normally up
	//System.out.println(w);
	w.addWordVup("donkey",4,27); //adds word overlapped
	w.addWordVup("door",19,12); //adds word but goes off edge
	System.out.println(w);
	*/
    }
}
