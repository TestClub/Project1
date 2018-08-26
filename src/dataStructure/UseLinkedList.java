package dataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Fahmida");
        list.add("Alif");
        list.add("Shahrukh");
        list.add("Subhra");

        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
        for (String st:list) {
            System.out.println(st);
        }
    }
}
