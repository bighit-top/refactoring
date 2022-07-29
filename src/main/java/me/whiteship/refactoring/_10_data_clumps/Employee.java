package me.whiteship.refactoring._10_data_clumps;

public class Employee {

    private String name;

//    private String personalAreaCode;
//
//    private String personalNumber;

    private TelephoneNumber personalPhoneNumber; //

//    public Employee(String name, String personalAreaCode, String personalNumber) {
//        this.name = name;
//        this.personalAreaCode = personalAreaCode;
//        this.personalNumber = personalNumber;
//    }

    public Employee(String name, TelephoneNumber personalPhoneNumber) {
        this.name = name;
        this.personalPhoneNumber = personalPhoneNumber;
    }

    public String personalPhoneNumber() {
//        return personalAreaCode + "-" + personalNumber;
        return this.personalPhoneNumber.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getPersonalAreaCode() {
//        return personalAreaCode;
//    }
//
//    public void setPersonalAreaCode(String personalAreaCode) {
//        this.personalAreaCode = personalAreaCode;
//    }
//
//    public String getPersonalNumber() {
//        return personalNumber;
//    }
//
//    public void setPersonalNumber(String personalNumber) {
//        this.personalNumber = personalNumber;
//    }

    public TelephoneNumber getPersonalPhoneNumber() {
        return personalPhoneNumber;
    }
}
