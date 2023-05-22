public class StringBuilderAssignment {
    public static void main(String[] args) {
        StringBuilder sbl=new StringBuilder();
        sbl.append("StringBuilder");
        sbl.append(" is a peer class of String");
        sbl.append(" that provides much of");
        sbl.append(" the functionality of strings");
        System.out.println(sbl);
        StringBuilder sbl2=new StringBuilder("It is used to   at the specified index position");
        sbl2.insert(15,"insert text");
        System.out.println(sbl2);
        StringBuilder sbl3=new StringBuilder("This method returns the reversed object on which it was called");
        System.out.println(sbl3.reverse());
    }
}
