package com.jobready.Condition;

@FunctionalInterface
public interface CheckingCondition {

	public boolean test(Person p);
}
