package hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private Queue queue;

    public Hospital(Queue queue) {
        this.queue = queue;
    }

    public void addPatient(Patient patient) {
        this.queue.queuePatientUp(patient);
    }

    public Patient getNextPatient() {
        return this.queue.getNextPatient();
    }

    public void treatNextPatient() {
        if (this.queue.getPatientsQue().size() == 0) {
            return;
        }

        this.queue.getNextPatient().treat();
        this.queue.getPatientsQue().remove(this.queue.getNextPatient());
    }

    @Override
    public String toString() {
        return "Hospital has " + queue.getPatientsQue().size() + " patients in que." +
                " PatientList is " + queue.getPatientsQue() + "";
    }
}

