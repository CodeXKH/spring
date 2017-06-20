package com.xkh.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * 异常处理类
 * ErrorExceptionHandler
 * 创建人:何雪平 
 * 时间：2017年1月7日-下午3:56:52 
 * @version 1.0.0
 *
 */
@ControllerAdvice
public class ErrorExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(ErrorExceptionHandler.class);

	/**
	 * 统一异常处理
	 * com.xkh.exception 
	 * 方法名：processException
	 * 创建人：何雪平 
	 * 时间：2017年1月7日-下午3:56:45 
	 * @param exception
	 * @return ModelAndView
	 * @exception 
	 * @since  1.0.0
	 */
	@ExceptionHandler({ RuntimeException.class })
	@ResponseStatus(HttpStatus.OK)
	public ModelAndView processException(RuntimeException exception) {
		ModelAndView m = new ModelAndView();
		m.addObject("roncooException", exception.getMessage());
		m.setViewName("error/500");
		logger.info(exception.getMessage()+"=================");
		return m;
	}

	/**
	 * 统一异常处理
	 * com.xkh.exception 
	 * 方法名：processException
	 * 创建人：何雪平 
	 * 时间：2017年1月7日-下午3:56:37 
	 * @param exception
	 * @return ModelAndView
	 * @exception 
	 * @since  1.0.0
	 */
	@ExceptionHandler({ Exception.class })
	@ResponseStatus(HttpStatus.OK)
	public ModelAndView processException(Exception exception) {
		ModelAndView m = new ModelAndView();
		m.addObject("roncooException", exception.getMessage());
		m.setViewName("error/500");
		logger.info(exception.getMessage()+"=================");
		return m;
	}

	// 这种处理方法，会造成对js，css等资源的过滤，不推荐
	/*
	 * @ExceptionHandler(value = NoHandlerFoundException.class) public
	 * ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e)
	 * throws Exception { ModelAndView mav = new ModelAndView();
	 * mav.addObject("exception", e); mav.addObject("url", req.getRequestURL());
	 * mav.setViewName("error/404"); return mav; }
	 */
}
