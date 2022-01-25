package com.successpayroll.controller;

import java.util.ArrayList;
import java.util.List;

import com.successpayroll.DAO.EmployeeDAO;
import com.successpayroll.DAO.EmployeeLeaveTypeDAO;
import com.successpayroll.model.EmployeeData;
import com.successpayroll.model.EmployeeLeaveTypeData;
import com.successpayroll.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class EmployeeController {
    private Logger logger = LogManager.getLogger(this.getClass());

    @Autowired
    EmployeeDAO employeeDAO;

    @Autowired
    EmployeeLeaveTypeDAO employeeLeaveTypeDAO;

    @RequestMapping("/get")
    @ResponseBody
    public String getString() {
        System.out.println(" inside getAll method");
        logger.info("-----------------inside get all method for employee controller ------------------");
        return "Hello World!";
    }
    @RequestMapping("/getAllEmployees")
    @ResponseBody
    public List<EmployeeData> getAllEmployees() {
        logger.info("-----------------inside get all method for employee controller ");
        List<EmployeeData> listOfEmployeeData = null;
        try {
            HibernateUtil util = new HibernateUtil();
            SessionFactory sessionFactory =  util.getSessionFactory("hrTest");
            System.out.println("session factory : " + sessionFactory.toString());
            Session session = sessionFactory.openSession();
            System.out.println(" session acquired : " + session.toString());
            listOfEmployeeData = employeeDAO.getAllEmployees(session);
            System.out.println(" list of employee : " + listOfEmployeeData.size());
            session.close();
            sessionFactory.close();
        } catch (Exception ex) {
            System.out.println("exception");
            ex.printStackTrace();
        }
        return listOfEmployeeData;
    }

    @RequestMapping(value ="/getEmployeeDetailsFromEmployeeCode/employeeCode={employeeCode}",
            method = RequestMethod.GET)
    @ResponseBody
    public EmployeeData getEmployeeDetailsFromEmployeeCode(@PathVariable("employeeCode")
                                                                           String employeeCode) {
        logger.info("---> inside getEmployeeDetailsFromEmployeeCode controller method");
        EmployeeData tblEmployeeData = new EmployeeData();
        try {
            HibernateUtil util = new HibernateUtil();
            SessionFactory sessionFactory = util.getSessionFactory("hrTest");
            Session session = sessionFactory.openSession();
            tblEmployeeData = employeeDAO.getEmployeeDataByEmployeeCode(session, employeeCode);
            session.close();
            sessionFactory.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return tblEmployeeData;
    }

    @RequestMapping("/getAllEmployeeLeaveType")
    @ResponseBody
    public List<EmployeeLeaveTypeDAO> getAllEmployeeLeaveType() {
        logger.info("-----------------inside get all method for all employee leave type controller ");
        List<EmployeeLeaveTypeDAO> listOfEmployeeLeaveData = null;
        try {
            HibernateUtil util = new HibernateUtil();
            SessionFactory sessionFactory =  util.getSessionFactory("hrTest");
            System.out.println("session factory : " + sessionFactory.toString());
            Session session = sessionFactory.openSession();
            System.out.println(" session acquired : " + session.toString());
            listOfEmployeeLeaveData = employeeLeaveTypeDAO.getAllEmployeesLeaveType(session);
            System.out.println(" list of cust : " + listOfEmployeeLeaveData.size());
            session.close();
            sessionFactory.close();
        } catch (Exception ex) {
            System.out.println("exception");
            ex.printStackTrace();
        }
        return listOfEmployeeLeaveData;
    }

    @RequestMapping(value ="/getEmployeeLeaveTypeFromEmployeeCode/employeeCode={employeeCode}",
            method = RequestMethod.GET)
    @ResponseBody
    public List<EmployeeLeaveTypeData> getEmployeeLeaveTypeFromEmployeeCode(@PathVariable("employeeCode")
                                                                       String employeeCode) {
        logger.info("---> inside getEmployeeLeaveTypeFromEmployeeCode controller method");
        List<EmployeeLeaveTypeData> tblEmployeeLeaveDataList = new ArrayList<EmployeeLeaveTypeData>();
        try {
            HibernateUtil util = new HibernateUtil();
            SessionFactory sessionFactory = util.getSessionFactory("hrTest");
            Session session = sessionFactory.openSession();
            tblEmployeeLeaveDataList =
                    (List<EmployeeLeaveTypeData>) employeeLeaveTypeDAO.getEmployeeLeaveDataByEmployeeCode(session, employeeCode);
            session.close();
            sessionFactory.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return tblEmployeeLeaveDataList;
    }



}
