// 1. mixstart:

public boolean mixStart(String str) {
  return str.startsWith("ix",1);
}

// 2. makeOutWord:

public String makeOutWord(String out, String word) {
  return out.substring(0,2) + word + out.substring(2);
}

// 3. firstHalf:

public String firstHalf(String str) {
  int mid = str.length()/2;
  return str.substring(0,mid);
}
