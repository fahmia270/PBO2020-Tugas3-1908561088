package com.main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TampilkanMember {
    public static MemberGfriend tampilkanMember() {
        MemberGfriend memberGfriend = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("depository_file.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            memberGfriend = (MemberGfriend) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception error) {
            error.printStackTrace();
        }
        return memberGfriend;
    }
}