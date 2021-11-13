package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Counter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long hotCount;
    private long coldCount;

    protected Counter() {
    }

    public Counter(long hotCount, long coldCount) {
        this.hotCount = hotCount;
        this.coldCount = coldCount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getHotCount() {
        return hotCount;
    }

    public void setHotCount(long count) {
        this.hotCount = count;
    }

    public long getColdCount() {
        return coldCount;
    }

    public void setColdCount(long count) {
        this.coldCount = count;
    }
}
