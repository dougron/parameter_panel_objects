package com.dougron.generic_parameter_objects.parameter_objects.list_of;

import java.util.List;

import com.dougron.generic_parameter_objects.parameter_objects.ParameterObject;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
public class ListOfValueSliders implements ParameterObject<List<Double>> {

	private String id;
	private String parameter;

	private final String type = "list_of_value_sliders";

	@JsonProperty("initial_value")
	private List<Double> initialValue;

	private String name;

	@JsonProperty("sort_tags")
	@Singular private List<String> sortTags;

	@Builder.Default private Double min = 0.0;
	@Builder.Default private Double max = 100.0;
	@Builder.Default private Double step = 1.0;

	@JsonProperty("max_list_length")
	@Builder.Default private Integer maxListLength = 5;

	@JsonProperty("allow_add_and_delete")
	@Builder.Default boolean allowAddAndDelete = true;
}
