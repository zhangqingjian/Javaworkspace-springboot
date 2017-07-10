/**
 * 
 */
package com.yo.boot.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
 

/**
 */
/**
 * @author  JAN   
 * @CreatedTime：2017年7月6日 下午5:44:44
 * 说明：
 */

@RestController
public class HomeController
{
	
	 private static final Log log = LogFactory.getLog(HomeController.class);
	    @Autowired
	    private RestTemplate restTemplate;
	     
	    private String url="http://localhost:9986";
	 
	    @RequestMapping("/service1")
	    public String service1() throws Exception {
	        log.info("service1");
	        Thread.sleep(200L);
	        String s = this.restTemplate.getForObject(url + "/service2", String.class);
	        return s;
	    }  
}
