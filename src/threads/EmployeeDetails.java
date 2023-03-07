package threads;

class Employee {
	   
    private int iD;
    private String name;
    private int age;
    private static int nextId = 1;
   
   
    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.iD = nextId++;
    }
    public void show()
    {
        System.out.println("Id=" + iD + "\nName=" + name
                           + "\nAge=" + age+"\n");
    }
    public void showNextId()
    {
        System.out.println("Next employee id will be="
                           + nextId+"\n");
    }
    protected void finalize()
    {
       --nextId;
    }
}
 
public class EmployeeDetails {
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("Employer 1", 56);
        Employee employee2 = new Employee("Employer 2", 45);
        Employee employee3 = new Employee("Employer 3", 25);
        Employee employee4=new Employee ("Employer 4",33);
        employee1.show();
        employee2.show();
        employee3.show();
        employee3.showNextId();
 
        {
            Employee intern1 = new Employee("Intern 1", 23);
            Employee intern2 = new Employee("Intern 2", 21);
            intern2.showNextId();
            intern1.show();
            intern2.show();
            intern1=intern2=null;
            System.gc();
            System.runFinalization();
           
        }
        employee3.showNextId();
        employee4.show();
    }
}