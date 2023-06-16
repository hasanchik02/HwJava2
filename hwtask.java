
import java.util.LinkedHashMap;
import java.util.Map;


public class hwtask {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name","Ivanov");
        map.put("country","Russia");
        map.put("city","Moskow");
        map.put("age",null);

        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder result = new StringBuilder();
        if (params == null || params.isEmpty())
            return result.toString();

        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getKey() == null || pair.getValue() == null)
                continue;

            result.append(pair.getKey()).append(":").append(pair.getValue()).append(", ");
        }

        result.delete(result.length() - 2, result.length());
        
        return result.toString();
    }
}
