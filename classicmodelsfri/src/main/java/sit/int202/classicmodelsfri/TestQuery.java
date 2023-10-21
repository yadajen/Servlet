package sit.int202.classicmodelsfri;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import sit.int202.classicmodelsfri.entities.Office;

import java.util.List;

public class TestQuery {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("OFFICE.FIND_ALL");
        List<Office> officeList = query.getResultList();
        for(Office o : officeList ) {
            System.out.printf("%-2s %-25s %-13s %s\n",
                    o.getOfficeCode(), o.getAddressLine1(), o.getCity(), o.getCountry());
        }
        em.close();
    }
}
