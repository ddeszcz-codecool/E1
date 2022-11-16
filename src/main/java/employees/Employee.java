package employees;

public class Employee {
    private String name; //getters and setters since surname/name can change but filed should still be connected with the same person
    private String surname; //getters and setters since surname/name can change but filed should still be connected with the same person
    private static int employeeNumber = 0;  //only getter this field cannot change


    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        employeeNumber++;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
