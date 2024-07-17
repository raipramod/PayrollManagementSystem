    // Created EmployeeApp class and declared the attributes
abstract class EmployeeApp {
    private String name;
    private int id;

    // Created Constructor of the EmployeeApp class
    public EmployeeApp(String name, int id){
        this.name = name;
        this.id = id;
    }
    // Implemented the encapsulation to get the name and id respectively
    public String getName(){

        return name;
    }

    public int getId(){

        return id;
    }

    // Created abstract method for calculate the salary, abstract method has no method body
    public abstract double calculateSalary();

    // Override toString method and return all the attributes
       @Override
        public String toString(){

           return "Employee [ name = "+name+", id = "+id+", salary = "+calculateSalary()+"]";
    }


}
