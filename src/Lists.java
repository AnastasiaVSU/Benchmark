import java.util.ArrayList;
import java.util.LinkedList;
public class Lists {
    public static final Integer n = 10;
    private static ArrayList<Integer> ArrayList_1_Million=new ArrayList<>();
    private static LinkedList<Integer> LinkedList_1_Million=new LinkedList<>();
    public static void ArrayList_Set() {
        Long startTime = System.currentTimeMillis();
        for ( int i = 0 ; i < ArrayList_1_Million.size() ; i++ )
            ArrayList_1_Million.set(i, n);
        Long endTime = System.currentTimeMillis();
        System.out.println("Время присваивания элемента ArrayList:" + (endTime - startTime));
    }
    public static void ArrayList_Get(){
        Long startTime = System.currentTimeMillis();
        for(int i = 0; i < ArrayList_1_Million.size(); i++)
            ArrayList_1_Million.get(i);
        Long endTime = System.currentTimeMillis();
        System.out.println("Время возвращения элемента ArrayList:" + (endTime - startTime));
    }
    public static void ArrayList_Add(){
        Long startTime = System.currentTimeMillis();
        for ( int i = 0; i < 1000000 ; i++ )
            ArrayList_1_Million.add(i);
        Long endTime = System.currentTimeMillis();
        System.out.println("Время добавления элемента в ArrayList:" + (endTime - startTime));

    }
    public static void ArrayList_Add1(){
        Long startTime = System.currentTimeMillis();
        for ( int i = 0; i < 1000000; i++ )
            ArrayList_1_Million.add(i, n);
        Long endTime = System.currentTimeMillis();
        System.out.println("Время вставки нового элемента в ArrayList:" + (endTime - startTime));

    }
    public static void ArrayList_Remove(){
        Long startTime = System.currentTimeMillis();
        for(int i=0; i < ArrayList_1_Million.size(); i++)
            ArrayList_1_Million.remove(i);
        Long endTime = System.currentTimeMillis();
        System.out.println("Время удаления элемента ArrayList:" + (endTime - startTime));
    }
    public static void LinkedList_Set() {
        Long startTime = System.currentTimeMillis();
        for ( int i = 0 ; i < LinkedList_1_Million.size() ; i++ )
            LinkedList_1_Million.set(i, n);
        Long endTime = System.currentTimeMillis();
        System.out.println("Время присваивания элемента LinkedList:" + (endTime - startTime));
    }
    public static void LinkedList_Get(){
        Long startTime = System.currentTimeMillis();
        for(int i = 0; i < LinkedList_1_Million.size(); i++)
            LinkedList_1_Million.get(i);
        Long endTime = System.currentTimeMillis();
        System.out.println("Время возвращения элемента LinkedList:" + (endTime - startTime));
    }
    public static void LinkedList_Add(){
        Long startTime = System.currentTimeMillis();
        for ( int i = 0; i < 1000000 ; i++ )
            LinkedList_1_Million.add(i);
        Long endTime = System.currentTimeMillis();
        System.out.println("Время добавления элемента в LinkedList:" + (endTime - startTime));
    }
    public static void LinkedList_Add1(){
        Long startTime = System.currentTimeMillis();
        for ( int i = 0; i < 1000000 ; i++ )
            LinkedList_1_Million.add(i);
        Long endTime = System.currentTimeMillis();
        System.out.println("Время вставки нового элемента в LinkedList:" + (endTime - startTime));
    }
    public static void LinkedList_Remove(){
        Long startTime = System.currentTimeMillis();
        for(int i=0; i < LinkedList_1_Million.size(); i++)
            LinkedList_1_Million.remove(i);
        Long endTime = System.currentTimeMillis();
        System.out.println("Время удаления элемента LinkedList:" + (endTime - startTime));
    }

    public static void main(String[] args){
        ArrayList_Set();
        LinkedList_Set();
        ArrayList_Get();
        LinkedList_Get();
        ArrayList_Add();
        ArrayList_Add1();
        LinkedList_Add();
        LinkedList_Add1();
        ArrayList_Remove();
        LinkedList_Remove();
    }
}