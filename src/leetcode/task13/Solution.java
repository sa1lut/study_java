package leetcode.task13;
//Римские цифры обозначаются семью разными символами: I, V, X, L, C, D и M.
//
//Значение Символ
//I 1
//V 5
//X 10
//L 50
//C 100
//D 500
//M 1000
//Получив римскую цифру, преобразуйте ее в целое число.
public class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = getValue(s.charAt(i));
            int next = i + 1 < s.length() ? getValue(s.charAt(i + 1)) : 0;
            if (current < next) {
                ans -= current;
            } else {
                ans += current;
            }
        }
        return ans;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
