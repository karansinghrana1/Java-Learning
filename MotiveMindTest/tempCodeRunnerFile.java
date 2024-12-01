// package MotiveMindTest;
// import java.util.LinkedList;
// import java.util.Scanner;

// public class MergeSortedLinkedLists {
//     public static void main(String[] args) {
//         LinkedList<Integer> list1 = new LinkedList<>();
//         LinkedList<Integer> list2 = new LinkedList<>();

//         // Example input (can be replaced with user input)
//         list1.add(1);
//         list1.add(2);
//         list1.add(4);

//         list2.add(1);
//         list2.add(3);
//         list2.add(4);

//         LinkedList<Integer> mergedList = mergeTwoLists(list1, list2);

//         System.out.println(mergedList);
//     }

//     public static LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
//         LinkedList<Integer> mergedList = new LinkedList<>();
//         int i = 0, j = 0;

//         while (i < list1.size() && j < list2.size()) {
//             if (list1.get(i) <= list2.get(j)) {
//                 mergedList.add(list1.get(i));
//                 i++;
//             } else {
//                 mergedList.add(list2.get(j));
//                 j++;
//             }
//         }

//         while (i < list1.size()) {
//             mergedList.add(list1.get(i));
//             i++;
//         }

//         while (j < list2.size()) {
//             mergedList.add(list2.get(j));
//             j++;
//         }

//         return mergedList;
//     }
// }
