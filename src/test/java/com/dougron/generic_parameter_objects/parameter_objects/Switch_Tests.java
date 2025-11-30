package com.dougron.generic_parameter_objects.parameter_objects;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Switch_Tests {

	@Test
	void test() {
		ParameterObject po = Switch.builder().name("switch").build();
		assertThat(po.getName()).isEqualTo("switch");
	}
	
	@Test
	void parameters_are_accessible() {
		Switch x = Switch.builder().name("switch").build();
		assertThat(x.getInitialValue()).isFalse();
	}

}
