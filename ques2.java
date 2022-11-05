class Employee{
    String Name;
    int Yoj;
    int Salary;
    String Address;

    Employee(String name,int year,int salary,String address)
    {
        Name=name;
        Yoj=year;
        Salary=salary;
        Address=address;
    }

    void show()
    {
        System.out.println(Name+"   "+Yoj+"             "+Address+"     "+Salary);
    }
}


public class ques2 {

    public static void main(String args[])
    {
        Employee robert=new Employee("Robert", 1994, 500000, "64C-WallStreet");
        Employee Sam=new Employee("Sam   ", 2000, 200000, "64D-WallStreet");
        Employee John=new Employee("John  ", 1999, 250000, "26B-WallStreet");

        System.out.println("Name    Year of Joining       Address        Salary");
        robert.show();
        Sam.show();
        John.show();

    }
    
}
