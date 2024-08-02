package Com.Example.Demo.Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Payment {
	
	
	private int id;
	
	private String payStatus;

}
