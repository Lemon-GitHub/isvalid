package isvalid;

import java.util.Stack;

public class Solution {
    //括号匹配问题
    public boolean isValid(String s) {
        //1.创建一个栈
        Stack<Character> stack = new Stack<>();
        //2.循环遍历每一个字符
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            //3.如果是左括号，就入栈
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
                continue;
            }
            //4.如果是右括号，取出栈顶元素
            if(stack.isEmpty()){
                return false;
            }
            char top = stack.pop();

            //5.检查栈顶元素和当前元素是不是匹配
            if(top == '(' && c == ')'){
                continue;
            }
            if(top == '[' && c == ']'){
                continue;
            }
            if(top == '{' && c == '}'){
                continue;
            }

            //三种情况都不满足 非法字符串
            return false;
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
