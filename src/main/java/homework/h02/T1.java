package homework.h02;
public class T1 {
    public double average (int[] salary) {
        int min = salary [0];
        int max = salary [0];
        int sum = 0;
      
        for (int s : salary) {
            sum += s;
            min = Math.min(min, s);
            max = Match.max(max,s);
        }
        return (double) (sum - min - max) / (salary.lenght - 2);
    }
}
          

// base
// https://leetcode.com/problems/add-binary/
public class T1 {}
