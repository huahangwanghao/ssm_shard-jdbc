package com.haohai.cms.util;

/**
 * Created by Administrator on 2017/12/25.
 */

import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.table.SingleKeyTableShardingAlgorithm;
import com.google.common.collect.Range;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * 分表逻辑
 * @author zhangwentao
 *
 */
public class MemberSingleKeyTableShardingAlgorithm implements SingleKeyTableShardingAlgorithm<Long> {
    private static final Logger logger = LoggerFactory.getLogger(MemberSingleKeyTableShardingAlgorithm.class);
    /**
     * sql between 规则
     */
    public Collection<String> doBetweenSharding(Collection<String> tableNames, ShardingValue<Long> shardingValue) {
        logger.info("sql between 规则--->tableNames:"+tableNames+",shardingValue="+shardingValue);
        Collection<String> result = new LinkedHashSet<String>(tableNames.size());
        Range<Long> range = (Range<Long>) shardingValue.getValueRange();
        for (long i = range.lowerEndpoint(); i <= range.upperEndpoint(); i++) {
            Long modValue = i % 100;
            String modStr = modValue < 10 ? "0" + modValue : modValue.toString();
            for (String each : tableNames) {
                if (each.endsWith(modStr)) {
                    result.add(each);
                }
            }
        }
        return result;
    }

    /**
     * sql == 规则
     */
    public String doEqualSharding(Collection<String> tableNames, ShardingValue<Long> shardingValue) {
        logger.info("sql == 规则--->tableNames:"+tableNames+",shardingValue="+shardingValue);
        Long modValue = shardingValue.getValue() % 100;
        String modStr = modValue < 10 ? "0" + modValue : modValue.toString();
        for (String each : tableNames) {
            if (each.endsWith(modStr)) {
                return each;
            }
        }
        throw new IllegalArgumentException();
    }

    /**
     * sql in 规则
     */
    public Collection<String> doInSharding(Collection<String> tableNames, ShardingValue<Long> shardingValue) {
        logger.info("sql in 规则--->tableNames:"+tableNames+",shardingValue="+shardingValue);
        Collection<String> result = new LinkedHashSet<String>(tableNames.size());
        for (long value : shardingValue.getValues()) {
            Long modValue = value % 100;
            String modStr = modValue < 10 ? "0" + modValue : modValue.toString();
            for (String tableName : tableNames) {
                if (tableName.endsWith(modStr)) {
                    result.add(tableName);
                }
            }
        }
        return result;
    }

}