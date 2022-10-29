package org.springframework.boot.actuate.autoconfigure.metrics;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CompositeMeterRegistryAutoConfiguration}
 */
public class CompositeMeterRegistryAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'compositeMeterRegistryAutoConfiguration'
   */
  public static BeanDefinition getCompositeMeterRegistryAutoConfigurationBeanDefinition() {
    Class<?> beanType = CompositeMeterRegistryAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(CompositeMeterRegistryAutoConfiguration::new);
    return beanDefinition;
  }
}
