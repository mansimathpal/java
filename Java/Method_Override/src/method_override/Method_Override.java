package method_override;

class Person
{
    public void showDetails()
    {
        System.out.println("In the Person class");
    }
}
class Employee extends Person
{
    public void showDetails()
    {
        System.out.println("In the Employee class");
    }
}
class Student extends Person
{
    public void showDetails()
    {
        System.out.println("In the Student class");
    }
}
 class Method_Override {
    public static void main(String[] args) {
       Person p = new Person();
       Employee e = new Employee();
       Student s  = new Student();
       Person ref;
       ref = p;
       ref.showDetails();
       ref = e;
       ref.showDetails();
       ref = s;
       ref.showDetails();
    }
}
