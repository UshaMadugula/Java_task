package Empservice;
import com.Employee1.Employee1;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

    public class Employeeservice1 {
        public static void main(String[] args) {
            List<Employee1> c= new ArrayList<Employee1>();
            Scanner s= new Scanner(System.in);
            Scanner s1= new Scanner(System.in);
            int p;
            do{
                System.out.println("1.add");
                System.out.println("2.display");
                System.out.println("3.search");
                System.out.println("4.delete");
                System.out.println("5.update");
                System.out.print("Enter the choice n : ");
                p=s.nextInt();
                switch(p){
                    case 1:
                        System.out.print("Employee Name : ") ;
                        String Name = s1.nextLine();
                        System.out.print("Employee age : ") ;
                        int Age = s.nextInt();
                        System.out.print("Employee salary : ") ;
                        Double Salary = s.nextDouble();
                        System.out.print("Employee Id : ") ;
                        int Id = s.nextInt();
                        c.add(new Employee1(Name,Age,Salary,Id));
                        break;
                    case 2:
                        System.out.println("------------------------");
                        Iterator<Employee1> i = c.iterator();
                        while (i.hasNext()){
                            Employee1 e= i.next();
                            System.out.println(e);
                        }
                        System.out.println("------------------------");
                        break;
                    case 3:
                        boolean found = false;
                        System.out.println("enter employee no. to search: ");
                        int eno = s.nextInt();
                        System.out.println("------------------------");
                        i = c.iterator();
                        while (i.hasNext()){
                            Employee1 e= i.next();
                            if(e.getEmpid()== eno){
                                System.out.println(e);
                               found=true;
                            }
                        }
                        System.out.println("------------------------");
                        if(!found){
                            System.out.println("No such Employee");
                        }
                        System.out.println("------------------------");
                        break;
                    case 4:
                        found = false;
                        System.out.println("enter employee no. to delete: ");
                        eno = s.nextInt();
                        System.out.println("------------------------");
                        i = c.iterator();
                        while (i.hasNext()){
                            Employee1 e= i.next();
                            if(e.getEmpid()== eno){
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
                        break;
                    case 5:
                        found = false;
                        System.out.println("enter employee no. to Update: ");
                        eno = s.nextInt();
                        System.out.println("------------------------");
                        ListIterator<Employee1> li = c.listIterator();
                        while (li.hasNext()){
                            Employee1 e= li.next();
                            if(e.getEmpid()== eno){
                                System.out.print("Employee New Name : ") ;
                                Name = s1.nextLine();
                                System.out.print("Employee New age : ") ;
                                Age = s.nextInt();
                                System.out.print("Employee New salary : ") ;
                                Salary = s.nextDouble();
                                System.out.print("Employee New Id : ") ;
                                Id = s.nextInt();
                                e.setEmpid(Id);
                                e.setEmpage(Age);
                                e.setEmpname(Name);
                                e.setEmpsalary(Salary);
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
                        break;
                }
            }while(p!=0);
        }
    }

