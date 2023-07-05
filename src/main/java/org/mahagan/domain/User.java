/**
 * Created By VijayKumar Moohite
 * Date : 7/5/2023
 * Time : 7:46 PM
 * Project : ManyToOneRelationshipApplicationHB4
 **/

package org.mahagan.domain;

import jakarta.persistence.*;


//This is my Fourth ManyToOne Mapping Relationship Application in Hibernate.
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserId;
    private String userName;


    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
