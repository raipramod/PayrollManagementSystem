class PartTimeEmployee extends EmployeeApp {
    private int workedHour;
    private double hourlyRate;

    public PartTimeEmployee (String name, int id, int workedHour, double hourlyRate){
        super(name,id);
        this.workedHour = workedHour;
        this.hourlyRate = hourlyRate;

    }

    @Override
    public double calculateSalary(){
        return workedHour * hourlyRate;
    }
}
