# Payroll Management System

**Author**: Pramod Rai  
**Date**: July 14, 2024  

## Description

This project is an Employee Management System implemented in Java, showcasing the use of various Object-Oriented Programming (OOP) concepts. The system supports managing different types of employees: Full-Time, Part-Time, and Contract employees.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Classes and Methods](#classes-and-methods)
- [Contributing](#contributing)
- [License](#license)

## Installation

To run this project locally, follow these steps:

1. **Clone the repository:**
    ```bash
    git clone https://github.com/yourusername/employee-management-system.git
    ```

2. **Navigate to the project directory:**
    ```bash
    cd employee-management-system
    ```

3. **Compile the Java files:**
    ```bash
    javac PayrollApp.java
    ```

4. **Run the application:**
    ```bash
    java PayrollApp
    ```

## Usage

This application allows you to add and remove employees from the system and display their information. The main class, `PayrollApp`, demonstrates these functionalities.

## Classes and Methods

### `PayrollApp`

The `PayrollApp` class is the entry point of the application. It creates instances of `PayrollSystemApp`, `FullTimeEmployee`, `PartTimeEmployee`, and `ContractTimeEmployee`, and demonstrates adding, removing, and displaying employees.

### `FullTimeEmployee`

Represents a full-time employee with a monthly salary.

- **Constructor:** `FullTimeEmployee(String name, int id, double monthlySalary)`
- **Method:** `double calculateSalary()`

### `PartTimeEmployee`

Represents a part-time employee with hourly rates and worked hours.

- **Constructor:** `PartTimeEmployee(String name, int id, int workedHour, double hourlyRate)`
- **Method:** `double calculateSalary()`

### `ContractTimeEmployee`

Represents a contract employee with a fixed hourly rate and an option for employee benefits.

- **Constructor:** `ContractTimeEmployee(String name, int id, boolean employeeBenefit, int fixedHour, double rate)`
- **Method:** `double calculateSalary()`

### `EmployeeApp`

An abstract class representing a general employee.

- **Constructor:** `EmployeeApp(String name, int id)`
- **Methods:**
  - `String getName()`
  - `int getId()`
  - `abstract double calculateSalary()`
  - `String toString()`

### `PayrollSystemApp`

Manages a list of employees.

- **Constructor:** `PayrollSystemApp()`
- **Methods:**
  - `void addEmployee(EmployeeApp employeeApp)`
  - `void removeEmployee(int id)`
  - `void displayEmployees()`

## Contributing

Contributions are welcome! Please create an issue or submit a pull request for any changes or improvements.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
