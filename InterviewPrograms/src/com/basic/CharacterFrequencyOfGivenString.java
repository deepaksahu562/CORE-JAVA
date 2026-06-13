package src.com.basic;

import java.util.Map;
import java.util.TreeMap;

public class CharacterFrequencyOfGivenString {
    public static void main(String[] args) {
        String str = "deepakkumarsahu";
        Map<Character, Integer> map = new TreeMap<>();
        for (Character c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        System.out.println(map);
    }
}
