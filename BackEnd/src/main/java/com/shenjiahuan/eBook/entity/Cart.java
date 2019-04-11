package com.shenjiahuan.eBook.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@IdClass(CartPK.class)
public class Cart {
    private int uid;
    private int bookId;
    private Integer count;
    private Timestamp time;

    @Id
    @Column(name = "uid")
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Id
    @Column(name = "book_id")
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Basic
    @Column(name = "time")
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return uid == cart.uid &&
                bookId == cart.bookId &&
                Objects.equals(count, cart.count) &&
                Objects.equals(time, cart.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, bookId, count, time);
    }
}