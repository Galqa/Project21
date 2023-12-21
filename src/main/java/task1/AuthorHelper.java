package task1;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class AuthorHelper {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("authorhelper");
        EntityManager em = factory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();


        for (int i = 1; i <= 200; i++) {
            Author author = Author.builder()
                    .name("Чехов" + i)
                    .build();
            em.persist(author);

            if (i % 10 == 0) {
                em.flush();
                em.clear();
            }
        }

        transaction.commit();
        em.close();
        factory.close();
    }
}











