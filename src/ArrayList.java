import java.util.*;

public class ArrayList {
    public static void Main(String[]args){
        List<String>list =new java.util.ArrayList<String>();
        list.add("JAVA");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2,"DataBase");
        list.add("IBatis");

        int size=list.size();
        System.out.println("총 객체수"+size);
        System.out.println();

        String skill =list.get(2);
        System.out.println("2:"+skill);
        System.out.println();

        for(int i=0;i<list.size();i++){
            String str =list.get(i);
            System.out.println(i+":"+str);
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("IBatis");
        for(int i=0;i<list.size();i++){
            String str =list.get(i);
            System.out.println(i+":"+str);
        }
    }
}
