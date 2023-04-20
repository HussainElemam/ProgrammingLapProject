package classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hussain
 */
public class database {

    private ArrayList<Patient> patients;
    private ArrayList<Vaccine> vaccines;
    private ArrayList<VaccinationData> vData;

    Scanner patientsFile = new Scanner(new FileReader("patientsFile.txt"));
    Scanner vaccinesFile = new Scanner(new FileReader("vaccinesFile.txt"));
    Scanner vDataFile = new Scanner(new FileReader("vDataFile.txt"));

    public database() throws FileNotFoundException {
        while (vaccinesFile.hasNext()){
            String[] line = vaccinesFile.nextLine().split(",");
            vaccines.add(new Vaccine(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3])));
        }
        while (patientsFile.hasNext()) {
            String[] line = patientsFile.nextLine().split(",");
            LocalDate date = LocalDate.parse(line[1]);
            VaccinationData pv = new VaccinationData();
            patients.add(new Patient(line[0], date, line[2], line[3], null, line[5].charAt(0)));
        }
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public ArrayList<Vaccine> getVaccines() {
        return vaccines;
    }

}
