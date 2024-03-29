package com.mockmall.item.service.impl;

import com.mockmall.item.bo.CarouselBO;
import com.mockmall.item.mapper.CarouselMapper;
import com.mockmall.item.pojo.Carousel;
import com.mockmall.item.service.CarouselService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * CarouselService
 *
 * @author ccomma
 */
@Service
public class CarouselServiceImpl implements CarouselService {

    @Resource
    private CarouselMapper carouselMapper;

    @Override
    public List<CarouselBO> listCarouselByShow() {
        List<Carousel> carouselList = carouselMapper.selectByShow();
        return carouselList.stream()
                .map(carousel -> {
                    CarouselBO carouselBO = new CarouselBO();
                    BeanUtils.copyProperties(carousel, carouselBO);
                    return carouselBO;
                })
                .collect(Collectors.toList());
    }
}
