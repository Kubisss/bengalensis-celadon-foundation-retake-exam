package hospital;

public class HospitalApp {
    public static void main(String[] args) {
        Patient patient = new Patient();
        System.out.println(patient.getSeverity());
        patient.treat();
        System.out.println(patient.getSeverity());
        patient.treat();
        System.out.println(patient.getSeverity());
        patient.treat();
        System.out.println(patient.getSeverity());
        patient.treat();
        System.out.println(patient.getSeverity());
        patient.treat();

        Hospital hospital = new Hospital(new ClassicQueue());
    }


}
