package org.springframework.boot.actuate.autoconfigure.health;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HealthEndpointProperties}
 */
public class HealthEndpointProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'healthEndpointProperties'
   */
  public static BeanDefinition getHealthEndpointPropertiesBeanDefinition() {
    Class<?> beanType = HealthEndpointProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(HealthEndpointProperties::new);
    return beanDefinition;
  }
}
