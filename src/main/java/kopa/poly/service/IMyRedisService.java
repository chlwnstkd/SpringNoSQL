package kopa.poly.service;

import kopa.poly.dto.RedisDTO;

public interface IMyRedisService {

    /**
     * String 타입 저장 및 가져오기
     */
    RedisDTO saveString(RedisDTO pDTO) throws Exception;
}
