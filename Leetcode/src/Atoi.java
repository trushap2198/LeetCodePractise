
public class Atoi {
public static int myAtoi(String s) {
	String s2=s.replaceAll("[^0-9-]", "");
	System.out.println(s2);
	int number = 0;
	boolean flag = true;
	for(String str : s2.split("")) {
		if(str.equals("-")) {
			flag = false;
			s2 = s2.replaceAll("-","");
		}
		number = Integer.valueOf(s2);
		if(number>Math.pow(2, 31)-1 ) {
			number = (int)Math.pow(2, 31)-1;
		}
		if ( number< Math.pow(-2, 31)){
			number = (int)Math.pow(-2, 31);
		}
		if(flag == false) {
			number = -number;
		}
	}
	
	return number;
        
    }
public static void main(String[] args) {
	myAtoi("4193 with words");
	
}
}
