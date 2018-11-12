package com.baizhi.exceptionresolver;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常处理器
 *
 */
public class GlobalExceptionResolver implements HandlerExceptionResolver {

	//注意: 任何一个控制器抛出了异常都会自动进入resolveException这个方法
	public ModelAndView resolveException(HttpServletRequest request,
										 HttpServletResponse response, Object method, Exception exec) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(exec.getMessage());
		modelAndView.setViewName("back/500");
		modelAndView.addObject("message", exec.getMessage());

		return modelAndView;
	}




}
