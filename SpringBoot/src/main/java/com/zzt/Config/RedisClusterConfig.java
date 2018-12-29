package com.zzt.Config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;


/**
 * redis集群配置
 */
@Slf4j
//@Configuration
public class RedisClusterConfig {

    /**
     * Redis集群的配置
     * @return RedisClusterConfiguration
     * @autor zzt
     * @throws
     */
    /*@Bean
    public RedisClusterConfiguration redisClusterConfiguration(){
        RedisClusterConfiguration redisClusterConfiguration = new RedisClusterConfiguration();
        //Set<RedisNode> clusterNodes
        //String[] serverArray = clusterNodes.split(",");

        Set<RedisNode> nodes = new HashSet<>();

        for(String ipPort:serverArray){
            String[] ipAndPort = ipPort.split(":");
            nodes.add(new RedisNode(ipAndPort[0].trim(),Integer.valueOf(ipAndPort[1])));
        }

        redisClusterConfiguration.setClusterNodes(nodes);
        //redisClusterConfiguration.setMaxRedirects(mmaxRedirectsac);

        return redisClusterConfiguration;
    }*/










}
