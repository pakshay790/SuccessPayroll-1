package com.successpayroll.controller;

import java.util.List;

import com.successpayroll.DAO.EmployeeDAO;
import com.successpayroll.model.EmployeeData;
import com.successpayroll.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private Logger logger = LogManager.getLogger(this.getClass());

    @Autowired
    EmployeeDAO employeeDAO;

    /*@Autowired
    FetchCustomerDetailsUsingTraderCodeApiService fetchCustomerDetailsUsingTraderCodeApiService;*/

    @RequestMapping("/get")
    @ResponseBody
    public String getString() {
        System.out.println(" inside getAll method");
        logger.info("-----------------inside get all method for customer controller ------------------");
        return "Hello World!";
    }
    @RequestMapping("/getAll")
    @ResponseBody
    public List<EmployeeData> getAll() {
        logger.info("-----------------inside get all method for customer controller ");
        List<EmployeeData> listOfEmployeeData = null;
        try {
            HibernateUtil util = new HibernateUtil();
            SessionFactory sessionFactory =  util.getSessionFactory("hrTest");
            System.out.println("session factory : " + sessionFactory.toString());
            Session session = sessionFactory.openSession();
            System.out.println(" session acquired : " + session.toString());
            listOfEmployeeData = employeeDAO.getAllEmployees(session);
            System.out.println(" list of cust : " + listOfEmployeeData.size());
            session.close();
            sessionFactory.close();
        } catch (Exception ex) {
            System.out.println("exception");
            ex.printStackTrace();
        }
        return listOfEmployeeData;
    }

    /*@RequestMapping(value = "/getTenCustomerList", method = RequestMethod.GET)
    @ResponseBody
    public List<CustomerData> getByCustomerListTen() {
        List<CustomerData> cus = null;
        try {
            HibernateUtil util = new HibernateUtil();
            SessionFactory sessionFactory =  util.getSessionFactory("MotorwayS");
            Session session = sessionFactory.openSession();
            cus = customerDAO.getTenCustomer(session);
            session.close();
            sessionFactory.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cus;
    }

  @RequestMapping(value =
  "/getCustomerDetailsFromTraderCode/traderCode={traderCode}", method =
  RequestMethod.GET)

  @ResponseBody public CustomerOutput
  getCustomerDetailsFromTraderCode(@PathVariable("traderCode") String
  traderCode) {
  logger.info("---> inside getCustomerDetailsFromTraderCode controller method"
  ); CustomerData tblCustomerDataData = null; CustomerOutput customerOutput =
  new CustomerOutput(); try { HibernateUtil util = new HibernateUtil();
  SessionFactory sessionFactory =
  util.getSessionFactoryForInventory("MotorwayS"); Session session =
  sessionFactory.openSession(); tblCustomerDataData =
  customerDAO.getVehicleOwnerByTraderCode(session, traderCode);
  if(tblCustomerDataData !=null) { customerOutput =
  fetchCustomerDetailsUsingTraderCodeApiService.fetchData(tblCustomerDataData,
  traderCode); }

  session.close(); sessionFactory.close(); } catch (Exception ex) {
  ex.printStackTrace(); } return customerOutput; }

    @RequestMapping(value = "/getCustomerDetailsFromTraderCode/traderCode={traderCode}", method = RequestMethod.GET)
    @ResponseBody
    public CustomerOutput getCustomerDetailsFromTraderCode(@PathVariable("traderCode") String traderCode) {
        logger.info("---> inside getCustomerDetailsFromTraderCode controller method");
        CustomerData tblCustomerDataData = null;
        CustomerOutput customerOutput = new CustomerOutput();
        try {
            HibernateUtil util = new HibernateUtil();
            SessionFactory sessionFactory =  util.getSessionFactoryForInventory("platformDBWS");
            Session session = sessionFactory.openSession();
            tblCustomerDataData = customerDAO.getVehicleOwnerByTraderCode(session, traderCode);
            if(tblCustomerDataData !=null) {
                //customerOutput = fetchCustomerDetailsUsingTraderCodeApiService.fetchData(tblCustomerDataData, traderCode, session);
            }
            session.close();
            sessionFactory.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return customerOutput;
    }*/

}
