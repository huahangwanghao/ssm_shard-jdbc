package com.haohai.cms.util;/**
 * Created by Administrator on 2017/12/26.
 */

import com.alibaba.druid.pool.DruidDataSource;
import io.shardingjdbc.core.api.algorithm.sharding.PreciseShardingValue;
import io.shardingjdbc.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Collection;

/**
 * 分库的
 *
 * @author WangH
 * @create 2017-12-26 9:54
 **/
public class DBAlgorithm implements PreciseShardingAlgorithm<Integer> {
    private static final Logger logger = LoggerFactory.getLogger(DBAlgorithm.class);
    
    public DBAlgorithm(){
        System.out.println("我的构造方法!"+this);
    }
    
    
    
    
    @Override
    public String doSharding(final Collection<String> availableTargetNames, final PreciseShardingValue<Integer> shardingValue) {
        logger.info(this+"DBAlgorithm---->DB="+availableTargetNames+",shardingValue="+shardingValue );

        for (String each : availableTargetNames) {
            if (each.endsWith(shardingValue.getValue() % 2 + "")) {
                return each;
            }
        }
        throw new UnsupportedOperationException();
    }
}
