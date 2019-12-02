package com.imooc.ad.search;

import com.imooc.ad.search.vo.SearchRequest;
import com.imooc.ad.search.vo.SearchResponse;

/**
 * @Description
 * @Author fanjia <fanjia1k@163.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/12/2
 */
public interface ISearch {
    SearchResponse fetchAds(SearchRequest request);
}
