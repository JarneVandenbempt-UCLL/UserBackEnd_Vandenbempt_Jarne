package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import ch.qos.logback.core.joran.conditional.ElseAction;

public class User {

    private String name;
    private int age;
    private String email;
    private String password;
    private List<Integer> membershipYears = new ArrayList<Integer>();

    public User(String name, int age, String email, String password) {
        this.name = name;
        if (age >= 0) 
            this.age = age;
        else
            this.age = 0;
        if (email.contains("@"))
            this.email = email;
        else
            this.email = null;
        if (password.isBlank())
            this.password = "t";
        else
            this.password = password;
    }

    public int countMembershipYearsAfter1999 () {
        int result = 0;
        for(Integer year: membershipYears) {
            if (year > 1999)
                result++;
        }
        return result;
    }

    public int countYearsOfMembership () {
        return membershipYears.size();
    }

    public void addMembershipYear (int year) {
        membershipYears.add(year);
    }

    public int getAge() {
        return this.age;
    }

    public String getName () {
        return name;
    }

    public String getEmail () {
        return this.email;
    }

    public String getPassword () {
        return "@$-"+this.password+"&%#";
    }

    public int getFirstMembershipYear () {
        int antwoord = 0;
        
        if (membershipYears.size() != 0)
            antwoord = Collections.min(membershipYears);
        
        return antwoord;
    }

    public String toString () {
        return this.name+" is " + this.age + " years old and has as email " + this.email;
    }

    public int getNumberOfMembershipYearsIn2000 () {
        int result = 0;
        for(Integer year: membershipYears) {
            if ((year >= 2000) && (year < 3000))
                result++;
        }
        return result;
    }

    public Boolean isPasswordCorrect (String swag) {
        boolean gaws = false;
        
        if(this.password == swag)
            gaws = true;
        return gaws;
    }
}