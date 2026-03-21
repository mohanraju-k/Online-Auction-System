package com.auction.auctiondemo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "auction_item")
public class AuctionItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "base_price")
    private int basePrice;

    @Column(name = "current_bid")
    private int currentBid;

    // getters
    public int getId() { return id; }
    public String getItemName() { return itemName; }
    public int getBasePrice() { return basePrice; }
    public int getCurrentBid() { return currentBid; }

    // setters
    public void setId(int id) { this.id = id; }
    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setBasePrice(int basePrice) { this.basePrice = basePrice; }
    public void setCurrentBid(int currentBid) { this.currentBid = currentBid; }
}