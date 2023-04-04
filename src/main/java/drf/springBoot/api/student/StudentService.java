package drf.springBoot.api.student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//////////////////////////////
/// Entity Manager Example ///
//////////////////////////////
@Repository
@Transactional
public class StudentService {
    @PersistenceContext
    EntityManager em;

    public void insertStudent(Student student){
        em.persist(student);
    }
}
