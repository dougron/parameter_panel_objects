package com.dougron.generic_parameter_objects;

import java.util.ArrayList;
import java.util.List;

import com.dougron.generic_parameter_objects.parameter_objects.ParameterObject;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Builder
@Data
public class ParameterSet {
	
	private String name;
	private String sort_selection;
	@Singular private List<ParameterObject> parameters;
	@Singular private List<String> sort_tag_names;

	
	public void makeParameterIds() {
		int i = 0;
		for (ParameterObject po: parameters) {
			po.setId(po.getName().replace(" ", "_") + i);
			i++;
		}
	}
	
	
	public void addParameterObject(ParameterObject po) {
		parameters.add(po);
	}

}
