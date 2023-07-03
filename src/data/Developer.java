
package data;

import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee {

    protected String team;
    protected ArrayList<Developer> programmingLanguage;
    protected int exp;

    public Developer(String team, int exp, String id, String name, double baseSal) {
        super(id, name, baseSal);
        this.team = team;
        this.exp = exp;
    }
    
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public List<Developer> getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(ArrayList<Developer> programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Developer{" + "team=" + team + ", programmingLanguage=" + programmingLanguage + ", exp=" + exp + '}';
    }
    
    @Override
    public double getSalary() {
        if (exp >= 5)
            return baseSal + exp * 2000000;
        else if (exp < 5 && exp >= 3)
            return baseSal + exp * 1000000;
        else 
            return baseSal;
    }
    
    public void showProfile() {
        System.out.println("|||||");
    }
    
}
