import java.util.HashMap;
public class HashMapAwesomeness {
    public static void main(String [] args){
        int a = 10;
        int b = 3;
        int c = 88;

        HashMap<String, Integer> ritesh = new HashMap<String, Integer>();
        ritesh.put("a", 10);
        ritesh.put("b",3);
        ritesh.put("c",88);

        System.out.println(ritesh.get("c"));

    }
}
