package info.jab.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
public class MainApplication {
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(MainApplication.class, args);
		//displayAllBeans();
	}

	public static void displayAllBeans() {
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
		AtomicInteger counter = new AtomicInteger(1);
		String SPACE = " ";

		Arrays.stream(allBeanNames)
				.sorted()
				.map(beanName -> {
					return new StringBuilder()
							.append(counter.getAndIncrement())
							.append(SPACE)
							.append(beanName)
							.toString();
				})
				.forEach(System.out::println);
	}

}
