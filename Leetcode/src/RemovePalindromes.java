import java.util.ArrayList;
import java.util.Scanner;

class RemovePalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int st = removePalindromeSub(s);
    }
    public static int removePalindromeSub(String s) {
        ArrayList<String> palins = new ArrayList<>();
        String sub = s;
        int i,p;

//        for(int j = s.length();j>0;j--){
//            for(int k=0;k<=s.length()-j;k++){
//                sub = (String) s.subSequence(k,j);
//                System.out.println("sub:" + sub);
//                for( i=0,p=sub.length()-1;i<=sub.length()/2 && p>i;i++,p--) {
//                    if (sub.charAt(i) != sub.charAt(p)) {
//                        break;
//                    }
//                }
//                if(i==p || i>p){
//                    System.out.println("here....");
//                    palins.add(sub.toString());
//                    System.out.println(palins);
//                    s.replace(sub,"");
//                }
//
//            }
//        }
        return 0;
    }


}
