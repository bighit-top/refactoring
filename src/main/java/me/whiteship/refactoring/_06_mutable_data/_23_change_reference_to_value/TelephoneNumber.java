package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value;

public record TelephoneNumber(String areaCode, String number) { //record는 equals, hashCode를 자동으로 값을 기준으로 생성
}
