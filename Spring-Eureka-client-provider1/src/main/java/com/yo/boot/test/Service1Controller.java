/**
 * 
 */
package com.yo.boot.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 */
/**
 * @author JAN
 * @CreatedTime：2017年7月6日 下午5:44:44 说明：
 */

@RestController
public class Service1Controller
{
	@Autowired
	DiscoveryClient discoveryClient;
	private static final Log log = LogFactory.getLog(Service1Controller.class);
	@Autowired
	private RestTemplate restTemplate;

	private String url = "http://localhost:9986";
//	@Autowired
//	IFeignClient iFeignClient;
	@RequestMapping("/service1")
	public String service1() throws Exception
	{
		log.info("service1");
		 
		String s = this.restTemplate.getForObject(url + "/service2", String.class);
		return s;
	}
}
