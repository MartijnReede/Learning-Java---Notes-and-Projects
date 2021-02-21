package com.jobready.genericfunctionalinterfaces;

@FunctionalInterface
public interface ConditionChecker<T> {
	public boolean check(T t);

}
