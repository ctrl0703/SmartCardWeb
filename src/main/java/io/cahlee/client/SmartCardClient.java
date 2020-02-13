package io.cahlee.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="smartcard-service", url="localhost:8080")
public interface SmartCardClient {

	@RequestMapping("/smartcards")
	public List<SmartCard> smartCardList();
	
	@RequestMapping("/smartcard/{smartCardId}")
	public SmartCard smartCard(@PathVariable Long smartCardId);
}
