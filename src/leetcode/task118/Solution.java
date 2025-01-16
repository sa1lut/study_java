package leetcode.task118;

import java.util.ArrayList;
import java.util.List;
//Учитывая целое число numRows, верните первые
//numСтрок треугольника Паскаля.
//В треугольнике Паскаля каждое число является
//суммой двух чисел, расположенных непосредственно
//над ним
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            int num = 1;
            for(int j = 0; j <= i; j++) {
                row.add(num);
                num = num * (i - j)  / (j + 1);
            }

            ans.add(row);
        }

        return ans;
    }
}
