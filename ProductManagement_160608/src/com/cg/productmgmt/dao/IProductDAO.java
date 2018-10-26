package com.cg.productmgmt.dao;

import java.util.Map;

import com.cg.productmgmt.exception.ProductException;

public interface IProductDAO {
    public int updateProducts(String category, int hike) throws ProductException;
    public Map<String, String> getproductDetails() throws ProductException;
}