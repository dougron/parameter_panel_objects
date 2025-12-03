package com.dougron.generic_parameter_objects.parameter_objects.panel_in_a_panel;

import java.util.List;

import com.dougron.generic_parameter_objects.parameter_objects.ParameterObject;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
public class PanelInAPanel implements ParameterObject<List<Object>> {

	private String id;
	private String parameter;

	private final String type = "panel_in_a_panel";

	// initialValue is here to satisfy ParameterObject interface
	// For panel_in_a_panel, the value is an array of updates, not an initial value
	private transient List<Object> initialValue;

	private String name;

	@JsonProperty("sort_tags")
	@Singular private List<String> sortTags;

	@JsonProperty("parameter_sort")
	@Builder.Default private String parameterSort = "unsorted";

	@JsonProperty("sort_tag_names")
	@Singular private List<String> sortTagNames;

	@Singular private List<ParameterObject> parameters;

	@JsonProperty("allowSorting")
	@Builder.Default private Boolean allowSorting = false;
}
