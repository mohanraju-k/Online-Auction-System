package com.auction.auctiondemo.repository;

import com.auction.auctiondemo.model.AuctionItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionRepository extends JpaRepository<AuctionItem, Integer> {
}