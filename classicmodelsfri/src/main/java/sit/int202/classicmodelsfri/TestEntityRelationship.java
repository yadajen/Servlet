package sit.int202.classicmodelsfri;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import sit.int202.classicmodelsfri.entities.Employee;
import sit.int202.classicmodelsfri.entities.Office;

import java.util.Scanner;

public class TestEntityRelationship {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("OFFICE.FIND_BY_COUNTRY");
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Find office by office code (enter 0 to exit): ");
            String officeCode = scan.next();
            if(officeCode.equalsIgnoreCase("0")) {
                break;
            }
            Office office = em.find(Office.class, officeCode);
            if(office==null) {
                System.out.println("Office number "+ officeCode+ " does not exist !!");
            } else {
                displayOfficeEmployee(office);
            }
        }
    }

    private static void displayOfficeEmployee(Office office) {
        System.out.printf("%s %s %s %s\n",
                office.getOfficeCode(), office.getAddressLine1(),
                office.getCity(), office.getCountry());
        System.out.println("----------------------------------");
        for(Employee e : office.getEmployeeList()) {
            System.out.printf("%4d %-12s %-12s %s\n",
                    e.getEmployeeNumber(), e.getFirstName(), e.getLastName(), e.getJobTitle());
        }
        System.out.println();
    }
}
