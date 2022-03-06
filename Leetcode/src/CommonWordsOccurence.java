import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class CommonWordsOccurence {
    public int countWords(String[] words1, String[] words2) {
        ArrayList<String> word1 = new ArrayList<>(Arrays.asList(words1));
        ArrayList<String> word2 = new ArrayList<>(Arrays.asList(words2));
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        int count = 0;
        for(String word:word1){
            if(map1.containsKey(word)){
                map1.put(word, map1.get(word) +1);
                //count--;
            }
            else{
                map1.put(word,1);
                //count++;
            }
        }

        for(String word:word2){
            if(map2.containsKey(word)){
                map2.put(word, map2.get(word) +1);

            }
            else{
                map2.put(word,1);

            }
        }
        //word1.retainAll(word2);
        for(String word:map1.keySet())
        {
            if(map1.get(word) == 1 && map2.containsKey(word)){
                if(map2.get(word) == 1){
                    count++;
                }
            }
        }
        return count;
    }
}
