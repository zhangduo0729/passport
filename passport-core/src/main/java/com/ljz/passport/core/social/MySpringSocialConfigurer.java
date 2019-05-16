package com.ljz.passport.core.social;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationManager;
import org.springframework.social.security.SocialAuthenticationFilter;
import org.springframework.social.security.SpringSocialConfigurer;

/**
 * 覆盖默认的SpringSocialConfigurer，重新实现postProcess
 *
 * @author 李建珍
 * @date 2019/4/23
 */
public class MySpringSocialConfigurer extends SpringSocialConfigurer {
    private String filterProcessUrl;

    public MySpringSocialConfigurer(String filterProcessUrl) {
        this.filterProcessUrl = filterProcessUrl;
    }

    @Override
    protected <T> T postProcess(T object) {
        /**
         *  org.springframework.security.config.annotation.SecurityConfigurerAdapter.postProcess()
         * 放到过滤器链上的filter
         */
        SocialAuthenticationFilter filter = (SocialAuthenticationFilter) super.postProcess(object);
        filter.setFilterProcessesUrl(filterProcessUrl);
        return (T) filter;
    }

}