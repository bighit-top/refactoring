package me.whiteship.refactoring._22_data_class._42_encapsulate_record;

import org.junit.jupiter.api.Test;

class OrganizationTest {

    @Test
    void name() {
        //class field 직접 접근
//        Organization organization = new Organization();
//        organization.name = "crong";

        //record
        Organization organization = new Organization("crong", "seoul");
        organization.name();
        organization.country();
    }
}