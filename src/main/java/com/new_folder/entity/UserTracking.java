package com.new_folder.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "users_tracking", schema = "public", catalog = "postgres")
public class UserTracking {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "post_text", nullable = true, length = 300)
    private String postText;
    @Basic
    @Column(name = "post_date", nullable = true)
    private Date postDate;
//    @OneToOne
//    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
//    private Customer customersById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserTracking that = (UserTracking) o;
        return id == that.id && Objects.equals(postText, that.postText) && Objects.equals(postDate, that.postDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, postText, postDate);
    }


}
