
package com.xkh.controller;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/*
 *  文件上传
    * @ClassName: UploadController
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author jbwl
    * @date 2017年1月6日
    *
 */
@Controller
public class UploadController {

	private static final Logger logger = LoggerFactory.getLogger(UploadController.class);

	@RequestMapping(value = "upload")
	public ModelAndView upload() {
		ModelAndView mv=new ModelAndView();
		logger.info("upload"+"========");
		mv.addObject("upload","upload+++++++++++++++++++");
		return mv; 
	}

	@RequestMapping(value = "upload/file")
	@ResponseBody
	public String upload(@RequestParam("Filedata") MultipartFile file) {
		if (file.isEmpty()) {
			return "文件为空";
		}

		// 获取文件名
		String fileName = file.getOriginalFilename();
		logger.info("上传的文件名为：" + fileName);

		// 获取文件的后缀名
		String suffixName = fileName.substring(fileName.lastIndexOf("."));
		logger.info("上传的后缀名为：" + suffixName);

		// 文件上传路径
		String filePath = "d:/roncoo/ttt/";

		// 解决中文问题，liunx下中文路径，图片显示问题
		// fileName = UUID.randomUUID() + suffixName;

		File dest = new File(filePath + fileName);

		// 检测是否存在目录
		if (!dest.getParentFile().exists()) {
			dest.getParentFile().mkdirs();
		}

		try {
			file.transferTo(dest);
			return "上传成功";
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "上传失败";
	}

}
