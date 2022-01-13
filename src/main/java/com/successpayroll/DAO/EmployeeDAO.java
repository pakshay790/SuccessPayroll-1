package com.successpayroll.DAO;

import com.successpayroll.model.EmployeeData;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class EmployeeDAO {

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

            if(employeeData.getEmployeeCode().equals(employeeData)){
                return employeeData;
            } else {
                employeeData = null;
                return employeeData;
            }
        }
        return employeeData;
    }

    public EmployeeData getCustomer(Session session , String employeeCode) {
        return session.get(EmployeeData.class,employeeCode);
    }
}
