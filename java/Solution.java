import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arr=new ArrayList<>();
        for (int i=1;i<=n;i++){
            if(judge1(i)&&judge2(i)) arr.add("FizzBuzz");
            else if(judge1(i)) arr.add("Fizz");
            else if(judge2(i)) arr.add("Buzz");
            else arr.add(String.valueOf(i));
        }
        return arr;
    }
    public boolean judge1(int i){
        return i % 3 == 0;
    }
    public boolean judge2(int i){
        return  i%5==0;
    }
}
class Main{
    public static void main(String[] args) {

    }

}