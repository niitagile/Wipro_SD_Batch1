package StreamsExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//collecting the even numbers in an Array.

public class StreamElementsToArray
{
     public static void main(String[] args)
     {
    	 /* Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        	stream.forEach(p -> System.out.println(p));
    	  * 
    	  * 
    	  */
         List<Integer> list = new ArrayList<Integer>();
 
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
 
         Stream<Integer> stream = list.stream();
         Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
         Stream<Integer>s=Stream.of(evenNumbersArr);
         s.forEach(p->System.out.println(p));
         //System.out.print(evenNumbersArr);
     }
}