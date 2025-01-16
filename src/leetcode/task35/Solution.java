package leetcode.task35;
//Учитывая отсортированный массив целых чисел и целевое значение,
//верните индекс, если целевое значение найдено.
//Если нет, верните индекс, на котором оно находилось бы, если бы
//было вставлено по порядку.
public class Solution {
    public int searchInsert(int[] numbs, int target) {
        int n = numbs.length;
        int left = 0, right = n - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(numbs[mid] == target) return mid;
            else if(numbs[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return right + 1;
    }
}