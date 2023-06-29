package com.example.shopspring.Security.Ajaxlist;

import com.example.shopspring.Dto.MemberDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AjaxLoginProcessingFilter extends AbstractAuthenticationProcessingFilter {

    private ObjectMapper objectMapper = new ObjectMapper();

    protected AjaxLoginProcessingFilter() {
        super(new AntPathRequestMatcher("/api/login"));
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {

        if(isAjax(request)){
            throw new IllegalStateException("ajax 인증 발급에 실패했습니다");
        }

        MemberDto memberDto = objectMapper.readValue(request.getReader(), MemberDto.class);
        if(StringUtils.isEmpty(memberDto.getUername()) || StringUtils.isEmpty(memberDto.getPassword())){
            throw new IllegalArgumentException("username or Password is empty");
        }

        return null;
    }

    private boolean isAjax(HttpServletRequest request) {

        if("XMLHttpRequest".equals(request.getHeader("X-Requested-With"))){
            return true;
        }
        return false;
    }

}
