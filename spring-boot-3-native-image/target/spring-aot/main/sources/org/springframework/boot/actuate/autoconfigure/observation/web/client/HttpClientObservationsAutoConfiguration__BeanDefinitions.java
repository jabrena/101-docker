package org.springframework.boot.actuate.autoconfigure.observation.web.client;

import io.micrometer.core.instrument.config.MeterFilter;
import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;
import org.springframework.boot.actuate.autoconfigure.observation.ObservationProperties;

/**
 * Bean definitions for {@link HttpClientObservationsAutoConfiguration}
 */
public class HttpClientObservationsAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'httpClientObservationsAutoConfiguration'
   */
  public static BeanDefinition getHttpClientObservationsAutoConfigurationBeanDefinition() {
    Class<?> beanType = HttpClientObservationsAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(HttpClientObservationsAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link HttpClientObservationsAutoConfiguration.MeterFilterConfiguration}
   */
  public static class MeterFilterConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'meterFilterConfiguration'
     */
    public static BeanDefinition getMeterFilterConfigurationBeanDefinition() {
      Class<?> beanType = HttpClientObservationsAutoConfiguration.MeterFilterConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(HttpClientObservationsAutoConfiguration.MeterFilterConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'metricsHttpClientUriTagFilter'.
     */
    private static BeanInstanceSupplier<MeterFilter> getMetricsHttpClientUriTagFilterInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<MeterFilter>forFactoryMethod(HttpClientObservationsAutoConfiguration.MeterFilterConfiguration.class, "metricsHttpClientUriTagFilter", ObservationProperties.class, MetricsProperties.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(HttpClientObservationsAutoConfiguration.MeterFilterConfiguration.class).metricsHttpClientUriTagFilter(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'metricsHttpClientUriTagFilter'
     */
    public static BeanDefinition getMetricsHttpClientUriTagFilterBeanDefinition() {
      Class<?> beanType = MeterFilter.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getMetricsHttpClientUriTagFilterInstanceSupplier());
      return beanDefinition;
    }
  }
}
