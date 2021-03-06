/*
 *
 * Copyright 2017-2018 549477611@qq.com(xiaoyu)
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.github.myth.demo.springcloud.inventory.service;

import com.github.myth.demo.springcloud.inventory.dto.InventoryDTO;


/**
 * @author xiaoyu
 */
public interface InventoryService {


    /**
     * 扣减库存操作
     * 这一个tcc接口
     *
     * @param inventoryDTO 库存DTO对象
     * @return true
     */
    Boolean decrease(InventoryDTO inventoryDTO);


    /**
     * mock 库存扣减try阶段异常
     *
     * @param inventoryDTO dto
     * @return true
     */
    Boolean mockWithTryException(InventoryDTO inventoryDTO);


    /**
     * mock 库存扣减try阶段超时
     *
     * @param inventoryDTO dto
     * @return true
     */
    Boolean mockWithTryTimeout(InventoryDTO inventoryDTO);


}
