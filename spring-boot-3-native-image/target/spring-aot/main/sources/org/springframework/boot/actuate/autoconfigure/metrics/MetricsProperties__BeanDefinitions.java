package org.springframework.boot.actuate.autoconfigure.metrics;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MetricsProperties}
 */
public class MetricsProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'metricsProperties'
   */
  public static BeanDefinition getMetricsPropertiesBeanDefinition() {
    Class<?> beanType = MetricsProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(MetricsProperties::new);
    return beanDefinition;
  }
}
