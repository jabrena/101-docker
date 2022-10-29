package org.springframework.boot.actuate.autoconfigure.system;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DiskSpaceHealthIndicatorProperties}
 */
public class DiskSpaceHealthIndicatorProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'diskSpaceHealthIndicatorProperties'
   */
  public static BeanDefinition getDiskSpaceHealthIndicatorPropertiesBeanDefinition() {
    Class<?> beanType = DiskSpaceHealthIndicatorProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(DiskSpaceHealthIndicatorProperties::new);
    return beanDefinition;
  }
}
