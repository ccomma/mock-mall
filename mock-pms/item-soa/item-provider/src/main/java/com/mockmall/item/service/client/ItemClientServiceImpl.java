package com.mockmall.item.service.client;

import com.mockmall.commonbase.base.BaseQuery;
import com.mockmall.commonbase.result.GeneralResult;
import com.mockmall.commonbase.result.Page;
import com.mockmall.commonbase.result.Result;
import com.mockmall.item.bo.ItemBO;
import com.mockmall.item.service.ItemClientService;
import com.mockmall.item.service.ItemService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * 商品 ClientService
 *
 * @author ccomma
 */
@DubboService(version = "1.0.0")
public class ItemClientServiceImpl implements ItemClientService {

    @Resource
    private ItemService itemService;

    @Override
    public Result<Page<ItemBO>> getPageForRecommend(BaseQuery query) {
        return GeneralResult.successWithData(itemService.getPageForRecommend(query));
    }
}
