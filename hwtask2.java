public class hwtask2 {
    public static void main(String[] args) {
        String str = ".3 + 1.56=";

        double num1 = Double.parseDouble(str.substring(0, 2));
        double num2 = Double.parseDouble(str.substring(5, 9));

        double result = num1 + num2;
        str += result;

        System.out.println(str);
    }
}
