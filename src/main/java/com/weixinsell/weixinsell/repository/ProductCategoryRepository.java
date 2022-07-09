package com.weixinsell.weixinsell.repository;

import com.weixinsell.weixinsell.dataObject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author qiwl
 * @version 1.0
 * @description
 * @date 2022/7/9 18:20
 */
 
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
