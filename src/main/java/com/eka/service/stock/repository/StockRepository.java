package com.eka.service.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eka.service.stock.model.GoodRecordDetails;

@Repository
public interface StockRepository extends JpaRepository<GoodRecordDetails, Integer>{

}
