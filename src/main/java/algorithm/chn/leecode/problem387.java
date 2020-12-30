package algorithm.chn.leecode;

import java.util.HashMap;
import java.util.Map;

public class problem387 {
    public int firstUniqChar(String s) {
        Map<Character,Boolean> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char ch:chars) {
            if (map.containsKey(ch)){
                map.put(ch,false);
            }else{
                map.put(ch,true);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i])){
                return i;
            }
        }
        return -1;
    }
}
