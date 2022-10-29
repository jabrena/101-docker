package org.springframework.boot.actuate.autoconfigure.metrics.export.prometheus;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PrometheusProperties}
 */
public class PrometheusProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'prometheusProperties'
   */
  public static BeanDefinition getPrometheusPropertiesBeanDefinition() {
    Class<?> beanType = PrometheusProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(PrometheusProperties::new);
    return beanDefinition;
  }
}
