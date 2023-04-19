package classes;

import java.util.ArrayList;

/**
 *
 * @author Hussain
 */
public class Vaccine {
    private String vName;
    private int numOfDoses;
    private int minAge;
    private int timeBetweenDoses;
    public static ArrayList<Vaccine> vaccines;

    public Vaccine(String vName, int numOfDoses, int minAge, int timeBetweenDoses, ArrayList diseases) {
        this.vName = vName;
        this.numOfDoses = numOfDoses;
        this.minAge = minAge;
        this.timeBetweenDoses = timeBetweenDoses;
        vaccines.add(this);
    }
    
    public Vaccine(){
        this("", 0, 0, 0, null);
    }
    
    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public int getNumOfDoses() {
        return numOfDoses;
    }

    public void setNumOfDoses(int numOfDoses) {
        this.numOfDoses = numOfDoses;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getTimeBetweenDoses() {
        return timeBetweenDoses;
    }

    public void setTimeBetweenDoses(int timeBetweenDoses) {
        this.timeBetweenDoses = timeBetweenDoses;
    }

    @Override
    public String toString() {
        return vName + " " + numOfDoses + " " + minAge + " " + timeBetweenDoses;
    }

}
