package me.whiteship.refactoring._07_divergent_change._26_extract_class;

public class Person {

//    private String officeAreaCode;
//    private String officeNumber;
//
//    public String telephoneNumber() {
//        return this.officeAreaCode + " " + this.officeNumber;
//    }
//
//    public String officeAreaCode() {
//        return officeAreaCode;
//    }
//
//    public void setOfficeAreaCode(String officeAreaCode) {
//        this.officeAreaCode = officeAreaCode;
//    }
//
//    public String officeNumber() {
//        return officeNumber;
//    }
//
//    public void setOfficeNumber(String officeNumber) {
//        this.officeNumber = officeNumber;
//    }

    private final TelephoneNumber telephoneNumber;
    private String name;

    //생성자
    public Person(TelephoneNumber telephoneNumber, String name) {
        this.telephoneNumber = telephoneNumber;
        this.name = name;
    }

    public String telephoneNumber() {
        return this.telephoneNumber.toString();
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }
}
