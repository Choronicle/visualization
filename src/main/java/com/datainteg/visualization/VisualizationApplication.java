package com.datainteg.visualization;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.datainteg.visualization.mbg.mapper")
public class VisualizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisualizationApplication.class, args);
	}

}
