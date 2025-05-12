package com.example.myapplication;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
class MyapplicationApplicationTests {

	/*@Test
	void createApplicationModuleModel() {
		ApplicationModules modules = ApplicationModules.of(MyapplicationApplication.class);
		modules.forEach(System.out::println);
	}*/

	@Test
	void verifiesModularStructure() {
		ApplicationModules modules = ApplicationModules.of(MyapplicationApplication.class);
		modules.verify();
	}

}
