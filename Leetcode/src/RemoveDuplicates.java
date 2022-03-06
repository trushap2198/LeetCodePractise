import java.util.Stack;

class RemoveDuplicates {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            //System.out.println(stack);
            if(!stack.isEmpty() && (s.charAt(i)==stack.peek())){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        stack.iterator().forEachRemaining(c->sb.append(c));
        return sb.toString();
    }
}
