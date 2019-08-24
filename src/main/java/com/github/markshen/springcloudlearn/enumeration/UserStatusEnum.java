package com.github.markshen.springcloudlearn.enumeration;

public enum UserStatusEnum {
    ENABLE(1),
    DISABLE(2);

    private int seq;

    UserStatusEnum(int seq) {
        this.seq = seq;
    }

    public int getSeq() {
        return seq;
    }
}