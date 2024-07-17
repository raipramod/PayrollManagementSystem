// Created FullTime Employee class and declared attributes
class FullTimeEmployee extends EmployeeApp {

    private double monthlySalary;

    // Created the constructor of FullTime Employee
    public FullTimeEmployee(String name, int id, double monthlySalary){
        // Used super keyword to get the parent class attribute in child class
        super(name, id);

        this.monthlySalary = monthlySalary;
    }

    // Implemented calculate salary abstract method
    @Override
    public double calculateSalary(){

        return monthlySalary;
    }

}
