package com.moon.ancientpoetry.common.exception.base;

/**
 * <p>
 * 通用的数据库访问异常类,封装了底层JDBC异常的信息
 * <p>
 * <p>
 * 该异常不强制捕捉, 使用者可自行选择是否处理该异常
 * </p>
 * 
 * @author michael lian
 *
 */
@SuppressWarnings("serial")
public class BaseException extends RuntimeException
{

	public BaseException()
	{
		super();
	}

	public BaseException(Throwable cause)
	{
		super(cause);
	}

	public BaseException(String msg)
	{
		super(msg);
	}

	public BaseException(String msg, Throwable cause)
	{
		super(msg, cause);
	}

	/**
	 * 获取异常的完整描述信息
	 * 
	 * @return 异常的完整描述信息
	 */
	public String getMessage()
	{
		return buildMessage(super.getMessage(), getCause());
	}

	/**
	 * 获得嵌套的根异常对象
	 * 
	 * @return 根异常对象,如果没有,则返回<code>null<code>
	 */
	public Throwable getRootCause()
	{
		Throwable rootCause = null;
		Throwable cause = getCause();
		while (cause != null && cause != rootCause)
		{
			rootCause = cause;
			cause = cause.getCause();
		}
		return rootCause;
	}

	/**
	 * <p>
	 * 获得嵌套的根异常对象,如果没有,则返回自身
	 * </p>
	 * <p> 
	 * 与getRuutCause不同之处在于,如果没有根异常对象的话,则返回该异常本身
	 * </p>
	 * @return 最里层的异常对象,如果没有,则返回自身(不可能返回<code>null</code>)
	 */
	public Throwable getMostSpecificCause()
	{
		Throwable rootCause = getRootCause();
		return (rootCause != null ? rootCause : this);
	}

	/**
	 * 检查异常中是否包含给定类型的异常, 这个异常有可能是本身或者嵌套异常链中的一个
	 * 
	 * @param exType
	 *            待检查的异常类型
	 * @return 异常链中是否存在给定类型的异常
	 */
	public boolean contains(Class<?> exType)
	{
		if (exType == null)
		{
			return false;
		}

		// 如果类型是该异常本身,返回true
		if (exType.isInstance(this))
		{
			return true;
		}

		// 获得嵌套的异常
		Throwable cause = getCause();
		if (cause == this)
		{
			return false;
		}

		// 查询嵌套异常链中是否存在待检查类型的异常
		if (cause instanceof BaseException)
		{
			return ((BaseException) cause).contains(exType);
		}
		else
		{
			while (cause != null)
			{
				if (exType.isInstance(cause))
				{
					return true;
				}
				if (cause.getCause() == cause)
				{
					break;
				}
				cause = cause.getCause();
			}
			return false;
		}
	}

	/**
	 * 格式化异常信息
	 * 
	 * @param message
	 *            待处理的异常信息
	 * @param cause
	 *            异常根源
	 * @return 完整的异常信息
	 */
	private static String buildMessage(String message, Throwable cause)
	{
		if (cause != null)
		{
			StringBuffer buf = new StringBuffer();
			if (message != null)
			{
				buf.append(message).append("; ");
			}
			buf.append("nested exception is ").append(cause);
			return buf.toString();
		}
		else
		{
			return message;
		}
	}
}
