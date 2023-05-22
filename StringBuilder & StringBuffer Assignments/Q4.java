public class StringBufferAssignment {
    public static void main(String[] args) {
        StringBuffer sbf=new StringBuffer();
        sbf.append("StringBuffer");
        sbf.append("is a peer class of String");
        sbf.append("that provides much of");
        sbf.append("the functionality of strings");
        System.out.println(sbf);
        StringBuffer sbf2=new StringBuffer("It is used to   at the specified index position");
        sbf2.insert(15,"insert text");
        System.out.println(sbf2);
        StringBuffer sbf3=new StringBuffer("This method returns the reversed object on which it was called");
        System.out.println(sbf3.reverse());
    }
}
