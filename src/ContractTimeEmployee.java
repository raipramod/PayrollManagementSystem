class ContractTimeEmployee extends EmployeeApp {
    private boolean employeeBenefit;
    private int fixedHour;
    private double rate;

    public ContractTimeEmployee(String name, int id, boolean employeeBenefit, int fixedHour, double rate){
        super(name, id);
        this.employeeBenefit = employeeBenefit;
        this.rate = rate;
        this.fixedHour = fixedHour;
    }

    @Override
    public double calculateSalary(){
       return fixedHour * rate;
    }
}
