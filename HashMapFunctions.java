import java.util.HashMap;
public class HashMapAwesomeness {
    public static void main(String [] args){
         HashMap<String, String> ritesh = new HashMap<String, String>();
         ritesh.put("rohan", "khamitkar");
         ritesh.put("top","veritas");

         ritesh.remove("ritesh");

         System.out.println(ritesh.containsKey("ritesh"));
    }
}
// to find value use // containsValue
//to find key use // containsKey
//to add // put
//to remove element // remove 
// to get // .get 
// to replace // .replace
