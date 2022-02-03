package com.successpayroll.util;

import com.successpayroll.DAO.EmployeeDAO;
import com.successpayroll.model.*;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
public class HibernateUtil {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EmployeeDAO customerDAO;

    @Autowired
    private Environment env;

    //public static final String DB_URL = "spring.db.url";
    public static final String DB_URL = "spring.datasource.url";
    //public static final String DB_USER = "spring.db.user";
    public static final String DB_USER = "spring.datasource.username";
    //public static final String DB_PASSWORD = "spring.db.password";
    public static final String DB_PASSWORD = "spring.datasource.password";
    String result = "";
    InputStream inputStream;

    /* It gets the DB details from the properties file and also links the sql driver to the configuration */
    public SessionFactory getSessionFactory(String databaseName) throws IOException {

        Properties prop = getPropValues();
        Configuration config = new Configuration();
        config.setProperty("hibernate.connection.driver_class", "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        if(databaseName.equals("hrTest"))
        {
            System.out.println("===========> hrTest passed ");
            config.setProperty("hibernate.connection.url", prop.getProperty(DB_URL));
            config.setProperty("hibernate.connection.username", prop.getProperty(DB_USER));
            config.setProperty("hibernate.connection.password", prop.getProperty(DB_PASSWORD));
            config.addAnnotatedClass(EmployeeData.class);
            config.addAnnotatedClass(EmployeeLeaveTypeData.class);
        } else {
            return null;
        }

        SessionFactory sessionFactory = config.buildSessionFactory();
        return sessionFactory;
    }

    public Properties getPropValues() throws IOException {
        Properties prop = new Properties();
        try {
            String propFileName = "application.properties";
            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            if(inputStream!=null)
                inputStream.close();
        }
        return prop;
    }

    public static List<Class<?>> getEntityClassesFromPackage(String packageName) throws ClassNotFoundException, IOException, URISyntaxException {
        List<String> classNames = getClassNamesFromPackage(packageName);
        List<Class<?>> classes = new ArrayList<Class<?>>();
        for (String className : classNames) {
            Class<?> cls = Class.forName(packageName + "." + className);
            Annotation[] annotations = cls.getAnnotations();

            for (Annotation annotation : annotations) {
                System.out.println(cls.getCanonicalName() + ": " + annotation.toString());
                if (annotation instanceof javax.persistence.Entity) {
                    classes.add(cls);
                }
            }
        }

        return classes;
    }


    public static ArrayList<String> getClassNamesFromPackage(String packageName) throws IOException, URISyntaxException, ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        ArrayList<String> names = new ArrayList<String>();

        packageName = packageName.replace(".", "/");
        URL packageURL = classLoader.getResource(packageName);

        URI uri = new URI(packageURL.toString());
        File folder = new File(uri.getPath());
        File[] files = folder.listFiles();
        for (File file: files) {
            String name = file.getName();
            name = name.substring(0, name.lastIndexOf('.'));  // remove ".class"
            names.add(name);
        }

        return names;
    }
}
