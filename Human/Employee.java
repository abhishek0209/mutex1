package Human;


public class Employee extends Human {

        int id;
        String name;
        Double salary;
        String Designation;

    public Employee(int id, String name, Double salary, String designation) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.Designation = designation;


    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return Designation;
    }



}


