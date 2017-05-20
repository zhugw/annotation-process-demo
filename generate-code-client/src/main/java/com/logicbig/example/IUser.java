package com.logicbig.example;

import com.logicbig.example.annotation.AutoImplement;
import com.logicbig.example.annotation.Mandatory;

import java.time.LocalDate;

@AutoImplement(as = "User", builder = true)
public interface IUser {

    @Mandatory
    String getFirstName();

    @Mandatory
    String getLastName();

    LocalDate getDateOfBirth();

    String getPlaceOfBirth();

    String getPhone();

    String getAddress();
}