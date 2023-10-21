package sit.int202.jcfreview;
import lombok.*;

import java.util.Comparator;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double gpax;
    public static final Comparator<Student> SORT_BY_GPAX_DESC = new Comparator<Student>() {
        //class annonymus inner class(don't have name)
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getGpax()<o2.getGpax()) return 1;
            else if (o1.getGpax()>o2.getGpax()) return -1;
            else return o1.getName().compareTo(o2.getName()) ;
        }
    };

    @Override
    public int compareTo(Student o) {
        return this.getId() - o.getId();
    }
//    public static class StudentComparatorByGpaxDesc implements Comparator<Student>{
//
//        @Override
//        public int compare(Student o1, Student o2) {
//            if (o1.getGpax()<o2.getGpax()) return 1;
//            else if (o1.getGpax()>o2.getGpax()) return -1;
//            else return o1.getName().compareTo(o2.getName()) ;
//        }
//    }
}
