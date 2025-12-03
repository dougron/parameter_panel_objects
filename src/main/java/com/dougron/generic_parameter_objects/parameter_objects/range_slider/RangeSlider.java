package com.dougron.generic_parameter_objects.parameter_objects.range_slider;

import java.util.List;

import com.dougron.generic_parameter_objects.parameter_objects.ParameterObject;
import com.dougron.generic_parameter_objects.parameter_objects.value_slider.ValueSliderMark;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
public class RangeSlider implements ParameterObject<List<Double>> {

	private String id;
	private String parameter;

	private final String type = "range_slider";

	// initialValue is here to satisfy ParameterObject interface
	private transient List<Double> initialValue;

	@JsonProperty("initial_value_low")
	@Builder.Default private Double initialValueLow = 0.0;

	@JsonProperty("initial_value_high")
	@Builder.Default private Double initialValueHigh = 100.0;

	private String name;

	@JsonProperty("sort_tags")
	@Singular private List<String> sortTags;

	@Builder.Default private Double min = 0.0;
	@Builder.Default private Double max = 100.0;
	@Builder.Default private Double step = 1.0;

	@Singular private List<ValueSliderMark> marks;

	@JsonProperty("decimal_places")
	private Integer decimalPlaces;
}
