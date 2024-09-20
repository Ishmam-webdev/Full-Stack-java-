 class Person {
	private String name;
    private int age;
	Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	Person(String name, int age) {
		super();
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
	
}
 class Address {

	private String street;
    private String city;
    private String zipCode;
	Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	Address(String street, String city, String zipCode) {
		super();
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
    
}
 class Employee {

    private Person person;
    private Address address;
    private String jobTitle;
    private double salary;
	Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	Employee(Person person, Address address, String jobTitle, double salary) {
		super();
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

}
 class Main {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("muna", 30);

        // Create an Address object
        Address address = new Address("123 Bhubanswar", "firestation", "751003");

        // Create an Employee object
        Employee employee = new Employee(person, address, "Software Engineer", 90000.00);

        // Display initial employee details
        employee.displayEmployeeDetails();

        // Modify person details
        employee.getPerson().setName("muna das");
        employee.getPerson().setAge(35);

        // Modify address details
        employee.getAddress().setStreet("lane 2 road 3");
        employee.getAddress().setCity("bbsr");
        employee.getAddress().setZipCode("751003");

        // Modify job title and salary
        employee.setJobTitle("Senior Software Engineer");
        employee.setSalary(120000.00);

        // Display updated employee details
        employee.displayEmployeeDetails();
    }
}