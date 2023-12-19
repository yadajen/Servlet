//natthaphol nirattisaikul 65130500105
package int202.mid_exam_105_2.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrimeNumber {
    private int number;
    private boolean prime;

    //constructor
    public PrimeNumber(int number) {
        this.number = number;
        this.prime = isPrime();
    }

    //check prime
    public boolean isPrime() {
        if (this.number <= 1) {
            return false;
        }
        for (int i = 2; i <= this.number / 2; i++) {
            if ((this.number % i) == 0)
                return false;
        }
        return true;
    }
}
