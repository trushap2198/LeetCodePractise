
class Nearestcharacterdistance {
    public int[] shortestToChar(String s, char c) {
        int[] output = new int[s.length()];
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i) == c){
        //         map.put(i,1);
        //     }
        // }
        // for(int i =0;i<s.length();i++){
        //     int min_distance = Integer.MAX_VALUE;
        //     for(int index:map.keySet()){
        //         if(Math.abs(index - i)<min_distance){
        //             min_distance = Math.abs(index-i);
        //         }
        //     }
        //     output[i] = min_distance;
        // }


        //Optimal
        int prev=Integer.MIN_VALUE/2;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == c){
                prev = i;
            }
            output[i] = Math.abs(i-prev);
        }

        prev=Integer.MIN_VALUE/2;

        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i) == c){
                prev = i;
            }
            output[i] = Math.min(output[i],Math.abs(prev-i));
        }

        return output;
    }
}