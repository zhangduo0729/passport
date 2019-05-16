package com.ljz.passport.core.properties;

/**
 * @author 李建珍
 * @date 2019/4/2
 */
public class QQProperties extends AbstractSocialProperties {

    /**
     * 服务提供商的标识
     */
    private String providerId = "qq";

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }
}