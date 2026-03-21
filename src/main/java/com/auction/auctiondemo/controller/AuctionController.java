package com.auction.auctiondemo.controller;

import com.auction.auctiondemo.model.AuctionItem;
import com.auction.auctiondemo.service.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class AuctionController {

    @Autowired
    private AuctionService service;

    @GetMapping("/item")
    public AuctionItem getItem() {
        return service.getItem();
    }
    @PostMapping("/bid")
public String placeBid(@RequestParam String user, @RequestParam int amount) {
    return service.placeBid(user, amount);
}
}