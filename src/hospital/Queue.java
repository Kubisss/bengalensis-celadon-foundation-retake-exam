package hospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Queue {
    private List<Patient> patientsQue;

    public Queue() {
        this.patientsQue = new ArrayList<>();
    }

    public void queuePatientUp(Patient patient) {
        this.patientsQue.add(patient);
    }

    public abstract Patient getNextPatient();

    public List<Patient> getPatientsQue() {
        return this.patientsQue;
    }

}
