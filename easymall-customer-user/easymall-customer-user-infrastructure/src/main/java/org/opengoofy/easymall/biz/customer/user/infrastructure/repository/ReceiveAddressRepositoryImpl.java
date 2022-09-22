/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opengoofy.easymall.biz.customer.user.infrastructure.repository;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.AllArgsConstructor;
import org.opengoofy.easymall.biz.customer.user.domain.mode.ReceiveAddress;
import org.opengoofy.easymall.biz.customer.user.domain.repository.ReceiveAddressRepository;
import org.opengoofy.easymall.biz.customer.user.infrastructure.dao.entity.ReceiveAddressDO;
import org.opengoofy.easymall.biz.customer.user.infrastructure.dao.mapper.ReceiveAddressMapper;
import org.opengoofy.easymall.springboot.starter.common.toolkit.BeanUtil;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户收货地址仓储层
 *
 * @author chen.ma
 * @github https://github.com/itmachen
 */
@Repository
@AllArgsConstructor
public class ReceiveAddressRepositoryImpl implements ReceiveAddressRepository {
    
    private final ReceiveAddressMapper receiveAddressMapper;
    
    @Override
    public List<ReceiveAddress> listReceiveAddressByCustomerUserId(String customerUserId) {
        List<ReceiveAddressDO> receiveAddressDOList = receiveAddressMapper.selectList(Wrappers.lambdaQuery(ReceiveAddressDO.class).eq(ReceiveAddressDO::getCustomerUserId, customerUserId));
        return BeanUtil.convert(receiveAddressDOList, ReceiveAddress.class);
    }
}
