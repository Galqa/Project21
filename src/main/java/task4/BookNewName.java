/** Додати метод оновлення книги за id */


package task4;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;



public class BookNewName {
    private static EntityManager em;
    private static int id;
    private static String title;
    private static String author;

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("authorhelper");
        EntityManager em = factory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
    }
    public static void updateBookNewName(EntityManager em, int id, String title, String author) {
        BookNewName.em = em;
        BookNewName.id = id;
        BookNewName.title = title;
        BookNewName.author = author;
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        Book book = em.find(Book.class, id);
        if (book != null) {
            book.setTitle(title);
            em.persist(author);
        }

        transaction.commit();
    }
}



