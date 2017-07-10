/**
 * 
 */
package com.yo.boot.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 */
/**
 * @author JAN
 * @CreatedTime：2017年7月6日 下午4:32:36 说明：
 */
@Component
public class BlogProperties
{
	@Value("${name}")
	private String name;
	@Value("${title}")
	private String title;
	// 省略getter和setter
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
}
