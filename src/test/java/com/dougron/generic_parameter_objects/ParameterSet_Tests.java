package com.dougron.generic_parameter_objects;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.dougron.generic_parameter_objects.parameter_objects.Switch;
import com.google.gson.Gson;

class ParameterSet_Tests {

	@Test
	void test() {
		ParameterSet ps = ParameterSet.builder()
				.parameter(Switch.builder().name("switch").build())
				.build();
//		System.out.println(ps.toString());
		assertThat(ps.getParameters().size()).isEqualTo(1);
	}
	
	@Test
	void json_is_correct() {
		ParameterSet ps = ParameterSet.builder()
				.parameter(Switch.builder().name("switch").build())
				.build();
		System.out.println(new Gson().toJson(ps));
	}

}
