package com.dougron.generic_parameter_objects.parameter_objects.list_of;

import java.util.List;

import com.dougron.generic_parameter_objects.parameter_objects.ParameterObject;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
public class ListOfDropDownMenus implements ParameterObject<List<String>>{
	
	private String id;
	private String parameter;
	
	private final String type = "list_of_drop_downs";
	
	@JsonProperty("initial_value")
	private List<String> initialValue;
	
	
	private List<String> options;
	
	private String name;
	
	private String width;
	
	@JsonProperty("sort_tags")
	@Singular private List<String> sortTags;
	
	@JsonProperty("allow_add_and_delete")
	@Builder.Default boolean allowAddAndDelete = true;
}
