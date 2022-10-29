package org.springframework.boot.actuate.autoconfigure.observation;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ObservationProperties}
 */
public class ObservationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'observationProperties'
   */
  public static BeanDefinition getObservationPropertiesBeanDefinition() {
    Class<?> beanType = ObservationProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ObservationProperties::new);
    return beanDefinition;
  }
}
