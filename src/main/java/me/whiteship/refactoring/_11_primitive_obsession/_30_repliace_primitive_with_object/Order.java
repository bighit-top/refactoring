package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

public class Order {

//    private String priorityValue;

    private Priority priority;

    public Order(String priorityValue) { //type safety 를 보장하지 않음
//        this.priorityValue = priorityValue;
        this(new Priority(priorityValue)); // 기존 생성자 유지
    }

    //생성자
    public Order(Priority priority) {
        this.priority = priority;
    }

//    public String getPriorityValue() {
//        return priorityValue;
//    }

    //Priority 에 접근
    public Priority getPriority() {
        return priority;
    }
}
