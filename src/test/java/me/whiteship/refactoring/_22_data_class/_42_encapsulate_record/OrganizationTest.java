package me.whiteship.refactoring._22_data_class._42_encapsulate_record;

import org.junit.jupiter.api.Test;

class OrganizationTest {

    @Test
    void name() {
        //record
        Organization organization = new Organization("crong", "seoul");
        organization.name();
        organization.country();
    }
}