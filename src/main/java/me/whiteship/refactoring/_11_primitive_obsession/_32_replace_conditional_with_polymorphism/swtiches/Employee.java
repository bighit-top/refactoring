package me.whiteship.refactoring._11_primitive_obsession._32_replace_conditional_with_polymorphism.swtiches;

import java.util.List;

//public class Employee {
public abstract class Employee {

//    private String type;
//    private List<String> availableProjects;

    protected List<String> availableProjects;

//    public Employee(String type, List<String> availableProjects) {
//        this.type = type;
//        this.availableProjects = availableProjects;
//    }

    //추가 생성자
    public Employee(List<String> availableProjects) {
        this.availableProjects = availableProjects;
    }

    public Employee() {
    }

//    public int vacationHours() {
////        return switch (type) {
////            case "full-time" -> 120;
////            case "part-time" -> 80;
////            case "temporal" -> 32;
////            default -> 0;
////        };
//        return 0;
//    }
    public abstract int vacationHours();

    public boolean canAccessTo(String project) {
//        return switch (type) {
//            case "full-time" -> true;
//            case "part-time", "temporal" -> this.availableProjects.contains(project);
//            default -> false;
//        };
        return this.availableProjects.contains(project);
    }
}
