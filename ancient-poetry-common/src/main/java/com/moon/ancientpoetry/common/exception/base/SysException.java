package com.moon.ancientpoetry.common.exception.base;

@SuppressWarnings("serial")
public class SysException extends BaseException
{

	public SysException()
	{
		super();
	}

	public SysException(Exception exception)
	{
		super(exception);
	}

	public SysException(String msg)
	{
		super(msg);
	}

	public SysException(String msg, Exception e)
	{
		super(msg, e);
	}
}