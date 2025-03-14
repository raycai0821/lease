package com.atguigu.lease.common.minio;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author leifeng.cai
 * @version 1.0
 * @desc Create by 2025/1/16 15:34
 */

@Data
@ConfigurationProperties(prefix = "minio")
public class MinioProperties {

    private String endpoint;

    private String accessKey;


    private String secretKey;

    private String bucketName;
}
