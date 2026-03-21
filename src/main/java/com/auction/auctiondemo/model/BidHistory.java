package com.auction.auctiondemo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bid_history")
public class BidHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_name")
    private String userName;

    private int amount;

    public int getId() { return id; }
    public String getUserName() { return userName; }
    public int getAmount() { return amount; }

    public void setId(int id) { this.id = id; }
    public void setUserName(String userName) { this.userName = userName; }
    public void setAmount(int amount) { this.amount = amount; }
}