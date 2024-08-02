package Com.Example.Demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data       // all Combination annotation one annotation work on @Data

/*
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
*/

@Data
@Builder
public class OrderEntity {
	
	private int id;
	
	private String orderName;
	
	private String orderType;
	
	private String orderStatus;
	
	private String orderAddress;
	
	private Payment payment;          // Aggregation -Has-A Relation
	

}
