import java.util.ArrayList;
import java.util.List;

/**
 * Classe PatientManager serve per instanziare i pazienti nel nostro manager
 * e poi ci permette di creare i pazienti e gestirli
 */

public class PatientManager {
    List<Patient> patients = new ArrayList<Patient>();

    /**
     * Metodo aggiungi un paziente al nostro PatientManager
     */
    public void addPatient(Patient p) {
        patients.add(p);
    }

    /**
     * Metodo rimuovere un paziente dal nostro PatientManager
     */
    public void removePatient(Patient p) {
        patients.remove(p);
    }

    /**
     * Metodo ci mostra i pazienti presenti nel nostro PatientManager
     */
    public void showPatients() {
        System.out.println("List of patients:");
        for (Patient p : patients) {
            System.out.println(p);
        }
    }

    /**
     * Metodo mostra l'eta media dei pazienti presenti nel nostro PatientManager
     */
    public void showAvargeAge() {
        double avargeAge = 0;
        int count = 0;
        for (Patient p : patients) {
            avargeAge += p.getAge();
            count++;
        }
        avargeAge /= count;
        avargeAge = Math.round(avargeAge);
        System.out.println("Avarge Age of Patients: " + avargeAge);
    }

    /**
     * Metodo mostra l'eta media dei pazienti presenti nel nostro PatientManager scegliendo il tipo di paziente
     */
    public void showAvargeAgeForPatientType(PatientType pt) {
        double avargeAge = 0;
        int count = 0;
        for (Patient p : patients) {
            if (pt == p.getPatientType()) {
                avargeAge += p.getAge();
                count++;
            }
        }
        avargeAge /= count;
        avargeAge = Math.round(avargeAge);
        System.out.println("Type: '" + pt + "' Avarge Age of Patients: " + avargeAge);
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("David", "M", PatientType.EMERGENZA);
        Patient patient2 = new Patient("Stefano", "M", PatientType.EMERGENZA);
        Patient patient3 = new Patient("Davide", "M", PatientType.AMBULATORIALE);
        Patient patient4 = new Patient("Sidon", "M", PatientType.AMBULATORIALE);
        Patient patient5 = new Patient("Mirco", "M", PatientType.RICOVERATO);
        Patient patient6 = new Patient("Michele", "M", PatientType.RICOVERATO);
        Patient patient7 = new Patient("Marco", "M", PatientType.RICOVERATO);
        PatientManager patientManager = new PatientManager();

        patientManager.addPatient(patient1);
        patientManager.addPatient(patient2);
        patientManager.addPatient(patient3);
        patientManager.addPatient(patient4);
        patientManager.addPatient(patient5);
        patientManager.addPatient(patient6);
        patientManager.addPatient(patient7);
        patientManager.removePatient(patient5);
        patientManager.showPatients();
        patientManager.showAvargeAge();
        patientManager.showAvargeAgeForPatientType(PatientType.RICOVERATO);
    }
}