package com.anshanUnicom.chemist.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author {Yang Jie}
 * @DESCRIPTION
 * @create 2019/1/21
 */
@Slf4j
@Configuration
public class DruidConfig {

    @Value("${durid.data.url}")
    private String dbUrl;

    @Value("${durid.data.username}")
    private String username;

    @Value("${durid.data.password}")
    private String password;

    @Value("${durid.data.driverClassName}")
    private String driverClassName;

    @Value("${durid.data.initialSize}")
    private int initialSize;

    @Value("${durid.data.minIdle}")
    private int minIdle;

    @Value("${durid.data.maxActive}")
    private int maxActive;

    @Value("${durid.data.maxWait}")
    private int maxWait;

    @Value("${durid.data.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;

    @Value("${durid.data.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;

    @Value("${durid.data.testWhileIdle}")
    private boolean testWhileIdle;

    @Value("${durid.data.testOnBorrow}")
    private boolean testOnBorrow;

    @Value("${durid.data.testOnReturn}")
    private boolean testOnReturn;

    @Value("${durid.data.poolPreparedStatements}")
    private boolean poolPreparedStatements;

    @Value("${durid.data.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;

    @Value("${durid.data.validationQuery}")
    private String validationQuery;

    @Value("${durid.data.removeAbandoned}")
    private boolean removeAbandoned;

    @Value("${durid.data.removeAbandonedTimeout}")
    private int removeAbandonedTimeout;

    @Value("${durid.data.logAbandoned}")
    private boolean logAbandoned;

    @Value("${durid.data.filters}")
    private String filters;

    @Bean
    @Primary
    public DataSource dataSource() {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(this.dbUrl);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName(driverClassName);
        //configuration
        datasource.setInitialSize(initialSize);
        datasource.setMinIdle(minIdle);
        datasource.setMaxActive(maxActive);
        datasource.setMaxWait(maxWait);
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        datasource.setValidationQuery(validationQuery);
        datasource.setTestWhileIdle(testWhileIdle);
        datasource.setTestOnBorrow(testOnBorrow);
        datasource.setTestOnReturn(testOnReturn);
        datasource.setPoolPreparedStatements(poolPreparedStatements);
        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        datasource.setValidationQuery(validationQuery);
        datasource.setRemoveAbandoned(removeAbandoned);
        datasource.setRemoveAbandonedTimeout(removeAbandonedTimeout);
        datasource.setLogAbandoned(logAbandoned);
//        try {
//            datasource.setFilters(filters);
//        } catch (SQLException e) {
//            log.error(e.getMessage(), e);
//        }
//        datasource.setProxyFilters(Arrays.asList(statFilter(), logFilter()));
        return datasource;
    }

//    @Bean
//    @Primary
//    public StatFilter statFilter() {
//        StatFilter statFilter = new StatFilter();
//        statFilter.setSlowSqlMillis(1);
//        statFilter.setLogSlowSql(true);
//        statFilter.setMergeSql(true);
//        return statFilter;
//    }

//    @Bean
//    public Slf4jLogFilter logFilter() {
//        Slf4jLogFilter filter = new Slf4jLogFilter();
//        return  filter;
//    }
}
