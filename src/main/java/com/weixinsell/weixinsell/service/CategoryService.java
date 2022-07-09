package com.weixinsell.weixinsell.service;

import com.weixinsell.weixinsell.dataObject.ProductCategory;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;

/**
 * @author qiwl
 * @version 1.0
 * @description
 * @date 2022/7/9 18:53
 */
 
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
