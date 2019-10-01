package ma.jit.First_Spring_Project;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ma.jit.First_Spring_Project.model.Chambre;
import ma.jit.First_Spring_Project.model.Duplex;
import ma.jit.First_Spring_Project.model.Hotel;

@Configuration
@ComponentScan(basePackages = "ma.jit.First_Spring_Project.model")
public class AppConfig {

//	@Bean
//	public Hotel getHotel() {
//		return new Hotel();
//	}
//	@Bean
//	public Chambre getChambre() {
//		return new Chambre();
//	}
//	@Bean
//	public Duplex getDuplex() {
//		return new Duplex();
//	}
}
