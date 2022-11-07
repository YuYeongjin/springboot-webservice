package com.book.springboot.oauthlogin.oauth.info;

import com.book.springboot.oauthlogin.oauth.entity.ProviderType;
import com.book.springboot.oauthlogin.oauth.info.in.GoogleOAuth2UserInfo;
import com.book.springboot.oauthlogin.oauth.info.in.NaverOAuth2UserInfo;

import java.util.Map;

public class OAuth2UserInfoFactory {
    public static OAuth2UserInfo getOAuth2UserInfo(ProviderType providerType, Map<String, Object> attributes) {
        switch (providerType) {
            case GOOGLE: return new GoogleOAuth2UserInfo(attributes);
            case NAVER: return new NaverOAuth2UserInfo(attributes);
            default: throw new IllegalArgumentException("Invalid Provider Type.");
        }
    }
}