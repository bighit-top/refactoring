package me.whiteship.refactoring._18_middle_man._39_replace_superclass_with_delegate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

//public class Scroll extends CategoryItem {
public class Scroll {

    private LocalDate dateLastCleaned;

    private CategoryItem categoryItem; //상위 객체 필드 선언

    public Scroll(Integer id, String title, List<String> tags, LocalDate dateLastCleaned) {
//        super(id, title, tags);
        this.dateLastCleaned = dateLastCleaned;
        this.categoryItem = new CategoryItem(id, title, tags); //상속 대신 필드 사용
    }

    public long daysSinceLastCleaning(LocalDate targetDate) {
        return this.dateLastCleaned.until(targetDate, ChronoUnit.DAYS);
    }
}
