
class CountGoodSubStrings {
    public int countGoodSubstrings(String s) {
        int good = 0;
        int j;
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i) == s.charAt(i+1) || s.charAt(i) == s.charAt(i+2) || s.charAt(i+1) == s.charAt(i+2))
            {
                continue;
            }
            good++;

        }
        return good;

    }
}
