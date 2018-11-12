package com.baizhi.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * 自定义拦截器
 *
 *   1.preHandle 			预先处理
 *   2.postHandler 			过程中处理
 *   3.afterCompletion      后置处理
 *
 *   说明:  1.当请求到达是会优先进入拦截器中preHanlder这个方法  这个方法有一个返回值  true false
 *   	   2.当preHandler方法中返回值为true  放行当前请求      false中断当前请求
 *         3.如果preHandler返回true 放行请求 请求会进入当前请求的controller中方法执行当前请求方法
 *         4.当控制器方法执行完成后请求会进入拦截器中postHandler这个方法,执行postHandler方法中内容,
 *         5.执行完成postHandler中的内容进行页面渲染(跳转页面,跳转控制器)
 *         6.当响应彻底完成之后,或者是controller方法出现异常是会执行afterCompletion   相当于finally代码块
 *
 */
public class MyInterceptor implements HandlerInterceptor {

	//参数1:当前请求对象   //参数2:当前响应对象     //参数3:当前请求的方法对象
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
							 Object method) throws Exception {
		System.out.println("==========1============");//强制用户登陆
		Object o = request.getSession().getAttribute("admin");
		if(o==null){
			//跳转到登陆页面
			response.sendRedirect(request.getContextPath()+"/back/login.jsp");
			return false;
		}
		return true;//true 放行  false 中断
	}

	//参数1:当前请求对象   //参数2:当前响应对象     //参数3:当前请求的方法对象   //参数4: ModelAndView 当前控制器封装ModelAndView对象
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
						   Object method, ModelAndView mv) throws Exception {
		System.out.println("==========3============");
		mv.addObject("date", new Date());

	}

	//参数1:当前请求对象   //参数2:当前响应对象     //参数3:当前请求的方法对象 //参数4:当前控制器出现异常的异常对象
	public void afterCompletion(HttpServletRequest request,
								HttpServletResponse response, Object object, Exception exce)
			throws Exception {
		System.out.println("==========4============");
		//System.out.println("当前异常信息: "+exce.getMessage());
	}





}
