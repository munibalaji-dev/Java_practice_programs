package Arrays;
import java.util.HashMap;
import java.util.Map;
public class CountFrequency {
    public static void main(String[] args) {

        int[] arr = {1,2,3,2,1,2,3};

        Map<Integer,Integer> freqMap = new HashMap<>();

        for (int num : arr){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }

        for (int key : freqMap.keySet()){
            System.out.println(key+" occurs "+freqMap.get(key)+"times");
        }

//        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }
    }
}
