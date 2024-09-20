import java.util.Scanner;

class Person {
    private String name;
    private int age;

    Person() {
        // Default constructor
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Address {
    private String street;
    private String city;
    private String zipCode;

    Address() {
        // Default constructor
    }

    Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    String getStreet() {
        return street;
    }

    void setStreet(String street) {
        this.street = street;
    }

    String getCity() {
        return city;
    }

    void setCity(String city) {
        this.city = city;
    }

    String getZipCode() {
        return zipCode;
    }

    void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void displayAddressDetails() {
        System.out.println("Street: " + street + ", City: " + city + ", Zip Code: " + zipCode);
    }

    @Override
    public String toString() {
        return "Street: " + street + ", City: " + city + ", Zip Code: " + zipCode;
    }
}

class Employee {
    private Person person;
    private Address address;
    private String jobTitle;
    private double salary;

    Employee() {
        // Default constructor
    }

    Employee(Person person, Address address, String jobTitle, double salary) {
        this.person = person;
        this.address = address;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    Person getPerson() {
        return person;
    }

    void setPerson(Person person) {
        this.person = person;
    }

    Address getAddress() {
        return address;
    }

    void setAddress(Address address) {
        this.address = address;
    }

    String getJobTitle() {
        return jobTitle;
    }

    void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    double getSalary() {
        return salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        person.displayPersonDetails();
        address.displayAddressDetails();
        System.out.println("Job Title: " + jobTitle + ", Salary: " + salary);
    }

    @Override
    public String toString() {
        return "Employee [Person: " + person + ", Address: " + address + ", Job Title: " + jobTitle + ", Salary: " + salary + "]";
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Person
        System.out.print("Enter the name of the person: ");
        String name = scanner.nextLine();

        System.out.print("Enter the age of the person: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Person person = new Person(name, age);

        // Input for Address
        System.out.print("Enter the street of the address: ");
        String street = scanner.nextLine();

        System.out.print("Enter the city of the address: ");
        String city = scanner.nextLine();

        System.out.print("Enter the zip code of the address: ");
        String zipCode = scanner.nextLine();

        Address address = new Address(street, city, zipCode);

        // Input for Employee
        System.out.print("Enter the job title of the employee: ");
        String jobTitle = scanner.nextLine();

        System.out.print("Enter the salary of the employee: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(person, address, jobTitle, salary);

        // Display initial employee details
        employee.displayEmployeeDetails();

        // Optionally modify person details
        System.out.print("Do you want to update the person's details? (yes/no): ");
        scanner.nextLine(); // Consume newline
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            System.out.print("Enter the new name of the person: ");
            name = scanner.nextLine();
            person.setName(name);

            System.out.print("Enter the new age of the person: ");
            age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            person.setAge(age);
        }

        // Optionally modify address details
        System.out.print("Do you want to update the address details? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            System.out.print("Enter the new street of the address: ");
            street = scanner.nextLine();
            address.setStreet(street);

            System.out.print("Enter the new city of the address: ");
            city = scanner.nextLine();
            address.setCity(city);

            System.out.print("Enter the new zip code of the address: ");
            zipCode = scanner.nextLine();
            address.setZipCode(zipCode);
        }

        // Optionally modify job title and salary
        System.out.print("Do you want to update the job title and salary? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            System.out.print("Enter the new job title: ");
            jobTitle = scanner.nextLine();
            employee.setJobTitle(jobTitle);

            System.out.print("Enter the new salary: ");
            salary = scanner.nextDouble();
            employee.setSalary(salary);
        }

        // Display updated employee details
        employee.displayEmployeeDetails();

        scanner.close();
    }
}
