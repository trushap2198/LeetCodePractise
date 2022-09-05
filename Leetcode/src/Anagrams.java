class Anagrams {
    public static boolean isAnagram(String s, String t) {    
        StringBuffer sb1 = new StringBuffer(s);
        StringBuffer sb2 = new StringBuffer(t);
        if(sb1.length() != sb2.length()) {
        	return false;
        }
        //int i = 0;
        for(int i = 0; i <sb1.length();i++) {
        	int index = sb2.indexOf(sb1.substring(i,i+1));
        	if(index != -1) {
        		sb2.deleteCharAt(index);  		
        	}
        }
        if(sb2.length()!= 0) {
        	return false;
        }
        else {
        	return true;
        }

    }
    public static void main(String[] args) {
		System.out.println(isAnagram("trusha", "rusat"));
	}
}
