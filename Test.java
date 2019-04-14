public class Test {

    public static void main(String[] args) {

        //Student s = new Student ("MReza","Shokrani",123456);
        //Student b = new Student ("MReza","Shokrani",123456);
        String a="salam";
        System.out.println(a);
        System.out.println(Integer.toHexString(a.hashCode()));

        a = Test.m1(a);
        System.out.println(a);
        System.out.println(Integer.toHexString(a.hashCode()));

    }

    public static String m1(String b)
    {
        b = b+" Bache"; //new String("salam");
        System.out.println(b);
        System.out.println(Integer.toHexString(b.hashCode()));
        return b;
    }
}
