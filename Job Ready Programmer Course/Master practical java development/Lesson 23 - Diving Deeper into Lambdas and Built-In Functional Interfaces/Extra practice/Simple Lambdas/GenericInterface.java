package com.jobready.simpleLambdas;

@FunctionalInterface
public interface GenericInterface<T> {
	
	public T getResult(T t);

}
