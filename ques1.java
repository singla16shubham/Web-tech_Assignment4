import java.util.*;
public class ques1 {

    // Vector<int> temp=new Vector<int>(5);

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the vetor:");
        int size=sc.nextInt();
        Vector<Integer> temp=new Vector<Integer>(size);
        // user defined vector of capacity 5;
        System.out.println("Enter the elements of vector:");
        while(temp.size()!=size)
        {
        int a=sc.nextInt();
        temp.addElement(a);    
        }
        System.out.println("Elements of vector are:");
        for(int i=0;i<temp.size();i++)
        {
            System.out.print(temp.elementAt(i)+" ");
        }
        sc.close();
    }
    

    
}
