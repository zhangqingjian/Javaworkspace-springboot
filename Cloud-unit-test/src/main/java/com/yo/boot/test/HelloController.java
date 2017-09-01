/**
 * 
 */
package com.yo.boot.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 */
/**
 * @author JAN
 * @CreatedTime：2017年7月6日 下午4:01:17 说明：
 */

@RestController
public class HelloController {
 
	
	@Autowired
	private BlogProperties blogProperties;
	@RequestMapping("/hello")
	public String index() {
		 
//		return blogProperties.getName();
		return "jan4";
	}
	 
}                  