package com.tnsif.DI_ioc_Qualifier_project_6;

import org.springframework.stereotype.Component;

@Component
public class Groscery implements Ordering {
	
	public void order() {
		System.out.println("Ordering grocery Products...");
	}
	

}