package org.springframework.boot.autoconfigure.web.servlet;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link WebMvcProperties}
 */
public class WebMvcProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'webMvcProperties'
   */
  public static BeanDefinition getWebMvcPropertiesBeanDefinition() {
    Class<?> beanType = WebMvcProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(WebMvcProperties::new);
    return beanDefinition;
  }
}
