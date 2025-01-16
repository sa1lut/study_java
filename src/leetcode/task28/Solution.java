package leetcode.task28;
//Для двух строк needle и haystack верните индекс первого вхождения needle в
//haystack или -1 если needle не является частью haystack.

//Пример 1:
//
//Входные данные: haystack = «sadbutsad», needle = «sad»
//Выходные данные: 0
//Объяснение: «sad» встречается по индексу 0 и 6.
//Первое вхождение находится по индексу 0, поэтому мы возвращаем 0.

//Пример 2:
//
//Входные данные: haystack = «leetcode», needle = «leeto»
//Вывод: -1
//Объяснение: «leeto» не встречается в «leetcode», поэтому мы возвращаем -1.
public class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j <= haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
