public class hwtask3 {
public static void main(String[] args) {
    String str = "";
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < 1000; i++) {
        str += "a";
    }
    for (int i = 0; i < 1000; i++) {
        builder.append("a"); 
    }

    long start = System.currentTimeMillis();
    for (int i = 0; i < 1000; i++) {
        str.replace("a","A");
    }
    System.out.println("String time = " + (System.currentTimeMillis() - start));
    
    start = System.currentTimeMillis();
    for (int i = 0; i < 1000; i++) {
        builder.replace(i, i, "A");
    }
    System.out.println("String time = " + (System.currentTimeMillis() - start));
}
}