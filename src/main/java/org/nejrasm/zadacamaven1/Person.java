package org.nejrasm.zadacamaven1;

import com.google.common.base.MoreObjects;

public class Person {

    private final String nameOfPerson;
    private final int ageOfPerson;

    public Person(final String nameOfPerson) {
        this(nameOfPerson, 15);
    }

    public Person(final String nameOfPerson, final int ageOfPerson) {
        this.nameOfPerson = nameOfPerson;
        this.ageOfPerson = ageOfPerson;
    }

    public int getAgeOfPerson() {
        return this.ageOfPerson;
    }

    public String getNameOfPerson() {
        return this.nameOfPerson;
    }
}
