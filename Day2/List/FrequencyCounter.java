import java.util.*;

public class FrequencyCounter {
    public static void Counter (List<String> sampleList){
       
       Map<String,Integer>  CounterMap = new HashMap<>(); 
       
        for(int i = 0; i< sampleList.size(); i++){
            String currentElemets=sampleList.get(i);
            int counter=1;
            if(CounterMap.containsKey(currentElemets)){
                continue;
            }
            for(int j=i+1;j<sampleList.size();j++){
              
              
                if (sampleList.get(i).equals(sampleList.get(j))){
                    counter++;
                    
                }
               
            }
        
        CounterMap.put(sampleList.get(i),counter);
    }   
        System.out.println(CounterMap);
}
    
    public static void main(String[] args) {
        List<String> sampleList = Arrays.asList("apple","apple", "mango", "apple", "apple", "mango","mango");
        System.out.println(sampleList);
        Counter(sampleList);
    }
    
}
