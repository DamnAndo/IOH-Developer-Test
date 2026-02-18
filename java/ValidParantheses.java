// valid paranthesis [ JAVA ]
// easy
// 18:35	19:05

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;

                char checkData = stack.pop();
                if (c == ')' && checkData != '(')
                    return false;
                if (c == '}' && checkData != '{')
                    return false;
                if (c == ']' && checkData != '[')
                    return false;
            }
        }

        return stack.isEmpty();

    }
}
