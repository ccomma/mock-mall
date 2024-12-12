package com.mockmall.item.pojo;

import com.mockmall.commonbase.base.BasePO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ItemSku
 *
 * @author ccomma
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemSku extends BasePO {

    private static final long serialVersionUID = 2180632233972136113L;

    /**
     * 商品id
     */
    private String itemId;

    /**
     * sku 状态
     */
    private Integer status;

    /**
     * 图片地址
     */
    private String image;

    /**
     * 销售属性
     */
    private String sellAttr;

    /**
     * 价格
     */
    private Integer price;
}