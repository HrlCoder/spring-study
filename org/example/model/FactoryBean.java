package org.example.model;

public interface FactoryBean<T> {

    //返回的对象实例
    T getObject() throws Exception;

    //Bean的类型
    Class<?> getObjectType();

    //是否是单例的Bean对象，不实现该接口方法默认为单例
    default boolean isSingleton() {
        return true;
    }

}
