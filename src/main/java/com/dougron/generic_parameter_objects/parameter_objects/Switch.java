package com.dougron.generic_parameter_objects.parameter_objects;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
public class Switch implements ParameterObject<Boolean> {
	
	private String id;
	private String parameter;
	
	private final String type = "switch";
	
	@JsonProperty("initial_value")
	@Builder.Default private Boolean initialValue = false;
	
	private String name;
	
	@JsonProperty("sort_tags")
	@Singular private List<String> sortTags;
	
//	private final Boolean[] options = new Boolean[] {true, false};
	
	
}
