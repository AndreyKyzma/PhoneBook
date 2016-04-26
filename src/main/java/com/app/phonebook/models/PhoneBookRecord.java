package com.app.phonebook.models;

import com.app.phonebook.validation.Phone;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "phonebook")
public class PhoneBookRecord extends Model {

    @Phone
    @NotNull
    @Column(name = "mobilePhone")
    private String mobilePhone;

    @Phone
    @Column(name = "homePhone")
    private String homePhone;

    @NotNull
    @Size(min = 4, max = 40, message = "LastName must at least 4 characters.")
    @Valid
    private String lastName;

    @NotNull
    @Size(min = 4, max = 40, message = "FirstName must at least 4 characters.")
    @Valid
    private String firstName;

    @NotNull
    @Size(min = 4, max = 40, message = "MiddleName must at least 4 characters.")
    @Valid
    private String middleName;

    private String address;

    @Email(message = "Email address is not valid.")
    @NotNull
    private String email;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;


    public PhoneBookRecord() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

}
