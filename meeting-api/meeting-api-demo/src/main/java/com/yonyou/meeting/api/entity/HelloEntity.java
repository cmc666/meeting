package com.yonyou.meeting.api.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author cuimc
 * @since 2020-06-12
 */
@Data
@ToString
public class HelloEntity implements Serializable {

    private String name;

    private String message;


}
