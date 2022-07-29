package me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance;

//public class Employee {
public abstract class Employee {

    private String name;

//    private String type;

//    public Employee(String name, String type) {
    protected Employee(String name) {
//        this.validate(type);
        this.name = name;
//        this.type = type;
    }

    //팩토리성 메소드
    public static Employee createEmployee(String name, String type) {
        return switch (type) {
            case "engineer" -> new Engineer(name);
            case "manager" -> new Manager(name);
            case "salesman" -> new Salesman(name);
            default -> throw new IllegalArgumentException(type);
        };
    }

//    private void validate(String type) {
//        List<String> legalTypes = List.of("engineer", "manager", "salesman");
//        if (!legalTypes.contains(type)) {
//            throw new IllegalArgumentException(type);
//        }
//    }

//    public String getType() {
    protected abstract String getType();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
//                ", type='" + type + '\'' +
                ", type='" + getType() + '\'' +
                '}';
    }
}
