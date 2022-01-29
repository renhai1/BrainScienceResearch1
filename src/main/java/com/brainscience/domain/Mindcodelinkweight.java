package com.brainscience.domain;

import java.io.Serializable;

import lombok.Data;

/**
 * @TableName mindcodelinkweight
 */
@Data
public class Mindcodelinkweight {
    /**
     *
     */
    private Integer linkedId;

    /**
     *
     */
    private Integer mindCode1;

    /**
     *
     */
    private Integer mindCode2;

    /**
     *
     */
    private Double weight;
}