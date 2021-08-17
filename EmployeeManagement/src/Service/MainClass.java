package Service;
import Empservice.*;
import com.Employee1.EmployeeData;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Employeeservice obj = new Employeeservice();
        List<EmployeeData> c = new ArrayList<EmployeeData>();
        int n;
        Scanner s1 = new Scanner(System.in);
        do {
            System.out.println("1.add");
            System.out.println("2.display");
            System.out.println("3.search");
            System.out.println("4.delete");
            System.out.println("5.update");
            System.out.println("6.GetallEmployees");
            System.out.println("7.Exit");
            System.out.print("Enter the choice n : ");
            n = s1.nextInt();
            switch (n) {
                case 1:
                    obj.addEmployeeData();
                    break;
                case 2:
                    obj.displayEmployeeDetails();
                    break;
                case 3:
                    obj.getDetailsById();
                    break;
                case 4:
                    obj.deleteEmployee();
                    break;
                case 5:
                    obj.updateEmployee();
                    break;
                case 6:
                    obj.getAllemployes();
                    break;
                case 7:
                    obj.exit();
                    break;
                default:
                    System.out.println("Select the correct option");
                    break;
            }
        }while (n!=0);
    }
}


