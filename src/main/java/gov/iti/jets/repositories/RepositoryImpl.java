package gov.iti.jets.repositories;

import java.util.List;

import gov.iti.jets.repositories.interfaces.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;

public class RepositoryImpl<E, K> implements Repository<E, K> {

    protected EntityManager _entityManager;
    protected CriteriaBuilder _criteriaBuilder;
    private Class<E> type;

    public RepositoryImpl() {
    }

    public RepositoryImpl(Class<E> e) {
        _entityManager = EntityHandler.getEntityManager();
        _criteriaBuilder = EntityHandler.getCriteriaBuilder();
        type = e;
    }

    @Override
    public E create(E e) {

        try {
            _entityManager.getTransaction().begin();
            _entityManager.persist(e);
            _entityManager.getTransaction().commit();
        } catch (Exception ex) {
            _entityManager.getTransaction().rollback();
            System.out.println("erro : " + ex.getMessage());
            return null;
        }

        return e;
    }

    @Override
    public E find(K id) {
        E ew = _entityManager.find(type, id);
        return ew;
    }

    @Override
    public E findFromContext(K id) {
        try {
            E ew = _entityManager.getReference(type, id);
            return ew;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<E> findAll() {
        List<E> list = (List<E>) _entityManager.createQuery("FROM " + type.getName() + " ", type).getResultList();
        return list;
    }

    public List<E> findAll(int page, int count) {
        List<E> list = (List<E>) _entityManager.createQuery("FROM " + type.getName() + " ", type)
        .setFirstResult((page - 1) * count)
        .setMaxResults(count)
        .getResultList();
        return list;
    }

    @Override
    public boolean remove(E e) {
        try {

            _entityManager.getTransaction().begin();
            _entityManager.remove(e);
            _entityManager.getTransaction().commit();

        } catch (Exception ex) {
            _entityManager.getTransaction().rollback();
            throw ex;
        }

        return true;
    }

    @Override
    public E update(E e) {
        try {
            _entityManager.getTransaction().begin();
            _entityManager.merge(e);
            _entityManager.getTransaction().commit();

        } catch (Exception ex) {
            _entityManager.getTransaction().rollback();
            throw ex;
        }
        return e;
    }

    public <T> List<T> query(String query, String... param) {

        var q = _entityManager.createQuery(query);
        for (int param2 = 1; param2 <= param.length; param2++) {
            q.setParameter(param2, param[param2 - 1]);
        }

        return q.setMaxResults(2).getResultList();
    }

    public <T> List<T> query(String query, int page, String... param) {

        var q = _entityManager.createQuery(query);
        for (int param2 = 1; param2 <= param.length; param2++) {
            q.setParameter(param2, param[param2 - 1]);
        }

        return q.setFirstResult((page - 1) * 10).setMaxResults(10).getResultList();
    }

}
