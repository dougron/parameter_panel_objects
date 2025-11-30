package com.dougron.generic_parameter_objects.parameter_objects;


public interface ParameterObject<T> {

	public String getName();
	public T getInitialValue();
	public String getId();
	public void setId(String id);
//	public T[] getOptions();
	public String getParameter();
}
