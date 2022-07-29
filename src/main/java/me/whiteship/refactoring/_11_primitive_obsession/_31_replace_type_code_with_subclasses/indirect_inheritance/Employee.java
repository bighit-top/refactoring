package me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.indirect_inheritance;

public class Employee {

    private String name;

//    private String type;
//    private String typeValue;

    private EmployeeType type; //새로운 타입 추

    public Employee(String name, String typeValue) {
//        this.validate(typeValue);
//        this.typeValue = typeValue;
        this.name = name;
        this.type = this.employeeType(typeValue);
    }

    //팩토리성 메소드
    private EmployeeType employeeType(String typeValue) {
        return switch (typeValue) {
            case "engineer" -> new Engineer();
            case "manager" -> new Manager();
            case "salesman" -> new Salesman();
            default -> throw new IllegalArgumentException(typeValue);
        };
    }

//    private void validate(String type) {
//        List<String> legalTypes = List.of("engineer", "manager", "salesman");
//        if (!legalTypes.contains(type)) {
//            throw new IllegalArgumentException(type);
//        }
//    }

    public String capitalizedType() {
//        return this.typeValue.substring(0, 1).toUpperCase() + this.typeValue.substring(1).toLowerCase();
        return this.type.capitalizedType();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
//                ", type='" + typeValue + '\'' +
                ", type='" + type.toString() + '\'' +
                '}';
    }
}
