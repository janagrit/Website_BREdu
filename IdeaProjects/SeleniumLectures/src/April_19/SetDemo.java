package April_19;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
        // Java Collections Framework -> 4 Interfaces: Map, Set, List, Queue
        // Collection Interface -> super interface of Set, List, Queue
        // Collections -> utility class to perform operations on collections    -> Collections.sort();

        // hashSet
        Set<String> names = new HashSet<>(); // -> the elements in hashset the insertion order is not stored

        System.out.println(names.add("Fuad"));
        names.add("Fatih");
        names.add("Iana");
        names.add("Gulmira");
        names.add("Neila");
        System.out.println(names.add("Fuad"));
        names.add("Fatih");
        System.out.println(names);


        Set<Integer> nums = new LinkedHashSet<>();
        nums.add(44);
        nums.add(4);
        nums.add(67);
        nums.add(1);
        nums.add(44);
        nums.add(4);

        System.out.println(nums);

        // given a string "aaaabbbrrrtuuuvqqw" return only unique characters from the string  -> abrtuvqw
        String str = "aaaabbbrrrtuuuvqqw";
        Set<Character> charcters = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            charcters.add(str.charAt(i));
        }
        System.out.println(charcters);
        String st = "";
        for (Character charcter : charcters) {
            st += charcter;
        }
        System.out.println(st);

        Set<Integer> nums1 = new TreeSet<>();
        nums1.add(23);
        nums1.add(23);
        nums1.add(1);
        nums1.add(100);
        nums1.add(99);
        nums1.add(50);
        nums1.add(26);
        nums1.add(98);
        System.out.println(nums1);
//        nums.clear();
        System.out.println(nums.contains(50));
        System.out.println(nums.contains(51));
        System.out.println(nums);
//        for (int i = 0; i < nums.size(); i++) {
//            System.out.println(nums.get(i));  // set elements do not have indices
//        }
        for (Integer num : nums) {
            System.out.println(num);
        }
        List<Integer> num2 = new ArrayList<>();
        num2.add(23);
        num2.add(23);
        num2.add(23);
        num2.add(23);
        num2.add(23);
        num2.add(46);
        System.out.println(num2);
        Set<Integer> nums3 = new LinkedHashSet<>(num2);  // convert list to set
        System.out.println(nums3);
        num2 = new ArrayList<>(nums3); // convert set to list
        System.out.println(num2);

    }}

