package data;

public class Tester extends Employee{
    private double bonus;
    private String type;

    public Tester(double bonus, String type, String id, String name, double baseSal) {
        super(id, name, baseSal);
        this.bonus = bonus;
        this.type = type;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getSalary() {
        return baseSal + bonus * baseSal;
    }
    
}
