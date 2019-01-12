package com.moon.ancientpoetry.common.exception.base;

@SuppressWarnings("serial")
public class AppException extends BaseException
{
	public String msgType = "";

	public AppException()
	{
		super();
	}

	public AppException(Exception exception)
	{
		super(exception);
	}

	public AppException(String msg)
	{
		super(msg);
		msgType = msg;
	}

	public AppException(String msg, Exception e)
	{
		super(msg, e);
	}
}
