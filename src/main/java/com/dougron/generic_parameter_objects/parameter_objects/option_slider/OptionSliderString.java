package com.dougron.generic_parameter_objects.parameter_objects.option_slider;

import java.util.List;

import com.dougron.generic_parameter_objects.parameter_objects.ParameterObject;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
public class OptionSliderString implements ParameterObject<String> {

	private String id;
	private String parameter;
	
	private final String type = "option_slider";
	
	// initialValue is ahere to satisfy ParameterObject
	private transient String initialValue;
	
	@JsonProperty("initial_value")
	private int initialIndex;
	
	private List<String> options;
	@JsonProperty("option_colors")
	private List<String> optionColors;
	
	private String name;
//	private String abbreviated_name;
	
	private String width;
	
	@JsonProperty("sort_tags")
	@Singular private List<String> sortTags;
	

}