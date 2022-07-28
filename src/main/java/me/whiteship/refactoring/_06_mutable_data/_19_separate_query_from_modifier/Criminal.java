package me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier;

import java.util.List;

public class Criminal {

//    public String alertForMiscreant(List<Person> people) {
    public void alertForMiscreant(List<Person> people) { //modifier
//        for (Person p : people) {
//            if (p.getName().equals("Don")) {
//                setOffAlarms();
////                return "Don";
//            }
//
//            if (p.getName().equals("John")) {
//                setOffAlarms();
////                return "John";
//            }
//        }
////        return "";
        if (!findMiscreant(people).isBlank()) {
            setOffAlarms();
        }
    }

    public String findMiscreant(List<Person> people) { //query
        for (Person p : people) {
            if (p.getName().equals("Don")) {
//                setOffAlarms();
                return "Don";
            }
            if (p.getName().equals("John")) {
//                setOffAlarms();
                return "John";
            }
        }
        return "";
    }

    private void setOffAlarms() {
        System.out.println("set off alarm");
    }
}
