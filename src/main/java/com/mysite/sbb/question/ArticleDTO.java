package com.mysite.sbb.question;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class ArticleDTO implements Serializable {
    @Id
    private long no;
    private String name;
    private String title;
    private String content;
    private Date regdate;
    private int readcount;
    private String password;

}