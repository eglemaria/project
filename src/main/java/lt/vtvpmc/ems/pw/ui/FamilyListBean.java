package lt.vtvpmc.ems.pw.ui;

import java.util.List;

import javax.faces.application.Application;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ems.pw.entities.Family;
import lt.vtvpmc.ems.pw.entities.Student;

public class FamilyListBean {

    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Transactional(readOnly = true)
<<<<<<< HEAD
    public List<?> getFamilyList() {
=======
<<<<<<< HEAD
    public List<?> getFamilyList() {
=======
<<<<<<< HEAD
    public List<?> getFamilyList() {
=======
<<<<<<< HEAD
    public List<?> getFamilyList() {
=======
    public List<?> getApplicationList() {
>>>>>>> 0a11dcb9064815d1f707d4abde2a258d2d8ead79
>>>>>>> 42c18efbc6930cdc07ffd3061cc55d35468f39ef
>>>>>>> 64521b49a6d5b9d17857d31512a30ef70c710707
>>>>>>> 304b62ab939c2594413a624e1d50b2852d64a2a4
        Query query = entityManager.createQuery("select f from Family f");
        return query.getResultList();
    }
    
    @Transactional
    public void removeFamily(Family family) {
        entityManager.remove(entityManager.merge(family));
    }
    
<<<<<<< HEAD
  
=======
<<<<<<< HEAD
  
=======
<<<<<<< HEAD
  
=======
<<<<<<< HEAD
  
=======
   
>>>>>>> 0a11dcb9064815d1f707d4abde2a258d2d8ead79
>>>>>>> 42c18efbc6930cdc07ffd3061cc55d35468f39ef
>>>>>>> 64521b49a6d5b9d17857d31512a30ef70c710707
>>>>>>> 304b62ab939c2594413a624e1d50b2852d64a2a4
    
}