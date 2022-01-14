package hospital;

import java.util.*;

public class SafeQueue extends Queue {

    @Override
    public Patient getNextPatient() {
        if (getPatientsQue().size() == 0) {
            return null;
        }
        System.out.println(Collections.max(getPatientsQue(), Comparator.comparing(Patient::getSickness)));
        getPatientsQue().remove(Collections.max(getPatientsQue(), Comparator.comparing(Patient::getSickness)));
        return Collections.max(getPatientsQue(), Comparator.comparing(Patient::getSickness));
    }
}
