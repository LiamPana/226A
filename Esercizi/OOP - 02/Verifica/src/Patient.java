/**
 * Classe Patient serve per creare dei pazienti
 */

import java.util.Random;

public class Patient {
    private String name;
    private int age;
    private PatientType patientType;
    private String gender;
    Random rand = new Random();
    int randomNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PatientType getPatientType() {
        return patientType;
    }

    public void setPatientType(PatientType patientType) {
        this.patientType = patientType;
    }

    public String getGender() {
        return gender;
    }

    public Patient(String name, String gender, PatientType patientType) {
        this.name = name;
        this.gender = gender;
        this.patientType = patientType;
        this.age = randomNum = rand.nextInt(100);
    }

    public void setGender(String gender) {
        if ((gender != "F") || (gender != "M")) {
            this.gender = gender;
        }
        else {
            System.out.println("Genere non valido");
        }
    }

    /**
     * Metodo toString()
     */
    @Override
    public String toString() {
        return "Patient{" +
                "gender='" + gender + '\'' +
                ", patientType=" + patientType +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
