package org.springframework.boot.actuate.autoconfigure.observation.web.client;

import io.micrometer.observation.ObservationRegistry;
import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;
import org.springframework.boot.actuate.autoconfigure.observation.ObservationProperties;
import org.springframework.boot.actuate.metrics.web.client.ObservationRestTemplateCustomizer;

/**
 * Bean definitions for {@link RestTemplateObservationConfiguration}
 */
public class RestTemplateObservationConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'restTemplateObservationConfiguration'
   */
  public static BeanDefinition getRestTemplateObservationConfigurationBeanDefinition() {
    Class<?> beanType = RestTemplateObservationConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(RestTemplateObservationConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'observationRestTemplateCustomizer'.
   */
  private static BeanInstanceSupplier<ObservationRestTemplateCustomizer> getObservationRestTemplateCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ObservationRestTemplateCustomizer>forFactoryMethod(RestTemplateObservationConfiguration.class, "observationRestTemplateCustomizer", ObservationRegistry.class, ObservationProperties.class, MetricsProperties.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RestTemplateObservationConfiguration.class).observationRestTemplateCustomizer(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'observationRestTemplateCustomizer'
   */
  public static BeanDefinition getObservationRestTemplateCustomizerBeanDefinition() {
    Class<?> beanType = ObservationRestTemplateCustomizer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getObservationRestTemplateCustomizerInstanceSupplier());
    return beanDefinition;
  }
}
