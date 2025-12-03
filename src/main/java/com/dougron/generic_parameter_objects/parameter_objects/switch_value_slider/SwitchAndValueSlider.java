package com.dougron.generic_parameter_objects.parameter_objects.switch_value_slider;

import java.util.List;

import com.dougron.generic_parameter_objects.parameter_objects.ParameterObject;
import com.dougron.generic_parameter_objects.parameter_objects.value_slider.ValueSliderMark;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
public class SwitchAndValueSlider implements ParameterObject<Object> {

	private String id;
	private String parameter;

	private final String type = "switch_value_slider";

	// initialValue is here to satisfy ParameterObject interface
	private transient Object initialValue;

	@JsonProperty("initial_switch_value")
	@Builder.Default private Boolean initialSwitchValue = false;

	@JsonProperty("initial_slider_value")
	@Builder.Default private Double initialSliderValue = 0.0;

	private String name;

	@JsonProperty("sort_tags")
	@Singular private List<String> sortTags;

	@Builder.Default private Double min = 0.0;
	@Builder.Default private Double max = 100.0;
	@Builder.Default private Double step = 1.0;

	@JsonProperty("switch_label")
	private String switchLabel;

	@JsonProperty("slider_label")
	private String sliderLabel;

	private Object marks;
}
