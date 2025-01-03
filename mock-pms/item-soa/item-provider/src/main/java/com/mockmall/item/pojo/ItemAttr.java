package com.mockmall.item.pojo;

import com.mockmall.commonbase.base.BasePO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ItemAttr
 *
 * @author ccomma
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemAttr extends BasePO {

    private static final long serialVersionUID = -3945632428499518470L;

    /**
     * 主键
     */
    private String id;

    /**
     * 商品id
     */
    private String itemId;

    /**
     * 属性id
     */
    private String attrId;

    /**
     * 属性值id
     */
    private String attrValueId;

    /**
     * 属性名称
     */
    private String attrName;

    /**
     * 属性值
     */
    private String attrValue;

    /**
     * 图片
     */
    private String image;

    /**
     * 类型 1：销售属性；2：非关键属性
     *
     * @see com.mockmall.item.constants.ItemConstant
     */
    private Integer attrType;

    /**
     * 顺序
     */
    private Integer sort;

}