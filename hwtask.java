import java.util.Scanner;

public class hwtask {
    public static void main(String[] args) {
        String s1 = "select* from students where";
        String[] strings = s1
            .replaceAll("\\p{P}", "")
            .replaceAll("\\s", " ")
            .replace("*", "")
            .replace("select", "\"name\"")
            .replace("from", "\"country\"")
            .replace("students", "\"city\"")
            .replace("where", "\"age\"")
            .split(" ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String country = scanner.nextLine();
        String city = scanner.nextLine();
        String age = scanner.nextLine();
        
        
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            if(name.equals("null") == false){
                if (i != 0){
                    builder.append(", ")
                    .append(strings[i])
                    .append(":");
                    if ( i == 0 ) builder.append("\"" + name + "\"");
                    if ( i == 1 ) builder.append("\"" + country + "\"");
                    if ( i == 2 ) builder.append("\"" + city + "\"");
                    if ( i == 3 ) builder.append("\"" + age + "\"");
                }
                else{
                    builder.append(strings[i])
                    .append(":");
                    if ( i == 0 ) builder.append("\"" + name + "\"");
                    if ( i == 1 ) builder.append("\"" + country + "\"");
                    if ( i == 2 ) builder.append("\"" + city + "\"");
                    if ( i == 3 ) builder.append("\"" + age + "\"");
                }
            }
        }
        builder.toString();
        System.out.println(builder);
    }
}
