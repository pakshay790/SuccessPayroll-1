package com.successpayroll.DAO;

import com.successpayroll.model.EmployeeLeaveTypeData;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class EmployeeLeaveTypeDAO {

    public List<EmployeeLeaveTypeDAO> getAllEmployeesLeaveType(Session session) {
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
}
