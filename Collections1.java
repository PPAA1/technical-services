import java.util.*;

class Collections1
{
    public static void main(String arg[])
    {
        LinkedList <String>lobj = new LinkedList<String>();

        lobj.add("shiv");
        lobj.add("aditya");
        lobj.add("scout");
        lobj.add("jonny");
        lobj.add("ram");

        System.out.println("Elements of Linked list are : "+lobj);

        lobj.addFirst(pooja);
        
        System.out.println("Elements of Linked list are : "+lobj);

        lobj.addLast(neha);
        
        System.out.println("Elements of Linked list are : "+lobj);

        
        lobj.remove();
        System.out.println("Elements of Linked list are : "+lobj);

        lobj.remove();
        System.out.println("Elements of Linked list are : "+lobj);

        lobj.remove(0);
        System.out.println("Elements of Linked list are : "+lobj);

        lobj.removeLast();
        System.out.println("Elements of Linked list are : "+lobj);

        System.out.println("Number of elements are : "+lobj.size());

        lobj.set(1,"shivendra");
        System.out.println("Elements of Linked list are : "+lobj);


        lobj.clear();
        System.out.println("Elements of Linked list are : "+lobj);

}
}