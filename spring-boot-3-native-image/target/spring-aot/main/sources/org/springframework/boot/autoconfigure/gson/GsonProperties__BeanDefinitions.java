package org.springframework.boot.autoconfigure.gson;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link GsonProperties}
 */
public class GsonProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'gsonProperties'
   */
  public static BeanDefinition getGsonPropertiesBeanDefinition() {
    Class<?> beanType = GsonProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(GsonProperties::new);
    return beanDefinition;
  }
}
