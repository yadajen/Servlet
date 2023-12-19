//natthaphol nirattisaikul 65130500105
package int202.mid_exam_105_2.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class PrimeCheckingHistory {
    private List<PrimeNumber> numberList = new ArrayList<>();//array list attribute
    public List<PrimeNumber> findAll(){
        return numberList;
    }//for get array list
}
