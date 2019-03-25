package com.titian.familytree.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class HumanInfo {

    private int id;
    private Date create_time;
    private Date modified_time;
    private String full_name;
    private String english_name;
    private String registered_residence;
    private String identity_card;
    private String nation;
    private int sex;
    private Date birthday;
    private String photo_url;
    private String political_status;
    private String blood_type;
    private int height;
    private String sketch;
    private String email;
    private String phone;
    private int marital_status;
    private Date time_to_work;
    private int record_of_formal_schooling;
    private int status;

}
