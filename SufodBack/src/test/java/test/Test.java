package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sufod.config.AppConfig;
import sufod.spring.Fabien;

public class Test {
	
	
		public static void main(String[] args) {
			AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
			ctx.getBeanFactory().createBean(Fabien.class).run();	
			ctx.close();
		}
		
		
	}


