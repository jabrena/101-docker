package org.springframework.boot.actuate.autoconfigure.health;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HealthEndpointAutoConfiguration}
 */
public class HealthEndpointAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'healthEndpointAutoConfiguration'
   */
  public static BeanDefinition getHealthEndpointAutoConfigurationBeanDefinition() {
    Class<?> beanType = HealthEndpointAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(HealthEndpointAutoConfiguration::new);
    return beanDefinition;
  }
}
