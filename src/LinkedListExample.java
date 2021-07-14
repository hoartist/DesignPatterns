import java.util.*;
import java.util.ArrayList;


public class LinkedListExample {
public static void main(String[]args){
    List<String>list1 =new ArrayList<String>();
    List<String>list2 =new LinkedList<String>();

    long startTime;
    long EndTime;

    startTime=System.nanoTime();
    for(int i=0;i<10000;i++){
        list1.add(0,String.valueOf(i));
    }
    EndTime=System.nanoTime();
    System.out.println("ArrayList 걸린시간" +(EndTime-startTime)+"ns");
    startTime=System.nanoTime();
    for(int i=0;i<10000;i++){
        list2.add(0,String.valueOf(i));
    }
    EndTime=System.nanoTime();
    System.out.println("LinkedList 걸린시간 "+(EndTime-startTime)+"ns");
}
}
