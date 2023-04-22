package classes;

import java.time.*;

/**
 *
 * @author Hussain
 */
public class VaccinationData {
    private Vaccine vaccine;
    private LocalDate dateOfFirstDose;
    private LocalDate dateOfSecondDose;
    private int numOfDoses;
    
    public VaccinationData(){
        this(null, null,null, 0);
    }
    
    public VaccinationData(Vaccine vaccine, LocalDate date1, LocalDate date2, int numOfDoses) {
        this.vaccine = vaccine;
        this.dateOfFirstDose = date1;
        this.dateOfSecondDose = date2;
        this.numOfDoses = numOfDoses;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public LocalDate getDateOfFirstDose() {
        return dateOfFirstDose;
    }

    public void setDateOfFirstDose(int day, int month, int year) {
        this.dateOfFirstDose = LocalDate.of(year, month, day);
    }
    public LocalDate getDateOfSecondDose() {
        return dateOfSecondDose;
    }

    public void setDateOfSecondDose(int day, int month, int year) {
        this.dateOfSecondDose = LocalDate.of(year, month, day);
    }

    public int getNumOfDoses() {
        return numOfDoses;
    }

    public void setNumOfDoses(int numOfDoses) {
        this.numOfDoses = numOfDoses;
    }

    @Override
    public String toString() {
        return vaccine.getvName() + ";" + dateOfFirstDose + ";" + dateOfSecondDose + ";" + numOfDoses;
    }
}
