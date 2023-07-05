/**
 * Created By VijayKumar Moohite
 * Date : 7/5/2023
 * Time : 7:46 PM
 * Project : ManyToOneRelationshipApplicationHB4
 **/

package org.mahagan.domain;

import jakarta.persistence.*;


@Entity
@Table(name = "vehicals")
public class Vehicles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vehicalId;
    private String vehicalName;
    private String vehicalType;
    private int vehicalNumber;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserId")
     private User user;

    public int getVehicalId() {
        return vehicalId;
    }

    public void setVehicalId(int vehicalId) {
        this.vehicalId = vehicalId;
    }

    public String getVehicalName() {
        return vehicalName;
    }

    public void setVehicalName(String vehicalName) {
        this.vehicalName = vehicalName;
    }

    public String getVehicalType() {
        return vehicalType;
    }

    public void setVehicalType(String vehicalType) {
        this.vehicalType = vehicalType;
    }

    public int getVehicalNumber() {
        return vehicalNumber;
    }

    public void setVehicalNumber(int vehicalNumber) {
        this.vehicalNumber = vehicalNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
