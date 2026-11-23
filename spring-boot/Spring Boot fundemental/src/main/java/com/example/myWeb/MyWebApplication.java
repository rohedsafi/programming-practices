package com.example.myWeb;
import com.example.myWeb.model.Product;
import com.example.myWeb.services.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyWebApplication {

	public static void main(String[] args) {


		// ApplicationContext context = new AnnotationConfigApplicationContext();
		// SpringApplication.run(MyWebApplication.class, args);
		ApplicationContext context = SpringApplication.run(MyWebApplication.class, args);
		ProductService service = context.getBean(ProductService.class);
		service.addProduct(new Product(104, "OnePlus", 1200));
	}
}
