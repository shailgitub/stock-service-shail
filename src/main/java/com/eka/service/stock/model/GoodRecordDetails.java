package com.eka.service.stock.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class GoodRecordDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int grdId;
	private String stockName;
	private String stockType;
	private int stockQty;
	private String stockUnit;
	private String stockLocation;
	private String purchaseItemNumber;
	private String purchaseRefNumber;
	public int getGrdId() {
		return grdId;
	}
	public void setGrdId(int grdId) {
		this.grdId = grdId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getStockType() {
		return stockType;
	}
	public void setStockType(String stockType) {
		this.stockType = stockType;
	}
	public int getStockQty() {
		return stockQty;
	}
	public void setStockQty(int stockQty) {
		this.stockQty = stockQty;
	}
	public String getStockUnit() {
		return stockUnit;
	}
	public void setStockUnit(String stockUnit) {
		this.stockUnit = stockUnit;
	}
	public String getStockLocation() {
		return stockLocation;
	}
	public void setStockLocation(String stockLocation) {
		this.stockLocation = stockLocation;
	}
	public String getPurchaseItemNumber() {
		return purchaseItemNumber;
	}
	public void setPurchaseItemNumber(String purchaseItemNumber) {
		this.purchaseItemNumber = purchaseItemNumber;
	}
	public String getPurchaseRefNumber() {
		return purchaseRefNumber;
	}
	public void setPurchaseRefNumber(String purchaseRefNumber) {
		this.purchaseRefNumber = purchaseRefNumber;
	}
	@Override
	public String toString() {
		return "GoodRecordDetails [grdId=" + grdId + ", stockName=" + stockName + ", stockType=" + stockType
				+ ", stockQty=" + stockQty + ", stockUnit=" + stockUnit + ", stockLocation=" + stockLocation
				+ ", purchaseItemNumber=" + purchaseItemNumber + ", purchaseRefNumber=" + purchaseRefNumber + "]";
	}
	
}
