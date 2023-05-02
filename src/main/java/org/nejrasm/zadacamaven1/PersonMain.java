package org.nejrasm.zadacamaven1;

import com.google.common.base.Joiner;

public class PersonMain {
        public static void main(String[] args) {

            final Person personOne = new Person("Nejra", 30);
            String personInfo = Joiner.on(",").join(personOne.getNameOfPerson(),personOne.getAgeOfPerson());
            System.out.println(personInfo);
        }
    }


