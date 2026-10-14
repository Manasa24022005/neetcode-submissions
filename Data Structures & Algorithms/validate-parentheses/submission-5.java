class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        boolean balanced =true;

        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);

            if(ch=='{' || ch=='['||ch=='('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    balanced=false;
                    break;
                }

                char top = stack.pop();
                if((ch==')' && top!='('  ) ||
                   (ch==']' && top!='['    )  ||
                   (ch=='}' && top!='{')
                   ){
                    balanced=false;
                    break;
                   }



            }

          

       
        }

          if(!stack.isEmpty()){
                balanced=false;
            }

             return  balanced && stack.isEmpty();
        
    }
}
