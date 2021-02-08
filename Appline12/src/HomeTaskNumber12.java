public class HomeTaskNumber12 {
    public static void main(String[] args) {
        boolean v1, v2, v3;
        String result2;
        String result3;
        String sentence = "I like Java!!!";
        v1 = sentence.startsWith("I like");
        v2 = sentence.endsWith("!!!");
        v3 = sentence.contains("Java");
        if (v1 == true && v2 == true && v3 == true) {
            String result1 = sentence.toUpperCase();
            System.out.println(result1);
            result2 = sentence.replace('a',  'o');
            result3 = result2.substring(7, 11);
            System.out.println(result3);
        }
    }
}
