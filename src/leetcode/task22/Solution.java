package leetcode.task22;

import java.util.ArrayList;
import java.util.List;
//Учитывая n парные скобки, напишите функцию для генерации всех комбинаций правильно оформленных скобок.
//
//Пример 1:
//
//Входные данные: n = 3
//Выходные данные: ["((()))","(()())","(())()","()(())","()()()"]
//Пример 2:
//
//Ввод: n = 1
//Вывод: ["()"]
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        fun(0, 0, "", n, res);

        return res;
    }

    private void fun(int openP, int closeP, String s, int n, List<String> res) {
        if (openP == closeP && openP + closeP == n * 2) {
            res.add(s);
            return;
        }

        if (openP < n) {
            fun(openP + 1, closeP, s + "(", n, res);
        }

        if (closeP < openP) {
            fun(openP, closeP + 1, s + ")", n, res);
        }
    }
}