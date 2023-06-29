import java.util.HashMap;
import java.util.Map;

public class Task_1 {
    public static void main(String[] args) {
        Map<String, String> filters = new HashMap<>();
        filters.put("name", "Ivanov");
        filters.put("country", "Russia");
        filters.put("city", "Moscow");
        filters.put("age", "null");

        StringBuilder whereClause = new StringBuilder("select * from students where ");

        if (filters.containsKey("name") && filters.get("name") != null) {
            String name = filters.get("name");
            whereClause.append("name = '").append(name).append("' and ");
        }

        if (filters.containsKey("country") && filters.get("country") != null) {
            String country = filters.get("country");
            whereClause.append("country = '").append(country).append("' and ");
        }

        if (filters.containsKey("city") && filters.get("city") != null) {
            String city = filters.get("city");
            whereClause.append("city = '").append(city).append("' and ");
        }

        if (filters.containsKey("age") && filters.get("age") != null && !filters.get("age").equals("null")) {
            String age = filters.get("age");
            whereClause.append("age = ").append(age).append(" and ");
        }

        whereClause.delete(whereClause.length() - 5, whereClause.length());

        System.out.println(whereClause.toString());
    }
}