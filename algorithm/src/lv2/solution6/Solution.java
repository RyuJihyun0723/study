package lv2.solution6;

import java.util.Stack;
class Solution {
 boolean solution(String s) {
        boolean answer = true;
       
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if(c == '(') {
        		stack.push(')');
        	}else {
        		if(stack.isEmpty()) {
        			return false;
        		}else {
        			stack.pop();
        		}
        	}
        }
        
        return stack.isEmpty();
    }
}