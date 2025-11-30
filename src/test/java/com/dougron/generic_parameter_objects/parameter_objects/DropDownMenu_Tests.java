package com.dougron.generic_parameter_objects.parameter_objects;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.dougron.generic_parameter_objects.parameter_objects.drop_down_menu.DropDownMenu;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class DropDownMenu_Tests {

	@Test
	void when_no_width_is_set_then_width_in_json_is_null() {
		DropDownMenu ddm = DropDownMenu.builder()
				.id("drop_down_menu_0")
				.build();
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonString = "";
		try {
			jsonString = objectMapper.writeValueAsString(ddm);
			System.out.println(jsonString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertThat(jsonString).contains("\"width\":null");
	}

}
