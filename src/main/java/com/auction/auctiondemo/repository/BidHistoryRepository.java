package com.auction.auctiondemo.repository;

import com.auction.auctiondemo.model.BidHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidHistoryRepository extends JpaRepository<BidHistory, Integer> {
}