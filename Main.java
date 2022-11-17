import java.util.*;
class Arraylist{
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(4);
        arr.add("First Element");
        arr.add("Second Element");
        arr.add("Third Element");
        arr.add("Fourth");

        for (int i =0;i < arr.size();i++){
            System.out.println(arr.get(i));
        }   
    }
}