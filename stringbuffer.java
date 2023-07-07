public class stringbuffer 
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Anitha");
        System.out.println(sb.capacity());
        System.out.println(sb.append(" Devi"));
        System.out.println(sb.deleteCharAt(4));
        System.out.println(sb.insert(0,"Hello "));
        sb.setLength(2);
    }
    
}
