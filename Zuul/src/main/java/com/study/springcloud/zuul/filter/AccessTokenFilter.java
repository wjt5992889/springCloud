package com.study.springcloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

/**
 * 对于组件zuul中，其实带有权限认证的功能，那就是ZuulFilter过滤器。
 * ZuulFilter是Zuul中核心组件，通过继承该抽象类，覆写几个关键方法达到自定义调度请求的作用。
 *
 * filterOrder: filter执行顺序，通过数字指定
 * shouldFilter: filter是否需要执行 true执行 false 不执行
 * run : filter具体逻辑
 * filterType : filter类型,分为pre、error、post、 route
 *  pre:请求执行之前filter
 *  route: 处理请求，进行路由
 *  post: 请求处理完成后执行的filter
 *  error:出现错误时执行的filter
 */
public class AccessTokenFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";//前置过滤器
    }

    @Override
    public int filterOrder() {
        return 0;//优先级为0，数字越大，优先级越低
    }

    @Override
    public boolean shouldFilter() {
        return true;//是否执行该过滤器，此处为true，说明需要过滤
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String username = request.getParameter("token");
        if (null != username && username.equals("ttt")) {//暂时简单化测试
            ctx.setSendZuulResponse(true);// 对该请求进行路由
            ctx.setResponseStatusCode(200);
            ctx.set("isSuccess", true);// 设值，可以在多个过滤器时使用
            return null;
        } else {
            ctx.setSendZuulResponse(false);// 过滤该请求，不对其进行路由
            ctx.setResponseStatusCode(403);// 返回错误码
            ctx.setResponseBody("{\"result\":\"Request illegal!the token is null\"}");// 返回错误内容
            ctx.set("isSuccess", false);
            return null;
        }
    }
}
