/*
  Collection API - APIs to use different collections
  Collection - Interface
  Collections - Class
 */
  //Collection API - Map has multiple implementations.
  //Collection - List(ex:ArreyList,LinkedList),Queue(ex:DeQueue),Set(ex:HashSet,LinkedHashSet)....Above collection -- Iterator Class is present..which has iterator function.
import java.util.*;

import javax.annotation.processing.SupportedSourceVersion;

public class Collection1 {
    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<Integer>();//if we dont specify the type by default the collection API works with the objects....
        // So without mentioning the type all the added things will be considered as an object...
        // So we use angular bracket to specify the type of this collection.
        // Always try to mention the type before using the collection...for simplicity. 

        //Collection is a class which implements class List so we directly use List for refrence instid of using collections
        List<Integer> nums1 = new ArrayList<Integer>();//Now we can use every funcyion of List semlessly like Get,Index value.
        nums1.add(6);
        nums1.add(5);
        nums1.add(1);
        nums1.add(3);
        nums.add(13);
        nums.add(6);
        nums.add(5);

        //From nums1 we can also do the indexing
        System.out.println(nums1.get(1));
        for(int i=0;i<=3;i++){
            System.out.println(" ");
        }
        System.out.println(nums);//we can directly print a collection.
        //We dont have indexing for Collections...but we can use enhanced for loop.
        for(int i=0;i<=3;i++){
            System.out.println(" ");
        }
        for(int n : nums){
            System.out.println(n);
        }

        for(int i=0;i<=3;i++){
            System.out.println(" ");
        }

        Set<Integer> nums2 = new HashSet<Integer>();//we dont get sorted values nither values in sequwnce....Set are completely Random  
        nums2.add(63);
        nums2.add(24);
        nums2.add(45);
        nums2.add(86);

        for(int n : nums2){
            System.out.println(n);
        }
 
        //For sorted value we can use TreeSet

        for(int i=0;i<=3;i++){
            System.out.println(" ");
        }

        Set<Integer> nums3 = new TreeSet<Integer>();//we get sorted values
        nums3.add(63);
        nums3.add(24);
        nums3.add(45);
        nums3.add(86);

        for(int n : nums3){
            System.out.println(n);
        }
    }
}
