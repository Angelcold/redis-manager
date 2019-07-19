package com.newegg.ec.redis.client;

/**
 * @author Jay.H.Zou
 * @date 2019/7/18
 */
public interface IRedisClusterClient extends IRedisClient {

    String getRedisClusterClient();

    String getClusterInfo();

    String getNodeList();

    String getMasterList();

    String getSlaveList();

}
