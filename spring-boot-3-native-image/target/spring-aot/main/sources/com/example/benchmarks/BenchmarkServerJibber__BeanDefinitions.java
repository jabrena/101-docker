package com.example.benchmarks;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link BenchmarkServerJibber}
 */
public class BenchmarkServerJibber__BeanDefinitions {
  /**
   * Get the bean definition for 'benchmarkServerJibber'
   */
  public static BeanDefinition getBenchmarkServerJibberBeanDefinition() {
    Class<?> beanType = BenchmarkServerJibber.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(BenchmarkServerJibber.class);
    beanDefinition.setInstanceSupplier(BenchmarkServerJibber$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
