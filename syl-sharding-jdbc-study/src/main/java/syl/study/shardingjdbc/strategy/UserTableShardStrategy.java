package syl.study.shardingjdbc.strategy;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

/**
 * 描述：
 *
 * @author 史彦磊
 * @Date 2019-10-11 22:30
 */
public class UserTableShardStrategy implements PreciseShardingAlgorithm<Date> {


    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Date> preciseShardingValue) {
        for (String s : collection) {
            System.out.println(s);
        }

        String columnName = preciseShardingValue.getColumnName();
        String logicTableName = preciseShardingValue.getLogicTableName();
        Date value = preciseShardingValue.getValue();
        System.out.println("columnName : "+columnName);
        System.out.println("logicTableName : "+logicTableName);
        System.out.println("value : "+value);
        for (String s : collection) {
            LocalDate localDate = value.toLocalDate();
            String format = localDate.format(DateTimeFormatter.ofPattern("yyyy_MM"));
            if (s.contains(format)){
                return s;
            }
        }
        throw new RuntimeException("没有找到对应的表");
    }
}
