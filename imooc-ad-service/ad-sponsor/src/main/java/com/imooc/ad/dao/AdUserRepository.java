package com.imooc.ad.dao;

import com.imooc.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description
 * @Author fanjia <fanjia1k@163.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/11/30
 */
public interface AdUserRepository extends JpaRepository<AdUser, Long> {
    AdUser findByUsername(String username);
}
