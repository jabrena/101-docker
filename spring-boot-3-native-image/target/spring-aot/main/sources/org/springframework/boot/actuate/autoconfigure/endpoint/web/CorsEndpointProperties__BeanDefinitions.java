package org.springframework.boot.actuate.autoconfigure.endpoint.web;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CorsEndpointProperties}
 */
public class CorsEndpointProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'corsEndpointProperties'
   */
  public static BeanDefinition getCorsEndpointPropertiesBeanDefinition() {
    Class<?> beanType = CorsEndpointProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(CorsEndpointProperties::new);
    return beanDefinition;
  }
}
