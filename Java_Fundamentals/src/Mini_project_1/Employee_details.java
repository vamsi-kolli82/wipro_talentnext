package Mini_project_1;


import java.util.Scanner;

class Employee_details {
    static class Employee {
        int empNo;
        String empName;
        String joinDate;
        char designationCode;
        String department;
        int basic;
        int hra;
        int it;
        
        Employee(int empNo, String empName, String joinDate, char designationCode, 
                String department, int basic, int hra, int it) {
            this.empNo = empNo;
            this.empName = empName;
            this.joinDate = joinDate;
            this.designationCode = designationCode;
            this.department = department;
            this.basic = basic;
            this.hra = hra;
            this.it = it;
        }
    }
    
    static Employee[] employees = {
        new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000),
        new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000),
        new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000),
        new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000),
        new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000),
        new Employee(1006, "Suman", "1/1/2000", 'e', "Manufacturing", 23000, 9000, 4400),
        new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000)
    };
    
    static int getDA(char designationCode) {
        switch(designationCode) {
            case 'e': return 20000;
            case 'c': return 32000;
            case 'k': return 12000;
            case 'r': return 15000;
            case 'm': return 40000;
            default: return 0;
        }
    }
    
    static String getDesignation(char designationCode) {
        switch(designationCode) {
            case 'e': return "Engineer";
            case 'c': return "Consultant";
            case 'k': return "Clerk";
            case 'r': return "Receptionist";
            case 'm': return "Manager";
            default: return "Unknown";
        }
    }
    
    static int calculateSalary(Employee emp) {
        return emp.basic + emp.hra + getDA(emp.designationCode) - emp.it;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        String input = scanner.nextLine().trim();
        
        try {
            int empId = Integer.parseInt(input);
            boolean found = false;
            
            for (Employee emp : employees) {
                if (emp.empNo == empId) {
                    found = true;
                    System.out.println("Emp No.  Emp Name    Department    Designation    Salary");
                    System.out.printf("%-8d %-11s %-13s %-14s %d%n", 
                        emp.empNo, emp.empName, emp.department, 
                        getDesignation(emp.designationCode), calculateSalary(emp));
                    break;
                }
            }
            
            if (!found) {
                System.out.println("There is no employee with empid : " + empId);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid employee ID - must be a number");
        }
    }
}
