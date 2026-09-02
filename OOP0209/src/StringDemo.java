public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String("Prasesent ornare, sem ac aluquam");
        String s2 = new String("Apple");

        // System.out.println(s1.contains(",")); 
        // System.out.println(s1.toLowerCase().startsWith("pra"));
        // System.out.println(s1.endsWith("m"));
        // System.out.println(s2.compareTo("Apple"));

        System.out.println(s1.substring(0, 9));
        String a = s1.substring(0, 9);
        System.out.println(a.length());
    }
}