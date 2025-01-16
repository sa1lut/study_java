package leetcode.task69;
//Учитывая неотрицательное целое число x, верните квадратный корень из x
//округлённого до ближайшего целого числа. Возвращаемое целое число также
//должно быть неотрицательным.
//
//Вы не должны использовать какую-либо встроенную функцию экспоненты или оператор.
public class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}