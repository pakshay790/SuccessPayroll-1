package com.successpayroll.DAO;

import com.successpayroll.model.EmployeeData;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class EmployeeDAO implements JpaRepository<EmployeeData, Integer> {

    public List<EmployeeData> getAllEmployees(Session session) {
        String hql = "from EmployeeData order by id";
        Query query = session.createQuery(hql);
        System.out.println(" query list : " + query.getResultList());
        return query.list();
    }

    public List<EmployeeData> getTenEmployees(Session session) {
        String hql = "from EmployeeData order by id";
        Query query = session.createQuery(hql);
        query.setMaxResults(10);
        return query.list();
    }

    public EmployeeData getEmployeeDataByEmployeeCode(Session session, String employeeCode) {
        System.out.print("employee code value : " + employeeCode);
        String hql = "from EmployeeData where employeeCode=:employeeCode order by employeeCode";
        Query query = session.createQuery(hql);
        query.setParameter("employeeCode",employeeCode.trim());
        System.out.println(" ===> query string : " + query.getQueryString());
        query.setMaxResults(1);
        EmployeeData employeeData = (EmployeeData) query.uniqueResult();
        if(employeeData!=null) {
            System.out.println(" ===> employee data output : " + employeeData.getEmployeeCode());
            return employeeData;
            /*if(employeeData.getEmployeeCode().equals(employeeData)){
                return employeeData;
            } else {
               *//* employeeData = null;*//*
                return null;
            }*/
        }
        return null;
    }

    public EmployeeData getCustomer(Session session , String employeeCode) {
        return session.get(EmployeeData.class,employeeCode);
    }

    @Override
    public List<EmployeeData> findAll() {
        return null;
    }

    @Override
    public List<EmployeeData> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<EmployeeData> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<EmployeeData> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(EmployeeData entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends EmployeeData> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends EmployeeData> S save(S entity) {
        return null;
    }

    @Override
    public <S extends EmployeeData> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<EmployeeData> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends EmployeeData> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends EmployeeData> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<EmployeeData> entities) {
        JpaRepository.super.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<EmployeeData> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public EmployeeData getOne(Integer integer) {
        return null;
    }

    @Override
    public EmployeeData getById(Integer integer) {
        return null;
    }

    @Override
    public <S extends EmployeeData> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends EmployeeData> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends EmployeeData> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends EmployeeData> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends EmployeeData> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends EmployeeData> boolean exists(Example<S> example) {
        return false;
    }
}
