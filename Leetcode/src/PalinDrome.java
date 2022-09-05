
public class PalinDrome {
	public static boolean isPalindrome(String s) {
 
        String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        StringBuffer sb = new StringBuffer(str);
		int start = 0;
        int end = str.length();
        System.out.println(str);
        while(true) {
        	int len = sb.length();
        	if(len == 0 || len==1) {
        		return true;
        	}
        	if(sb.charAt(0) == sb.charAt(len-1)) {
        		//System.out.println(sb.charAt(len-1) + sb.charAt(0));
        		sb.deleteCharAt(len-1);
        		sb.deleteCharAt(0);
        		//System.out.println(sb.toString());
        	}
        	else {
        		return false;
        	}
        }
        
    }
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}
}
