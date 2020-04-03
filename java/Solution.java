import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Fizz");
        map.put(5, "Buzz");
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int key : map.keySet()) if (i % key == 0) sb.append(map.get(key));
            if (sb.length() == 0) arr.add(String.valueOf(i));
            else arr.add(sb.toString());
        }
        return arr;
    }
}
class Main{
    public static void main(String[] args) {

    }

}