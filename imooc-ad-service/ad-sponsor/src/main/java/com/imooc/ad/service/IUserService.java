package com.imooc.ad.service;

import com.imooc.ad.exception.AdException;
import com.imooc.ad.vo.CreateUserRequest;
import com.imooc.ad.vo.CreateUserResponse;

/**
 * @Description
 * @Author fanjia <fanjia1k@163.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/11/30
 */
public interface IUserService {
    /**
     * <h2>创建用户</h2>
     */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;

}
