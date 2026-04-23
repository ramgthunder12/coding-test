import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

class Solution {
//     public int[] solution(int[] arr, int[] delete_list) {
//         ArrayList<Integer> answerList = new ArrayList<>();
//         HashSet<Integer> set = new HashSet<>();
        
//         for(int delete_num : delete_list) {
//             set.add(delete_num);
//         }
        
//         for(int num : arr) {
//             if(set.contains(num)) {
//             } else {
//                 answerList.add(num);
//             }
//         }
        
//         int[] answer = new int[answerList.size()];
//         for(int i = 0; i < answerList.size(); i++) {
//             answer[i] = answerList.get(i);
//         }

//         return answer;
//     }
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> deleteSet = toSet(delete_list);
        List<Integer> filtered = filter(arr, deleteSet);
        return toArray(filtered);
    }

    private Set<Integer> toSet(int[] deleteList) {
        Set<Integer> set = new HashSet<>();
        for (int d : deleteList) {
            set.add(d);
        }
        return set;
    }

    private List<Integer> filter(int[] arr, Set<Integer> deleteSet) {
        List<Integer> list = new ArrayList<>();
        for (int a : arr) {
            if (!deleteSet.contains(a)) {
                list.add(a);
            }
        }
        return list;
    }

    private int[] toArray(List<Integer> list) {
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}