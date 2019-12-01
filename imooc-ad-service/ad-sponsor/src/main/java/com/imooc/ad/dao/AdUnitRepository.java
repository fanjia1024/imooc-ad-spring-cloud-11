package com.imooc.ad.dao;

import com.imooc.ad.entity.AdUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description
 * @Author fanjia <fanjia1k@163.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/11/30
 */
public interface AdUnitRepository extends JpaRepository<AdUnit,Long> {
    /**根据计划id和推广单元名称唯一确定一条数据*/
    AdUnit findByPlanIdAndUnitName(Long planId, String unitName);

    /**根据状态查询推广单元的list*/
    List<AdUnit> findAllByUnitStatus(Integer unitStatus);

}
