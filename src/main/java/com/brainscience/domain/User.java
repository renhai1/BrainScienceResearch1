package com.brainscience.domain;

import lombok.Data;

/**
 * @TableName user
 */
@Data
public class User {
    /**
     *
     */
    private Integer userId;

    /**
     *
     */
    private String userName;

    /**
     *
     */
    private String userEmail;

    /**
     *
     */
    private String password;

    /**
     *
     */
    private String headPhoto;

    /**
     *
     */
    private String resume;

    /**
     *
     */
    private String phone;

    /**
     *
     */
    private String userType;

}