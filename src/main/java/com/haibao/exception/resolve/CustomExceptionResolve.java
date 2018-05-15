package com.haibao.exception.resolve;

import com.haibao.exception.NoSuchResourceException;
import com.haibao.exception.UnknownException;
import com.haibao.system.domain.enums.ResultCode;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: caot
 * @Date: 2018/4/27 0027 上午 9:24
 */
@Component
public class CustomExceptionResolve implements HandlerExceptionResolver {

    private static String errorPage = "error/error";

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse, Object o, Exception ex) {

        ex.printStackTrace();
        ModelAndView mav = new ModelAndView(errorPage);
        if (ex instanceof AuthorizationException) {
            mav.addObject("code", ResultCode.ERROR_403.code());
            mav.addObject("mag", ResultCode.ERROR_403.msg());
            return mav;
        }
        // 参数异常
        if (ex instanceof NoSuchResourceException) {
            mav.addObject("code", ResultCode.ERROR_404.code());
            mav.addObject("msg", ResultCode.ERROR_404.msg());
            return mav;
        }
        // 未知异常
        if (ex instanceof UnknownException) {
            mav.addObject("code", ResultCode.ERROR_500.code());
            mav.addObject("msg", ResultCode.ERROR_500.msg());
            return mav;
        }

        mav.addObject("code", ResultCode.ERROR_500.code());
        mav.addObject("msg", ResultCode.ERROR_500.msg());
        return mav;
    }
}