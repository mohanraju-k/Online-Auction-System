package com.auction.auctiondemo.service;

import com.auction.auctiondemo.model.AuctionItem;
import com.auction.auctiondemo.model.BidHistory;
import com.auction.auctiondemo.repository.AuctionRepository;
import com.auction.auctiondemo.repository.BidHistoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuctionService {

    @Autowired
private BidHistoryRepository historyRepo;

    @Autowired
    private AuctionRepository repo;

    public AuctionItem getItem() {
        return repo.findById(1).orElse(null);
    }
public String placeBid(String user, int amount) {

    AuctionItem item = repo.findById(1).orElse(null);

    if (item == null) return "Item not found";

    if (amount > item.getCurrentBid()) {
        item.setCurrentBid(amount);
        repo.save(item);

        // save history
        BidHistory h = new BidHistory();
        h.setUserName(user);
        h.setAmount(amount);
        historyRepo.save(h);

        return "Bid placed successfully!";
    } else {
        return "Bid must be higher!";
    }
}
}
