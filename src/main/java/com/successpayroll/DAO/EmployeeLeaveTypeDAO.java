package com.successpayroll.DAO;

import com.successpayroll.model.EmployeeData;
import com.successpayroll.model.EmployeeLeaveTypeData;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class EmployeeLeaveTypeDAO implements JpaRepository<EmployeeLeaveTypeData, Integer> {

    public List<EmployeeLeaveTypeData> getAllEmployeesLeaveType(Session session) {
        String hql = "from EmployeeLeaveTypeData order by id";
        Query query = session.createQuery(hql);
        System.out.println(" query list : " + query.getResultList());
        return query.list();
    }

    public List<EmployeeLeaveTypeData> getEmployeeLeaveDataByEmployeeCode(Session session, String employeeCode) {
        System.out.print("employee code value : " + employeeCode);
        String hql = "from EmployeeLeaveTypeData where employeeCode=:employeeCode order by employeeCode";
        Query query = session.createQuery(hql);
        query.setParameter("employeeCode",employeeCode.trim());
        System.out.println(" ===> query string : " + query.getQueryString());
        query.setMaxResults(1);
        List<EmployeeLeaveTypeData> employeeData = (ArrayList<EmployeeLeaveTypeData>) query.list();
        List<EmployeeLeaveTypeData> employeeLeaveTypeDataArrayList = new ArrayList<>();
        employeeData.forEach((e) -> {
            if (e != null && e.getEmployeeCode() != null) {
                /*System.out.println(" ===> employee data output : " + e.getEmployeeCode());*/
                employeeLeaveTypeDataArrayList.add(e);
            }
        });
        return employeeLeaveTypeDataArrayList;
    }

    @Override
    public List<EmployeeLeaveTypeData> findAll() {
        return null;
    }

    @Override
    public List<EmployeeLeaveTypeData> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<EmployeeLeaveTypeData> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<EmployeeLeaveTypeData> findAllById(Iterable<Integer> integers) {
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
    public void delete(EmployeeLeaveTypeData entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends EmployeeLeaveTypeData> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends EmployeeLeaveTypeData> S save(S entity) {
        return null;
    }

    @Override
    public <S extends EmployeeLeaveTypeData> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<EmployeeLeaveTypeData> findById(Integer integer) {
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
    public <S extends EmployeeLeaveTypeData> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends EmployeeLeaveTypeData> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<EmployeeLeaveTypeData> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public EmployeeLeaveTypeData getOne(Integer integer) {
        return null;
    }

    @Override
    public EmployeeLeaveTypeData getById(Integer integer) {
        return null;
    }

    @Override
    public <S extends EmployeeLeaveTypeData> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends EmployeeLeaveTypeData> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends EmployeeLeaveTypeData> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends EmployeeLeaveTypeData> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends EmployeeLeaveTypeData> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends EmployeeLeaveTypeData> boolean exists(Example<S> example) {
        return false;
    }
}
