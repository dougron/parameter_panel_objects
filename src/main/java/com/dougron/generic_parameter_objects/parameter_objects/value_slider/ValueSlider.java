package com.dougron.generic_parameter_objects.parameter_objects.value_slider;

import java.util.List;

import com.dougron.generic_parameter_objects.parameter_objects.ParameterObject;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
public class ValueSlider implements ParameterObject<Double> {
	
	private String id;
	private String parameter;

	private final String type = "value_slider";
	
	@JsonProperty("initial_value")
	@Builder.Default private Double initialValue = 0.0;
	
	private String name;
	
	@JsonProperty("sort_tags")
	@Singular private List<String> sortTags;
	
	@Builder.Default private Double min = 0.0;
	@Builder.Default private Double max = 100.0;
	@Builder.Default private Double step = 1.0;
	@Builder.Default private Object marks = false;
}
