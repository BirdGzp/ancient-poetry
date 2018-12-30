package com.moon.ancientpoetry.common.dto;

import com.alibaba.fastjson.JSON;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/27 20:02
 * @Description:
 */
public class BaseDto<T> {
    /**
     * 对象类型
     * 1 普通对象
     * 2 list对象
     */
    private Byte objectType;

    /**
     * 对象的类名
     */
    private String className;

    /**
     * 传输对象
     */
    private T object;

    public BaseDto(Byte objectType) {
        this.objectType = objectType;
        objectType = null;
        className = null;
    }

    public BaseDto(Byte objectType, String className, T object) {
        this.objectType = objectType;
        this.className = className;
        this.object = object;
    }

    public BaseDto(Byte objectType, T object) {
        this.objectType = objectType;
        this.object = object;
        this.className = object.getClass().getName();
    }

    public Byte getObjectType() {
        return objectType;
    }

    public void setObjectType(Byte objectType) {
        this.objectType = objectType;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "BaseDto{" +
                "objectType=" + objectType +
                ", className='" + className + '\'' +
                ", object=" + object +
                '}';
    }

    /**
     * 通过classType 解析后的对象
     * @return
     */
    public T parseObject(){
        if(className == null){
            return null;
        }
        Class clazz = null;
        try {
            clazz = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if(clazz == null){
            return null;
        }
        return (T) JSON.parseObject(object.toString(), clazz);
    }
}