package com.moon.ancientpoetry.common.exception.base;

/**
 * @Title:ApiException.java
 * @Package:com.netease.epay.api.constant
 * @Description:Api异常类
 * @author:hzlihonglin
 * @time:2016年3月10日 下午3:02:01
 */
public class ApiException extends RuntimeException
{
	public ApiException(String msg)
	{
		super(msg);
	}
}