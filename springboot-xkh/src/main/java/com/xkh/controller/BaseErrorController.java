package com.xkh.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 404访问错误控制层
 * BaseErrorController
 * 创建人:何雪平 
 * 时间：2017年1月9日-上午9:56:37 
 * @version 1.0.0
 *
 */
@Controller
public class BaseErrorController implements ErrorController {

	private static final String ERROR_PATH = "/error";

	@RequestMapping(value = ERROR_PATH)
	public String handleError() {
		return "error/404";
	}

	@Override
	public String getErrorPath() {
		return ERROR_PATH;
	}
}
