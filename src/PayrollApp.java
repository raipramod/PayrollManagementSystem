/** Author : Pramod Rai
 * Description : Implemented all OOPs concept to develop Employee Management System in Java
 * Date : July 14 2024
 */
public class PayrollApp {
    public static void main(String[] args) {
        PayrollSystemApp payrollSystemApp = new PayrollSystemApp();
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Rai", 32, 70000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jon", 19, 20, 15);
        ContractTimeEmployee contractTimeEmployee = new ContractTimeEmployee("Purna", 23,Boolean.parseBoolean("FALSE"), 10, 12);

        System.out.println("Initial Employee Info");
        payrollSystemApp.addEmployee(fullTimeEmployee);
        payrollSystemApp.addEmployee(partTimeEmployee);
        payrollSystemApp.addEmployee(contractTimeEmployee);
        payrollSystemApp.displayEmployees();

        System.out.println("After Removing the some Info");
        payrollSystemApp.removeEmployee(19);
        System.out.println("Remaining Employee Info");
        payrollSystemApp.displayEmployees();

        }
    }

