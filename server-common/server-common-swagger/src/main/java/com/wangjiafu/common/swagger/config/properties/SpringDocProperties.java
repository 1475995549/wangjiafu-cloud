package com.wangjiafu.common.swagger.config.properties;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * Swagger 配置属性
 *
 * @author ruoyi
 */
@ConfigurationProperties(prefix = "springdoc")
@Data
public class SpringDocProperties {
    /**
     * 网关
     */
    private String gatewayUrl;

    /**
     * 文档基本信息
     */
    @NestedConfigurationProperty
    private InfoProperties info = new InfoProperties();

    /**
     * <p>
     * 文档的基础属性信息
     * </p>
     *
     * @see io.swagger.v3.oas.models.info.Info
     *
     * 为了 springboot 自动生产配置提示信息，所以这里复制一个类出来
     */
    @Data
    public static class InfoProperties {
        /**
         * 标题
         */
        private String title = null;

        /**
         * 描述
         */
        private String description = null;

        /**
         * 联系人信息
         */
        @NestedConfigurationProperty
        private Contact contact = null;

        /**
         * 许可证
         */
        @NestedConfigurationProperty
        private License license = null;

        /**
         * 版本
         */
        private String version = null;
    }
}
