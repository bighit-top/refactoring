package me.whiteship.refactoring._10_data_clumps;

public class Office {

    private String location;

//    private String officeAreCode;
//
//    private String officeNumber;

    private TelephoneNumber officePhoneNumber;

//    public Office(String location, String officeAreCode, String officeNumber) {
//        this.location = location;
//        this.officeAreCode = officeAreCode;
//        this.officeNumber = officeNumber;
//    }

    public Office(String location, TelephoneNumber officePhoneNumber) {
        this.location = location;
        this.officePhoneNumber = officePhoneNumber;
    }

    public String officePhoneNumber() {
//        return officeAreCode + "-" + officeNumber;
        return this.officePhoneNumber.toString();
    }

    public String getOfficeAreCode() {
        return this.officePhoneNumber.getAreaCode();
    }

    public void setOfficeAreCode(String officeAreaCode) {
        this.officePhoneNumber.setAreaCode(officeAreaCode);
    }

    public String getOfficeNumber() {
        return this.officePhoneNumber.getNumber();
    }

    public void setOfficeNumber(String officeNumber) {
        this.officePhoneNumber.setNumber(officeNumber);
    }

}
