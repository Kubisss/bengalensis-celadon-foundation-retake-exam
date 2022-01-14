package hospital;

import java.util.Random;

public class Patient {
    Random random = new Random();
    private int sickness = random.nextInt(1,11);

    public Patient() {
        this.sickness = sickness;
    }

    public int getSeverity () {
        return this.sickness;
    }

    public void treat () {
        if (this.sickness > 0) {
            setSickness(getSickness()-1);
        }else {
            System.out.println("the severity cannot go below 0!");
            return;
        }

    }

    public int getSickness() {
        return sickness;
    }

    public void setSickness(int sickness) {
        this.sickness = sickness;
    }
}
