class Employee{
    int Salary;
    String name;
    public int getSalary(){
        return Salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class oops{
    public static void main(String[] args){
        Employee xyz = new Employee();
        xyz.setName("ram");
        xyz.Salary = 12000;
        System.out.println(xyz.getName());
        System.out.println(xyz.getSalary());
    }
}