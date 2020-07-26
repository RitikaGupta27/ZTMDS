import java.util.Arrays;
import java.util.List;
import java.util.*;



class Main {
  public static void main(String[] args) {
  boolean found=false;
    List<String> intList1=Arrays.asList("a","b","c","d");
     List<String> intList2=Arrays.asList("x","y","z");
     Map<String, Boolean> firstArr=new HashMap<>();
     for(String in: intList1){
        firstArr.put(in, true);
     }
      for(String in2: intList2){
        if(firstArr.containsKey(in2))
          found=true;          
      }
   
    
    System.out.println(found);
  }

}