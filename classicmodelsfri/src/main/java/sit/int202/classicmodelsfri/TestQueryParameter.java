package sit.int202.classicmodelsfri;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import sit.int202.classicmodelsfri.entities.Office;

import java.util.List;
import java.util.Scanner;

public class TestQueryParameter {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("OFFICE.FIND_BY_COUNTRY");
        Scanner scan = new Scanner(System.in);
        System.out.println("Search office by country");
        String country = scan.next();
        while(true) {
            System.out.println("Search office by country enter 0 to exit: ");
            if (country.equalsIgnoreCase("0")) {
                break;
            }

            query.setParameter("countryParam", country + "%");
            List<Office> officeList = query.getResultList();
            for (Office o : officeList) {
                System.out.printf("%-2s %-25s %-13s %s\n",
                        o.getOfficeCode(), o.getAddressLine1(), o.getCity(), o.getCountry());
            }

            System.out.println("Search office by country");
            country = scan.next();
        }
        em.close();
    }
}

