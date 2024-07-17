import java.util.ArrayList;

class PayrollSystemApp {
    // EmployeeApp is already defined as class
    private ArrayList<EmployeeApp> employeeList;

    public PayrollSystemApp(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(EmployeeApp employeeApp){
        employeeList.add(employeeApp);
    }

    public void removeEmployee(int id){
        EmployeeApp employeeAppToRemove =  null;
        for(EmployeeApp employeeapp : employeeList){
            if (employeeapp.getId() == id){
                employeeAppToRemove = employeeapp;
                break;
            } else if(employeeAppToRemove != null){
                employeeList.remove(employeeAppToRemove);
            }
        }

        public void displayEmployees(){
            for(EmployeeApp employeeApp : employeeList){
                System.out.println(employeeApp);
            }
        }
    }

}
