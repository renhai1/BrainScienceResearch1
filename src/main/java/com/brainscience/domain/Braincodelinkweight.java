package com.brainscience.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName braincodelinkweight
 */
@Data
public class Braincodelinkweight{
    /**
     * 
     */
    private Integer linkedid;

    /**
     * 
     */
    private Integer brainregionsnum1;

    /**
     * 
     */
    private Integer brainregionsnum2;

    /**
     * 
     */
    private Double weight;

    private static final long serialVersionUID = 1L;
}