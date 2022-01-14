package hospital;

import java.util.HashMap;

public class SafeQueue extends Queue{

    @Override
    public Patient getNextPatient() {
        if (getPatientsQue().size() == 0) {return null;}

        for (Patient patient: getPatientsQue()) {

        }
        return null;
    }
}
