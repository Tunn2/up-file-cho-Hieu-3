
package data;

public abstract class Employee {
    protected String id;
    protected String name;
    protected double baseSal;

    public Employee(String id, String name, double baseSal) {
        this.id = id;
        this.name = name;
        this.baseSal = baseSal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSal() {
        return baseSal;
    }

    public void setBaseSal(double baseSal) {
        this.baseSal = baseSal;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", baseSal=" + baseSal + '}';
    }
   
    public abstract double getSalary();
    
}
