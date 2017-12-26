package com.haohai.cms.util;/**
 * Created by Administrator on 2017/12/26.
 */

import io.shardingjdbc.core.api.algorithm.sharding.PreciseShardingValue;
import io.shardingjdbc.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

/**
 * 分库的
 *
 * @author WangH
 * @create 2017-12-26 9:54
 **/
public class TableAlgorithm implements PreciseShardingAlgorithm<Integer> {

    private static final Logger logger = LoggerFactory.getLogger(TableAlgorithm.class);
    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Integer> shardingValue) {
        logger.info("TableAlgorithm---->availableTargetNames="+availableTargetNames+",shardingValue="+shardingValue);
        for (String each : availableTargetNames) {
            if (each.endsWith(shardingValue.getValue() % 2 + "")) {
                return each;
            }
        }
        throw new UnsupportedOperationException();
    }
}
