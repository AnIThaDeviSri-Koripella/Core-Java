public class strings
{
    public static void main(String args[])
    {
        String name = "Anitha";
        String name1 = new String("Devi");
        System.out.println(name+" "+name1);
        System.out.println("Hello "+name);
        System.out.println(name1.charAt(1));
        System.out.println(name.concat(" Sri"));
        System.out.println(name1.codePointAt(1));
        System.out.println(name.codePointBefore(1));
        System.out.println(name.codePointCount(0, 2));
    }
    
}
