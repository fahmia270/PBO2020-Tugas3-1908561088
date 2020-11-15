package com.main;

import java.io.Serializable;

public class MemberGfriend implements Serializable {
    private String namaMember;

    public MemberGfriend(String namaMember) {
        this.namaMember = namaMember;
    }

    public String getNamaMember() {
        return namaMember;
    }
}