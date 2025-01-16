package leetcode.task20;

import java.util.Stack;
//Дана строка s, содержащая только символы '(', ')', '{', '}', '[' и ']'. Определите, является ли входная строка корректной.
//
//Входная строка допустима, если:
//
//Открытые скобки должны быть закрыты скобками того же типа.
//Открытые скобки должны быть закрыты в правильном порядке.
//Каждой закрывающей скобке соответствует открывающая скобка того же типа.
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (!stack.isEmpty()) {
                char last = stack.peek();
                if (isPair(last, cur)) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(cur);
        }

        return stack.isEmpty();
    }

    private boolean isPair(char last, char cur) {
        return (last == '(' && cur == ')') ||
                (last == '{' && cur == '}') ||
                (last == '[' && cur == ']');
    }
}