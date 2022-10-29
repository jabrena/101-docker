package org.springframework.boot.actuate.autoconfigure.metrics.integration;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link IntegrationMetricsAutoConfiguration}
 */
public class IntegrationMetricsAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'integrationMetricsAutoConfiguration'
   */
  public static BeanDefinition getIntegrationMetricsAutoConfigurationBeanDefinition() {
    Class<?> beanType = IntegrationMetricsAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(IntegrationMetricsAutoConfiguration::new);
    return beanDefinition;
  }
}
