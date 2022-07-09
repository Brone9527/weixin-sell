package com.weixinsell.weixinsell.dataObject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

/**
 * @author qiwl
 * @version 1.0
 * @description
 * @date 2022/7/9 17:41
 */


@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    /** 类目id. */
    private Integer categoryId;


    /** 类目名字. */
    private String categoryName;


    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory(){

    }

    public ProductCategory(String categoryName, Integer categoryType){
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

}
