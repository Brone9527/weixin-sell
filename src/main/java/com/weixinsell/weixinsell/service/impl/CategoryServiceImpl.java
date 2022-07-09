package com.weixinsell.weixinsell.service.impl;

import com.weixinsell.weixinsell.dataObject.ProductCategory;
import com.weixinsell.weixinsell.repository.ProductCategoryRepository;
import com.weixinsell.weixinsell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * @author qiwl
 * @version 1.0
 * @description
 * @date 2022/7/9 18:57
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory findOne(Integer categoryId){
      return repository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll(){
        return repository.findAll();
    }
}
