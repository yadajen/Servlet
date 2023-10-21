package sit.int202.classicmodelsfri;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sit.int202.classicmodelsfri.entities.Office;

import java.util.Scanner;

public class TestJpa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        System.out.print("Enter office by office-code: ");
        String x = new Scanner(System.in).next();
        Office office = em.find(Office.class, x);
        if(office==null) {
            System.out.println("Office no"+x+" does not exists!!!");
            Office newOffice = new Office();
            newOffice.setOfficeCode(x);
            newOffice.setAddressLine1("126 Pachautit");
            newOffice.setCity("Bangkok");
            newOffice.setCountry("Thailand");
            newOffice.setPhone("0886148554");
            newOffice.setPostalCode("10240");
            newOffice.setTerritory("xx");
            em.getTransaction().begin();
            em.persist(newOffice);
            em.getTransaction().commit();
        }else{
            System.out.println(office);
            System.out.println("Do you want to delete office no"+x+ "(Y/N)");
            String answer = new Scanner(System.in).next();
            if(answer.equalsIgnoreCase("y")){
                em.getTransaction().begin();
                em.remove(office);
                em.getTransaction().commit();
                System.out.println("Office no "+x+" has been removed!!!");
            }
        }
        em.close();
        emf.close();

    }
}
