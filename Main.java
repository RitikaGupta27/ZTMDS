import java.util.Arrays;
import java.util.List;
import java.util.*;



class Main {
  public static void main(String[] args) {
  
    List<Integer> intList1=Arrays.asList(1,1,2,4,5);
    // List<Integer> intList2=Arrays.asList(1,3,4,2);
    Set<Integer> complementrySet=new HashSet<>();
     boolean found=false;
     int i=0;
     int j=intList1.size()-1;
     while(i<j){
       if(intList1.get(i).intValue()+intList1.get(j).intValue()<8)
       i++;
       else
        if(intList1.get(i).intValue()+intList1.get(j).intValue()>8)
        j--;
      else{
         found=true;
         break;
      }
     
     }
    //  for(Integer value: intList1){
    //    if(complementrySet.contains(value))
    //    found=true;
    //    else
    //      complementrySet.add(8-value.intValue());
    //  }
    //  for(int i=0; i<intList1.size(); i++){








    //    for(int j=i+1; j<intList1.size(); j++){
    //          if(intList1.get(i)+intList1.get(j)==8){
    //         found=true; 
    //         break;
    //          }  
    //    }

   //  }
    
    System.out.println(found);
  }

}