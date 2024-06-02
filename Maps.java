import java .util.HashMap;
public class Maps {
    public static void main(String[] args) {
        HashMap<String,Integer> empIds = new HashMap<>();
        empIds.put("Ananya",12345);
        empIds.put("Anshika",23456);
        empIds.put("Tiayaba",56789);
        System.out.println(empIds);
        System.out.println(empIds.get("Aanaya"));
        System.out.println(empIds.containsKey("Ananya"));
        System.out.println(empIds.containsKey("Ana"));
    }
}
