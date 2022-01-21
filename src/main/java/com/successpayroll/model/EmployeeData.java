package com.successpayroll.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity(name = "EmployeeData")
@Table(name = "tblEmployee")
public class EmployeeData {
    @Id
    @Column(name = "KeyID", nullable = false)
    private Integer id;

    @Column(name = "EmployeeCode", nullable = false)
    private String employeeCode;

    @Column(name = "DateEntry", nullable = false)
    private Timestamp dateEntry;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "NameChinese", nullable = false)
    private String nameChinese;

    @Column(name = "Address1", nullable = false)
    private String address1;

    @Column(name = "Address2", nullable = false)
    private String address2;

    @Column(name = "Address3", nullable = false)
    private String address3;

    @Column(name = "Address4", nullable = false)
    private String address4;

    @Column(name = "PostCode", nullable = false)
    private String postCode;

    @Column(name = "ICNo", nullable = false)
    private String icno;

    @Column(name = "ICColour", nullable = false)
    private String iccolour;

    @Column(name = "PlaceOfIssue", nullable = false)
    private String placeOfIssue;

    @Column(name = "DateOfIssue", nullable = false)
    private Timestamp DateOfIssue;

    @Column(name = "PassportNo", nullable = false)
    private String passportNo;

    @Column(name = "PassportExpiryDate", nullable = false)
    private Timestamp passportExpiryDate;

    @Column(name = "PRStatus", nullable = false)
    private String prStatus;

    @Column(name = "PRDateIssue", nullable = false)
    private Timestamp prDateIssue;

    @Column(name = "BirthDay", nullable = false)
    private Timestamp birthDay;

    @Column(name = "PlaceOfBirth", nullable = false)
    private String placeOfBirth;

    @Column(name = "Nationality", nullable = false)
    private String nationality;

    @Column(name = "MBFAmount", nullable = false)
    private Double mbfAmount;

    @Column(name = "Race", nullable = false)
    private String race;

    @Column(name = "MaritalStatus", nullable = false)
    private String maritalStatus;

    @Column(name = "Sex", nullable = false)
    private String sex;

    @Column(name = "Religion", nullable = false)
    private String religion;

    @Column(name = "NSStatus", nullable = false)
    private String nsStatus;

    @Column(name = "NSDateCompleted", nullable = false)
    private Timestamp nsDateCompleted;

    @Column(name = "Handphone", nullable = false)
    private String handPhone;

    @Column(name = "Pager", nullable = false)
    private String pager;

    @Column(name = "Email", nullable = false)
    private String email;

    @Column(name = "Education", nullable = false)
    private String education;

    @Column(name = "SchoolHistory", nullable = false)
    private String schoolHistory;

    @Column(name = "EmploymentHistory", nullable = false)
    private String employmentHistory;

    @Column(name = "Weight", nullable = false)
    private Double weight;

    @Column(name = "Height", nullable = false)
    private Double height;

    @Column(name = "HireDate", nullable = false)
    private Timestamp HireDate;

    @Column(name = "ConfirmDate", nullable = false)
    private Timestamp confirmDate;

    @Column(name = "Probation", nullable = false)
    private Float probation;

    @Column(name = "TerminationStatus", nullable = false)
    private String terminationStatus;

    @Column(name = "ByMonth", nullable = false)
    private Boolean byMonth;

    @Column(name = "NoitcePeriod", nullable = false)
    private Float noitcePeriod;

    @Column(name = "NoticeDate", nullable = false)
    private Timestamp noticeDate;

    @Column(name = "TerminationDate", nullable = false)
    private Timestamp terminationDate;

    @Column(name = "IMSPermitPassNo", nullable = false)
    private String imsPermitPassNo;

    @Column(name = "IMSIssueDate", nullable = false)
    private Timestamp imsIssueDate;

    @Column(name = "IMSExpiryDate", nullable = false)
    private Timestamp imsExpiryDate;

    @Column(name = "IMSAppealDate", nullable = false)
    private Timestamp imsAppealDate;

    @Column(name = "CPFAccNo", nullable = false)
    private String cpfAccNo;

    @Column(name = "BankCode", nullable = false)
    private String bankCode;

    @Column(name = "BankAccountCode", nullable = false)
    private String bankAccountCode;

    @Column(name = "IncomeTaxNo", nullable = false)
    private String incomeTaxNo;

    @Column(name = "Remarks", nullable = false)
    private String remarks;

    @Column(name = "Active", nullable = false)
    private Boolean active;

    @Column(name = "Branch", nullable = false)
    private String branch;

    @Column(name = "Department", nullable = false)
    private String department;

    @Column(name = "SectionCode", nullable = false)
    private String sectionCode;

    @Column(name = "Line", nullable = false)
    private String line;

    @Column(name = "Occupation", nullable = false)
    private String occupation;

    @Column(name = "Category", nullable = false)
    private String category;

    @Column(name = "Supervisor", nullable = false)
    private String supervisor;

    @Column(name = "WorkCalendar", nullable = false)
    private String workCalendar;

    @Column(name = "WorkingTimeSchedule", nullable = false)
    private String workingTimeSchedule;

    @Column(name = "HrsPerDay", nullable = false)
    private Float hrsPerDay;

    @Column(name = "PayType", nullable = false)
    private String payType;

    @Column(name = "PayFreq", nullable = false)
    private String payFreq;

    @Column(name = "HourlyRate", nullable = false)
    private Double hourlyRate;

    @Column(name = "DailyRate", nullable = false)
    private Double dailyRate;

    @Column(name = "MonthlyRate", nullable = false)
    private Double monthlyRate;

    @Column(name = "BonusFactor", nullable = false)
    private Float bonusFactor;

    @Column(name = "Fund1", nullable = false)
    private String fund1;

    @Column(name = "Fund2", nullable = false)
    private String fund2;

    @Column(name = "Fund3", nullable = false)
    private String fund3;

    @Column(name = "NPLCalc", nullable = false)
    private String nplCalc;

    @Column(name = "CPF", nullable = false)
    private String cpf;

    @Column(name = "FWL", nullable = false)
    private String fwl;

    @Column(name = "OT", nullable = false)
    private Boolean ot;

    @Column(name = "OTRate1", nullable = false)
    private Float otRate1;

    @Column(name = "OTRate2", nullable = false)
    private Float otRate2;

    @Column(name = "OTRate3", nullable = false)
    private Float otRate3;

    @Column(name = "AdjSalary", nullable = false)
    private Double adjSalary;

    @Column(name = "AdjBonus", nullable = false)
    private Double adjBonus;

    @Column(name = "AdjCPF", nullable = false)
    private Double adjCPF;

    @Column(name = "ReviewedBy", nullable = false)
    private String reviewedBy;

    @Column(name = "Notify1", nullable = false)
    private String notify1;

    @Column(name = "Notify2", nullable = false)
    private String notify2;

    @Column(name = "ApprovedBy", nullable = false)
    private String approvedBy;

    @Column(name = "Supervisor2", nullable = false)
    private String supervisor2;

    @Column(name = "EmployeeCodeThumb", nullable = false)
    private String employeeCodeThumb;

    @Column(name = "AddressType", nullable = false)
    private String addressType;

    @Column(name = "DOBChild", nullable = false)
    private Timestamp DOBChild;

    @Column(name = "Payee", nullable = false)
    private String Payee;

    @Column(name = "ACode", nullable = false)
    private String ACode;

    @Column(name = "DateModify", nullable = false)
    private Timestamp dateModify;

    @Column(name = "UserId", nullable = false)
    private String userId;

    @Column(name = "UserIdEntry", nullable = false)
    private String userIdEntry;

    @Column(name = "BldName", nullable = false)
    private String bldName;

    @Column(name = "ICPlaceOfIssue", nullable = false)
    private String icPlaceOfIssue;

    @Column(name = "ICDateOfIssue", nullable = false)
    private Timestamp icDateOfIssue;

    @Column(name = "AltTel1", nullable = false)
    private String altTel1;

    @Column(name = "AltTel2", nullable = false)
    private String altTel2;

    @Column(name = "EmployerTaxBornAmt", nullable = false)
    private Double employerTaxBornAmt;

    public EmployeeData(){}

    public EmployeeData(String employeeCode, Timestamp dateEntry, String name, String nameChinese, String address1, String address2, String address3, String address4, String postCode, String icno, String iccolour, String placeOfIssue, Timestamp dateOfIssue, String passportNo, Timestamp passportExpiryDate, String prStatus, Timestamp prDateIssue, Timestamp birthDay, String placeOfBirth, String nationality, Double mbfAmount, String race, String maritalStatus, String sex, String religion, String nsStatus, Timestamp nsDateCompleted, String handPhone, String pager, String email, String education, String schoolHistory, String employmentHistory, Double weight, Double height, Timestamp hireDate, Timestamp confirmDate, Float probation, String terminationStatus, Boolean byMonth, Float noitcePeriod, Timestamp noticeDate, Timestamp terminationDate, String imsPermitPassNo, Timestamp imsIssueDate, Timestamp imsExpiryDate, Timestamp imsAppealDate, String cpfAccNo, String bankCode, String bankAccountCode, String incomeTaxNo, String remarks, Boolean active, String branch, String department, String sectionCode, String line, String occupation, String category, String supervisor, String workCalendar, String workingTimeSchedule, Float hrsPerDay, String payType, String payFreq, Double hourlyRate, Double dailyRate, Double monthlyRate, Float bonusFactor, String fund1, String fund2, String fund3, String nplCalc, String cpf, String fwl, Boolean ot, Float otRate1, Float otRate2, Float otRate3, Double adjSalary, Double adjBonus, Double adjCPF, String reviewedBy, String notify1, String notify2, String approvedBy, String supervisor2, String employeeCodeThumb, String addressType, Timestamp DOBChild, String payee, String ACode, Timestamp dateModify, String userId, String userIdEntry, String bldName, String icPlaceOfIssue, Timestamp icDateOfIssue, String altTel1, String altTel2, Double employerTaxBornAmt) {
        this.employeeCode = employeeCode;
        this.dateEntry = dateEntry;
        this.name = name;
        this.nameChinese = nameChinese;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.address4 = address4;
        this.postCode = postCode;
        this.icno = icno;
        this.iccolour = iccolour;
        this.placeOfIssue = placeOfIssue;
        DateOfIssue = dateOfIssue;
        this.passportNo = passportNo;
        this.passportExpiryDate = passportExpiryDate;
        this.prStatus = prStatus;
        this.prDateIssue = prDateIssue;
        this.birthDay = birthDay;
        this.placeOfBirth = placeOfBirth;
        this.nationality = nationality;
        this.mbfAmount = mbfAmount;
        this.race = race;
        this.maritalStatus = maritalStatus;
        this.sex = sex;
        this.religion = religion;
        this.nsStatus = nsStatus;
        this.nsDateCompleted = nsDateCompleted;
        this.handPhone = handPhone;
        this.pager = pager;
        this.email = email;
        this.education = education;
        this.schoolHistory = schoolHistory;
        this.employmentHistory = employmentHistory;
        this.weight = weight;
        this.height = height;
        HireDate = hireDate;
        this.confirmDate = confirmDate;
        this.probation = probation;
        this.terminationStatus = terminationStatus;
        this.byMonth = byMonth;
        this.noitcePeriod = noitcePeriod;
        this.noticeDate = noticeDate;
        this.terminationDate = terminationDate;
        this.imsPermitPassNo = imsPermitPassNo;
        this.imsIssueDate = imsIssueDate;
        this.imsExpiryDate = imsExpiryDate;
        this.imsAppealDate = imsAppealDate;
        this.cpfAccNo = cpfAccNo;
        this.bankCode = bankCode;
        this.bankAccountCode = bankAccountCode;
        this.incomeTaxNo = incomeTaxNo;
        this.remarks = remarks;
        this.active = active;
        this.branch = branch;
        this.department = department;
        this.sectionCode = sectionCode;
        this.line = line;
        this.occupation = occupation;
        this.category = category;
        this.supervisor = supervisor;
        this.workCalendar = workCalendar;
        this.workingTimeSchedule = workingTimeSchedule;
        this.hrsPerDay = hrsPerDay;
        this.payType = payType;
        this.payFreq = payFreq;
        this.hourlyRate = hourlyRate;
        this.dailyRate = dailyRate;
        this.monthlyRate = monthlyRate;
        this.bonusFactor = bonusFactor;
        this.fund1 = fund1;
        this.fund2 = fund2;
        this.fund3 = fund3;
        this.nplCalc = nplCalc;
        this.cpf = cpf;
        this.fwl = fwl;
        this.ot = ot;
        this.otRate1 = otRate1;
        this.otRate2 = otRate2;
        this.otRate3 = otRate3;
        this.adjSalary = adjSalary;
        this.adjBonus = adjBonus;
        this.adjCPF = adjCPF;
        this.reviewedBy = reviewedBy;
        this.notify1 = notify1;
        this.notify2 = notify2;
        this.approvedBy = approvedBy;
        this.supervisor2 = supervisor2;
        this.employeeCodeThumb = employeeCodeThumb;
        this.addressType = addressType;
        this.DOBChild = DOBChild;
        Payee = payee;
        this.ACode = ACode;
        this.dateModify = dateModify;
        this.userId = userId;
        this.userIdEntry = userIdEntry;
        this.bldName = bldName;
        this.icPlaceOfIssue = icPlaceOfIssue;
        this.icDateOfIssue = icDateOfIssue;
        this.altTel1 = altTel1;
        this.altTel2 = altTel2;
        this.employerTaxBornAmt = employerTaxBornAmt;
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

    public Timestamp getDateEntry() {
        return dateEntry;
    }

    public void setDateEntry(Timestamp dateEntry) {
        this.dateEntry = dateEntry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameChinese() {
        return nameChinese;
    }

    public void setNameChinese(String nameChinese) {
        this.nameChinese = nameChinese;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getIcno() {
        return icno;
    }

    public void setIcno(String icno) {
        this.icno = icno;
    }

    public String getIccolour() {
        return iccolour;
    }

    public void setIccolour(String iccolour) {
        this.iccolour = iccolour;
    }

    public String getPlaceOfIssue() {
        return placeOfIssue;
    }

    public void setPlaceOfIssue(String placeOfIssue) {
        this.placeOfIssue = placeOfIssue;
    }

    public Timestamp getDateOfIssue() {
        return DateOfIssue;
    }

    public void setDateOfIssue(Timestamp dateOfIssue) {
        DateOfIssue = dateOfIssue;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public Timestamp getPassportExpiryDate() {
        return passportExpiryDate;
    }

    public void setPassportExpiryDate(Timestamp passportExpiryDate) {
        this.passportExpiryDate = passportExpiryDate;
    }

    public String getPrStatus() {
        return prStatus;
    }

    public void setPrStatus(String prStatus) {
        this.prStatus = prStatus;
    }

    public Timestamp getPrDateIssue() {
        return prDateIssue;
    }

    public void setPrDateIssue(Timestamp prDateIssue) {
        this.prDateIssue = prDateIssue;
    }

    public Timestamp getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Timestamp birthDay) {
        this.birthDay = birthDay;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Double getMbfAmount() {
        return mbfAmount;
    }

    public void setMbfAmount(Double mbfAmount) {
        this.mbfAmount = mbfAmount;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getNsStatus() {
        return nsStatus;
    }

    public void setNsStatus(String nsStatus) {
        this.nsStatus = nsStatus;
    }

    public Timestamp getNsDateCompleted() {
        return nsDateCompleted;
    }

    public void setNsDateCompleted(Timestamp nsDateCompleted) {
        this.nsDateCompleted = nsDateCompleted;
    }

    public String getHandPhone() {
        return handPhone;
    }

    public void setHandPhone(String handPhone) {
        this.handPhone = handPhone;
    }

    public String getPager() {
        return pager;
    }

    public void setPager(String pager) {
        this.pager = pager;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSchoolHistory() {
        return schoolHistory;
    }

    public void setSchoolHistory(String schoolHistory) {
        this.schoolHistory = schoolHistory;
    }

    public String getEmploymentHistory() {
        return employmentHistory;
    }

    public void setEmploymentHistory(String employmentHistory) {
        this.employmentHistory = employmentHistory;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Timestamp getHireDate() {
        return HireDate;
    }

    public void setHireDate(Timestamp hireDate) {
        HireDate = hireDate;
    }

    public Timestamp getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Timestamp confirmDate) {
        this.confirmDate = confirmDate;
    }

    public Float getProbation() {
        return probation;
    }

    public void setProbation(Float probation) {
        this.probation = probation;
    }

    public String getTerminationStatus() {
        return terminationStatus;
    }

    public void setTerminationStatus(String terminationStatus) {
        this.terminationStatus = terminationStatus;
    }

    public Boolean getByMonth() {
        return byMonth;
    }

    public void setByMonth(Boolean byMonth) {
        this.byMonth = byMonth;
    }

    public Float getNoitcePeriod() {
        return noitcePeriod;
    }

    public void setNoitcePeriod(Float noitcePeriod) {
        this.noitcePeriod = noitcePeriod;
    }

    public Timestamp getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Timestamp noticeDate) {
        this.noticeDate = noticeDate;
    }

    public Timestamp getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(Timestamp terminationDate) {
        this.terminationDate = terminationDate;
    }

    public String getImsPermitPassNo() {
        return imsPermitPassNo;
    }

    public void setImsPermitPassNo(String imsPermitPassNo) {
        this.imsPermitPassNo = imsPermitPassNo;
    }

    public Timestamp getImsIssueDate() {
        return imsIssueDate;
    }

    public void setImsIssueDate(Timestamp imsIssueDate) {
        this.imsIssueDate = imsIssueDate;
    }

    public Timestamp getImsExpiryDate() {
        return imsExpiryDate;
    }

    public void setImsExpiryDate(Timestamp imsExpiryDate) {
        this.imsExpiryDate = imsExpiryDate;
    }

    public Timestamp getImsAppealDate() {
        return imsAppealDate;
    }

    public void setImsAppealDate(Timestamp imsAppealDate) {
        this.imsAppealDate = imsAppealDate;
    }

    public String getCpfAccNo() {
        return cpfAccNo;
    }

    public void setCpfAccNo(String cpfAccNo) {
        this.cpfAccNo = cpfAccNo;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankAccountCode() {
        return bankAccountCode;
    }

    public void setBankAccountCode(String bankAccountCode) {
        this.bankAccountCode = bankAccountCode;
    }

    public String getIncomeTaxNo() {
        return incomeTaxNo;
    }

    public void setIncomeTaxNo(String incomeTaxNo) {
        this.incomeTaxNo = incomeTaxNo;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSectionCode() {
        return sectionCode;
    }

    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getWorkCalendar() {
        return workCalendar;
    }

    public void setWorkCalendar(String workCalendar) {
        this.workCalendar = workCalendar;
    }

    public String getWorkingTimeSchedule() {
        return workingTimeSchedule;
    }

    public void setWorkingTimeSchedule(String workingTimeSchedule) {
        this.workingTimeSchedule = workingTimeSchedule;
    }

    public Float getHrsPerDay() {
        return hrsPerDay;
    }

    public void setHrsPerDay(Float hrsPerDay) {
        this.hrsPerDay = hrsPerDay;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayFreq() {
        return payFreq;
    }

    public void setPayFreq(String payFreq) {
        this.payFreq = payFreq;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(Double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public Double getMonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(Double monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    public Float getBonusFactor() {
        return bonusFactor;
    }

    public void setBonusFactor(Float bonusFactor) {
        this.bonusFactor = bonusFactor;
    }

    public String getFund1() {
        return fund1;
    }

    public void setFund1(String fund1) {
        this.fund1 = fund1;
    }

    public String getFund2() {
        return fund2;
    }

    public void setFund2(String fund2) {
        this.fund2 = fund2;
    }

    public String getFund3() {
        return fund3;
    }

    public void setFund3(String fund3) {
        this.fund3 = fund3;
    }

    public String getNplCalc() {
        return nplCalc;
    }

    public void setNplCalc(String nplCalc) {
        this.nplCalc = nplCalc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFwl() {
        return fwl;
    }

    public void setFwl(String fwl) {
        this.fwl = fwl;
    }

    public Boolean getOt() {
        return ot;
    }

    public void setOt(Boolean ot) {
        this.ot = ot;
    }

    public Float getOtRate1() {
        return otRate1;
    }

    public void setOtRate1(Float otRate1) {
        this.otRate1 = otRate1;
    }

    public Float getOtRate2() {
        return otRate2;
    }

    public void setOtRate2(Float otRate2) {
        this.otRate2 = otRate2;
    }

    public Float getOtRate3() {
        return otRate3;
    }

    public void setOtRate3(Float otRate3) {
        this.otRate3 = otRate3;
    }

    public Double getAdjSalary() {
        return adjSalary;
    }

    public void setAdjSalary(Double adjSalary) {
        this.adjSalary = adjSalary;
    }

    public Double getAdjBonus() {
        return adjBonus;
    }

    public void setAdjBonus(Double adjBonus) {
        this.adjBonus = adjBonus;
    }

    public Double getAdjCPF() {
        return adjCPF;
    }

    public void setAdjCPF(Double adjCPF) {
        this.adjCPF = adjCPF;
    }

    public String getReviewedBy() {
        return reviewedBy;
    }

    public void setReviewedBy(String reviewedBy) {
        this.reviewedBy = reviewedBy;
    }

    public String getNotify1() {
        return notify1;
    }

    public void setNotify1(String notify1) {
        this.notify1 = notify1;
    }

    public String getNotify2() {
        return notify2;
    }

    public void setNotify2(String notify2) {
        this.notify2 = notify2;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public String getSupervisor2() {
        return supervisor2;
    }

    public void setSupervisor2(String supervisor2) {
        this.supervisor2 = supervisor2;
    }

    public String getEmployeeCodeThumb() {
        return employeeCodeThumb;
    }

    public void setEmployeeCodeThumb(String employeeCodeThumb) {
        this.employeeCodeThumb = employeeCodeThumb;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public Timestamp getDOBChild() {
        return DOBChild;
    }

    public void setDOBChild(Timestamp DOBChild) {
        this.DOBChild = DOBChild;
    }

    public String getPayee() {
        return Payee;
    }

    public void setPayee(String payee) {
        Payee = payee;
    }

    public String getACode() {
        return ACode;
    }

    public void setACode(String ACode) {
        this.ACode = ACode;
    }

    public Timestamp getDateModify() {
        return dateModify;
    }

    public void setDateModify(Timestamp dateModify) {
        this.dateModify = dateModify;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserIdEntry() {
        return userIdEntry;
    }

    public void setUserIdEntry(String userIdEntry) {
        this.userIdEntry = userIdEntry;
    }

    public String getBldName() {
        return bldName;
    }

    public void setBldName(String bldName) {
        this.bldName = bldName;
    }

    public String getIcPlaceOfIssue() {
        return icPlaceOfIssue;
    }

    public void setIcPlaceOfIssue(String icPlaceOfIssue) {
        this.icPlaceOfIssue = icPlaceOfIssue;
    }

    public Timestamp getIcDateOfIssue() {
        return icDateOfIssue;
    }

    public void setIcDateOfIssue(Timestamp icDateOfIssue) {
        this.icDateOfIssue = icDateOfIssue;
    }

    public String getAltTel1() {
        return altTel1;
    }

    public void setAltTel1(String altTel1) {
        this.altTel1 = altTel1;
    }

    public String getAltTel2() {
        return altTel2;
    }

    public void setAltTel2(String altTel2) {
        this.altTel2 = altTel2;
    }

    public Double getEmployerTaxBornAmt() {
        return employerTaxBornAmt;
    }

    public void setEmployerTaxBornAmt(Double employerTaxBornAmt) {
        this.employerTaxBornAmt = employerTaxBornAmt;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "id=" + id +
                " employeeCode='" + employeeCode + '\'' +
                ", dateEntry=" + dateEntry +
                ", name='" + name + '\'' +
                ", nameChinese='" + nameChinese + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", address3='" + address3 + '\'' +
                ", address4='" + address4 + '\'' +
                ", postCode='" + postCode + '\'' +
                ", icno='" + icno + '\'' +
                ", iccolour='" + iccolour + '\'' +
                ", placeOfIssue='" + placeOfIssue + '\'' +
                ", DateOfIssue=" + DateOfIssue +
                ", passportNo='" + passportNo + '\'' +
                ", passportExpiryDate=" + passportExpiryDate +
                ", prStatus='" + prStatus + '\'' +
                ", prDateIssue=" + prDateIssue +
                ", birthDay=" + birthDay +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", nationality='" + nationality + '\'' +
                ", mbfAmount=" + mbfAmount +
                ", race='" + race + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", sex='" + sex + '\'' +
                ", religion='" + religion + '\'' +
                ", nsStatus='" + nsStatus + '\'' +
                ", nsDateCompleted=" + nsDateCompleted +
                ", handPhone='" + handPhone + '\'' +
                ", pager='" + pager + '\'' +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", schoolHistory='" + schoolHistory + '\'' +
                ", employmentHistory='" + employmentHistory + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", HireDate=" + HireDate +
                ", confirmDate=" + confirmDate +
                ", probation=" + probation +
                ", terminationStatus='" + terminationStatus + '\'' +
                ", byMonth=" + byMonth +
                ", noitcePeriod=" + noitcePeriod +
                ", noticeDate=" + noticeDate +
                ", terminationDate=" + terminationDate +
                ", imsPermitPassNo='" + imsPermitPassNo + '\'' +
                ", imsIssueDate=" + imsIssueDate +
                ", imsExpiryDate=" + imsExpiryDate +
                ", imsAppealDate=" + imsAppealDate +
                ", cpfAccNo='" + cpfAccNo + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", bankAccountCode='" + bankAccountCode + '\'' +
                ", incomeTaxNo='" + incomeTaxNo + '\'' +
                ", remarks='" + remarks + '\'' +
                ", active=" + active +
                ", branch='" + branch + '\'' +
                ", department='" + department + '\'' +
                ", sectionCode='" + sectionCode + '\'' +
                ", line='" + line + '\'' +
                ", occupation='" + occupation + '\'' +
                ", category='" + category + '\'' +
                ", supervisor='" + supervisor + '\'' +
                ", workCalendar='" + workCalendar + '\'' +
                ", workingTimeSchedule='" + workingTimeSchedule + '\'' +
                ", hrsPerDay=" + hrsPerDay +
                ", payType='" + payType + '\'' +
                ", payFreq='" + payFreq + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", dailyRate=" + dailyRate +
                ", monthlyRate=" + monthlyRate +
                ", bonusFactor=" + bonusFactor +
                ", fund1='" + fund1 + '\'' +
                ", fund2='" + fund2 + '\'' +
                ", fund3='" + fund3 + '\'' +
                ", nplCalc='" + nplCalc + '\'' +
                ", cpf='" + cpf + '\'' +
                ", fwl='" + fwl + '\'' +
                ", ot=" + ot +
                ", otRate1=" + otRate1 +
                ", otRate2=" + otRate2 +
                ", otRate3=" + otRate3 +
                ", adjSalary=" + adjSalary +
                ", adjBonus=" + adjBonus +
                ", adjCPF=" + adjCPF +
                ", reviewedBy='" + reviewedBy + '\'' +
                ", notify1='" + notify1 + '\'' +
                ", notify2='" + notify2 + '\'' +
                ", approvedBy='" + approvedBy + '\'' +
                ", supervisor2='" + supervisor2 + '\'' +
                ", employeeCodeThumb='" + employeeCodeThumb + '\'' +
                ", addressType='" + addressType + '\'' +
                ", DOBChild=" + DOBChild +
                ", Payee='" + Payee + '\'' +
                ", ACode='" + ACode + '\'' +
                ", dateModify=" + dateModify +
                ", userId='" + userId + '\'' +
                ", userIdEntry='" + userIdEntry + '\'' +
                ", bldName='" + bldName + '\'' +
                ", icPlaceOfIssue='" + icPlaceOfIssue + '\'' +
                ", icDateOfIssue=" + icDateOfIssue +
                ", altTel1='" + altTel1 + '\'' +
                ", altTel2='" + altTel2 + '\'' +
                ", employerTaxBornAmt=" + employerTaxBornAmt +
                '}';
    }
}