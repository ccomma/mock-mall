package com.mockmall.minifront.carousel.controller;

import com.mockmall.commonbase.result.Result;
import com.mockmall.item.bo.CarouselBO;
import com.mockmall.item.service.CarouselClientService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 轮播图
 *
 * @author ccomma
 */
@RestController
@RequestMapping("/carousel/v1")
public class CarouselController {
    @DubboReference(check = false, version = "1.0.0")
    private CarouselClientService carouselClientService;

    @GetMapping("/get_carousel_list_by_show")
    public Result<List<CarouselBO>> getCarouselListByShow() {
        return carouselClientService.getCarouselListByShow();
    }
}
