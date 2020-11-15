package com.main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MenyimpanMember implements Serializable {
    private MemberGfriend memberGfriend;
    public MenyimpanMember(String memberBaru) {
        if (memberBaru == null) {
            memberGfriend = null;
        } else {
            memberGfriend = new MemberGfriend(memberBaru);
        }
    }

    public void laksanakan() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("depository_file.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(this.memberGfriend);
            objectOutputStream.flush();
            objectOutputStream.close();

        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}