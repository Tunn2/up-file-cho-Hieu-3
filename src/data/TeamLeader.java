
package data;

public class TeamLeader extends Developer{
    private double bonus;

    public TeamLeader(double bonus, String team, int exp, String id, String name, double baseSal) {
        super(team, exp, id, name, baseSal);
        this.bonus = bonus;
    }
    
    public double getSalary() {
        if (exp >= 5)
            return (baseSal + exp * 2000000) + bonus * (baseSal + exp * 2000000);
        else if (exp < 5 && exp >= 3)
            return (baseSal + exp * 1000000) + bonus * (baseSal + exp * 1000000);
        else 
            return baseSal + bonus * baseSal;
    }
    
}
