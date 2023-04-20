package classes;

import java.time.*;

/**
 *
 * @author Hussain
 */
public class VaccinationData {
    private Vaccine vaccine;
    private LocalDate dateOfFirstDose;
    private int numOfDoses;
    
    public VaccinationData(){
        this(null, null, 0);
    }
    
    public VaccinationData(Vaccine vaccine, LocalDate date, int numOfDoses) {
        this.vaccine = vaccine;
        this.dateOfFirstDose = date;
        this.numOfDoses = numOfDoses;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public LocalDate getDate() {
        return dateOfFirstDose;
    }

    public void setDate(int day, int month, int year) {
        this.dateOfFirstDose = LocalDate.of(year, month, day);
    }

    public int getNumOfDoses() {
        return numOfDoses;
    }

    public void setNumOfDoses(int numOfDoses) {
        this.numOfDoses = numOfDoses;
    }

    @Override
    public String toString() {
        return vaccine.getvName() + ";" + dateOfFirstDose + ";" + numOfDoses;
    }
}
