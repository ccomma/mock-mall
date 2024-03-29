package com.mockmall.item.service;

import com.mockmall.commonbase.result.Result;
import com.mockmall.item.bo.CarouselBO;

import java.util.List;

/**
 * Carousel
 *
 * @author ccomma
 */
public interface CarouselClientService {

    /**
     * 获取可展示的轮播图
     *
     * @return 轮播图列表
     * @author ccomma
     */
    Result<List<CarouselBO>> getCarouselListByShow();

}
