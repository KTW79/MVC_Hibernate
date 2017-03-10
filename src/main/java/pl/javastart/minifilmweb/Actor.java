package pl.javastart.minifilmweb;

import java.util.Date;

/**
 * Created by Kasia on 10.03.2017.
 */
public class Actor {
    private String name;
    private String surname;
    private Date dateOfBirth;

    public Actor() {
    }


    public Actor(String name, String surname, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
