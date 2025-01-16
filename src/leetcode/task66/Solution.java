package leetcode.task66;
//Вам дано большое целое число, представленное в виде массива целых чисел digits,
//где каждое digits[i] является ith цифрой целого числа. Цифры упорядочены от старшей
//к младшей слева направо. Большое целое число не содержит ведущих 0's.
//
//Увеличьте большое целое число на единицу и верните полученный массив цифр.
public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
