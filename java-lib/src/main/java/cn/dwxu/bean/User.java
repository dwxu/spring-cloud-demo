package cn.dwxu.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class User {
    private Long id;

    private String name;

    private Byte age;

    private Boolean sex;

    private Date gmtCreate;

    private Date gmtModified;
}
