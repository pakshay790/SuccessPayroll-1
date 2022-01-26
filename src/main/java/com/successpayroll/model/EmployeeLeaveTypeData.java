package com.successpayroll.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "EmployeeLeaveTypeData")
@Table(name = "tblEmployeeLeaveType")
public class EmployeeLeaveTypeData {
    @Id
    @Column(name = "KeyID", nullable = false)
    private Integer id;

    @Column(name = "EmployeeCode", nullable = true)
    private String employeeCode;

    @Column(name = "LeaveType", nullable = true)
    private String leaveType;

    @Column(name = "DaysEntitle", nullable = true)
    private Double daysEntitle;

    public EmployeeLeaveTypeData() {}

    public EmployeeLeaveTypeData(String employeeCode, String leaveType, Double daysEntitle) {
        this.employeeCode = employeeCode;
        this.leaveType = leaveType;
        this.daysEntitle = daysEntitle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public Double getDaysEntitle() {
        return daysEntitle;
    }

    public void setDaysEntitle(Double daysEntitle) {
        this.daysEntitle = daysEntitle;
    }

    @Override
    public String toString() {
        return "EmployeeLeaveTypeData{" +
                "id=" + id +
                ", employeeCode='" + employeeCode + '\'' +
                ", leaveType='" + leaveType + '\'' +
                ", daysEntitle=" + daysEntitle +
                '}';
    }
}
