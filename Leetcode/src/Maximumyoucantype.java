
class Maximumyoucantype {
    public int canBeTypedWords(String text, String brokenLetters) {
        int output = 0;
        String[] words = text.split(" ");
        boolean broken = false;
        // HashMap<Character,Integer> map = new HashMap<>();
        // for(Character bro : brokenLetters.toCharArray()){
        //     map.put(bro,1);
        // }
        for(String word:words){
            broken = false;
            for(Character character : brokenLetters.toCharArray()){
                if(word.contains(String.valueOf(character))){
                    broken=true;
                    break;
                }
            }
            if(broken == false){
                output+=1;
            }
        }
        return output;
    }
}
