package Com.Example.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Com.Example.Demo.Entity.OrderEntity;
import Com.Example.Demo.Entity.Payment;

@SpringBootApplication
public class SpringBootLombokProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLombokProjectApplication.class, args);
		
		
		/*
		OrderEntity orderEntity = new OrderEntity();
		
		orderEntity.setId(1);
		orderEntity.setOrderName("Pizza");
		orderEntity.setOrderStatus("Deliver");
		orderEntity.setOrderType("online");
		orderEntity.setOrderAddress("Punawale");
		
		System.out.println(orderEntity);
		*/
		
		
		//Create Builder method 
		
	OrderEntity orderEntity =	OrderEntity.builder()
										   .id(2)
										   .orderName("Pizza")
										   .orderType("Online")
										   .orderStatus("Deliver")
										   .orderAddress("Exponent")
										   .payment(Payment.builder().id(374).payStatus("Success").build())
										   .build();
		
	System.out.println(orderEntity);	
	
	
	}

}
