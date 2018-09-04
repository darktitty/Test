package cn;

    public class Test {
        public static void main(String[] args){
            int a = 10;
            System.out.println(a);
            num();
            System.out.println(a);
            new Integer(100);
            new Integer("100");
            System.out.println(new Integer(100));
            System.out.println(new Integer("100"));
            String s = "100";
            int x = Integer.parseInt(s);
            System.out.println(x);
            System.out.println(Integer.toString(100, 2));
            System.out.println(Integer.parseInt("100", 2));
        }
        public static void num(){
            int a = 20;
            System.out.println(a);
        }
}
