package sonar.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultPageController {
	
	public void getDefaultPage() {
		
		List<String> lstStrings = new ArrayList<>();
		lstStrings.stream().filter(item -> "a".equalsIgnoreCase(item)).collect(Collectors.toList());
		
	}

}
