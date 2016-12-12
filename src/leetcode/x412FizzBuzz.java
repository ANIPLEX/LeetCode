package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that outputs the string representation of numbers from 1 to n.
 * But for multiples of three it should output “Fizz” instead of the number and for
 * the multiples of five output “Buzz”.
 * For numbers which are multiples of both three and five output “FizzBuzz”.
 */
public class x412FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> res=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i/3*3==i && i/5*5==i) res.add("FizzBuzz");
            else if(i/3*3==i) res.add("Fizz");
            else if(i/5*5==i) res.add("Buzz");
            else res.add(Integer.toString(i));
        }
        return res;
    }
}
