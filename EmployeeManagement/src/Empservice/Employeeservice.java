package Empservice;
import com.Employee1.EmployeeData;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Employeeservice {
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
    List<EmployeeData> c = new ArrayList<EmployeeData>();

    public EmployeeData addEmployeeData() {
        String name;
        int age, salary, id;
        System.out.println("Enter employee name");
        name = s.nextLine();
        System.out.println("Enter employee age");
        age = s1.nextInt();
        System.out.println("Enter employee salary");
        salary = s1.nextInt();
        System.out.println("Enter employee id");
        id = s1.nextInt();
        c.add(new EmployeeData(name, age, salary, id));
        //System.out.println(c);
        return new EmployeeData(name, age, salary, id);
       // return new Employee1("ds", 12, 2332, 232);

    }

    public EmployeeData displayEmployeeDetails() {
        System.out.println("------------------------");
        Iterator<EmployeeData> i = c.iterator();
        while (i.hasNext()) {
            EmployeeData e = i.next();
            System.out.println(e);
        }
        return new EmployeeData("ds", 12, 2332, 232);
    }

    public EmployeeData getDetailsById() {
        boolean found = false;
        System.out.println("enter employee no. to search: ");
        int eno = s.nextInt();
        System.out.println("------------------------");
        Iterator<EmployeeData> i = c.iterator();
        while (i.hasNext()) {
            EmployeeData e = i.next();
            if (e.getEmpid() == eno) {
                System.out.println(e);
                found = true;
            }
        }
        System.out.println("------------------------");
        if (!found) {
            System.out.println("No such Employee");
        }
        System.out.println("------------------------");
        return new EmployeeData("ds", 12, 2332, 232);
    }

    public List<EmployeeData> getAllemployes() {
        Iterator<EmployeeData> i = c.iterator();
        while (i.hasNext()) {
            EmployeeData e = i.next();
            System.out.println(e);
        }
        return c;

    }
    public EmployeeData deleteEmployee(){
        boolean found = false;
        System.out.println("enter employee no. to delete: ");
        int eno = s.nextInt();
        System.out.println("------------------------");
        Iterator<EmployeeData> i = c.iterator();
        while (i.hasNext()){
            EmployeeData e= i.next();
            if(e.getEmpid() == eno){
                i.remove();
                found=true;
            }
        }
        System.out.println("------------------------");
        if(!found){
            System.out.println("No such Employee");
        }else{
            System.out.println("Deleted the Employee details");
        }
        System.out.println("------------------------");
        return new EmployeeData("ds", 12, 2332, 232);

    }
    public EmployeeData updateEmployee(){
        boolean found = false;
        System.out.println("enter employee no. to Update: ");
        int eno = s.nextInt();
        System.out.println("------------------------");
        ListIterator<EmployeeData> li = c.listIterator();
        while (li.hasNext()){
            EmployeeData e= li.next();
            if(e.getEmpid()== eno){
                System.out.println("Employee New Name : ") ;
                s.nextLine();
                String Name = s.nextLine();
                System.out.println("Employee New age : ") ;
                int Age = s1.nextInt();
                System.out.println("Employee New salary : ") ;
                int Salary = s1.nextInt();
                System.out.println("Employee New Id : ") ;
                int Id = s1.nextInt();
                e.setEmpname(Name);
                e.setEmpage(Age);
                e.setEmpsalary(Salary);
                e.setEmpid(Id);
                found=true;

            }
        }
        System.out.println("------------------------");
        if(!found){
            System.out.println("No such Employee");
        }else{
            System.out.println("Deleted the Updated details");
        }
        System.out.println("------------------------");

        return new EmployeeData("ds", 12, 2332, 232);
    }
    public EmployeeData exit(){
     System.exit(0);
     System.out.println("Exited from the loop");
        return new EmployeeData("ds", 12, 2332, 232);

    }
}
