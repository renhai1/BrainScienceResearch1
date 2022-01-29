package com.brainscience.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName mentalcode
 */
@Data
public class Mentalcode{
    /**
     * 
     */
    private Integer mindcode;

    /**
     * 
     */
    private String mindfullname;

    /**
     * 
     */
    private String firstlevelmindenglishname;

    /**
     * 
     */
    private String secondlevelmindenglishname;

    /**
     * 
     */
    private String thirdlevelmindenglishname;

    /**
     * 
     */
    private Integer nodelevel;

    /**
     * 
     */
    private String firstlevelmindchinesename;

    /**
     * 
     */
    private String secondlevelmindchinesename;

    /**
     * 
     */
    private String thirdlevelmindchinesename;

    private static final long serialVersionUID = 1L;
}