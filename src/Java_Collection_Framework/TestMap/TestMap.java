package Java_Collection_Framework.TestMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("John", 20);
        hashMap.put("Bob", 40);
        hashMap.put("Lewis", 20);
        System.out.println("Display entries in HashMap" + hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key" + treeMap + "\n");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("John", 20);
        linkedHashMap.put("Bob", 40);
        linkedHashMap.put("Lewis", 20);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis") + "\n");
    }
}
