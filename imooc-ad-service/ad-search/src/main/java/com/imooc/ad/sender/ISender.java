package com.imooc.ad.sender;

import com.imooc.ad.mysql.dto.MySqlRowData;

/**
 * Created by fanjia.
 */
public interface ISender {

    void sender(MySqlRowData rowData);
}
