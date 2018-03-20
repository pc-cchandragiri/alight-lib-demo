package com.example.demo;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.personalcapital.alight.dataapi.client.ApiClient;
import com.personalcapital.alight.dataapi.controller.AlightPersonPlanDcControllerApi;
import com.personalcapital.alight.dataapi.model.AlightPersonPlanDCAccountResource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath("http://localhost:8080");
		AlightPersonPlanDcControllerApi client = new AlightPersonPlanDcControllerApi(apiClient);
		
		DateTimeFormatter DATEFORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		List<AlightPersonPlanDCAccountResource> result = client
				.getPlanSnapshotHistoriesByMoneyTypesUsingGET(558111l, 9036342l, 0,
						"2018-01-01", "2018-04-01");
		System.out.println("");
	}

}
