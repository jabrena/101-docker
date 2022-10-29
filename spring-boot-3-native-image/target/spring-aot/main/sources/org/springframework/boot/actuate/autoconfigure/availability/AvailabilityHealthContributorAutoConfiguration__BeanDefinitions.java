package org.springframework.boot.actuate.autoconfigure.availability;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AvailabilityHealthContributorAutoConfiguration}
 */
public class AvailabilityHealthContributorAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'availabilityHealthContributorAutoConfiguration'
   */
  public static BeanDefinition getAvailabilityHealthContributorAutoConfigurationBeanDefinition() {
    Class<?> beanType = AvailabilityHealthContributorAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(AvailabilityHealthContributorAutoConfiguration::new);
    return beanDefinition;
  }
}
