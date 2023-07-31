package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class StringGroups {

    public static void main(String[] args) {
        String[] input = {"qwe", "wqe", "qwee", "a", "a"};
        Map<String, List<Integer>> groups = findStringGroups(input);

        for (Map.Entry<String, List<Integer>> entry : groups.entrySet()) {
            List<Integer> indexes = entry.getValue();
            if (indexes.size() > 1) {
                System.out.print(entry.getKey() + " = ");
                for (int i = 0; i < indexes.size(); i++) {
                    System.out.print(indexes.get(i));
                    if (i < indexes.size() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static Map<String, List<Integer>> findStringGroups(String[] strings) {
        Map<String, List<Integer>> groups = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            char[] chars = strings[i].toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);

            groups.putIfAbsent(sortedString, new ArrayList<>());
            groups.get(sortedString).add(i);
        }
        return groups;
    }
}
