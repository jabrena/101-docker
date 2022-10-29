package org.springframework.boot.actuate.autoconfigure.observation.web.servlet;

import io.micrometer.core.instrument.config.MeterFilter;
import io.micrometer.observation.ObservationRegistry;
import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;
import org.springframework.boot.actuate.autoconfigure.observation.ObservationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.core.ResolvableType;
import org.springframework.web.filter.ServerHttpObservationFilter;

/**
 * Bean definitions for {@link WebMvcObservationAutoConfiguration}
 */
public class WebMvcObservationAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.boot.actuate.autoconfigure.observation.web.servlet.WebMvcObservationAutoConfiguration'.
   */
  private static BeanInstanceSupplier<WebMvcObservationAutoConfiguration> getWebMvcObservationAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<WebMvcObservationAutoConfiguration>forConstructor(ObservationProperties.class, MetricsProperties.class)
            .withGenerator((registeredBean, args) -> new WebMvcObservationAutoConfiguration(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'webMvcObservationAutoConfiguration'
   */
  public static BeanDefinition getWebMvcObservationAutoConfigurationBeanDefinition() {
    Class<?> beanType = WebMvcObservationAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getWebMvcObservationAutoConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'webMvcObservationFilter'.
   */
  private static BeanInstanceSupplier<FilterRegistrationBean> getWebMvcObservationFilterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<FilterRegistrationBean>forFactoryMethod(WebMvcObservationAutoConfiguration.class, "webMvcObservationFilter", ObservationRegistry.class, ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(WebMvcObservationAutoConfiguration.class).webMvcObservationFilter(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'webMvcObservationFilter'
   */
  public static BeanDefinition getWebMvcObservationFilterBeanDefinition() {
    ResolvableType beanType = ResolvableType.forClassWithGenerics(FilterRegistrationBean.class, ServerHttpObservationFilter.class);
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getWebMvcObservationFilterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link WebMvcObservationAutoConfiguration.MeterFilterConfiguration}
   */
  public static class MeterFilterConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'meterFilterConfiguration'
     */
    public static BeanDefinition getMeterFilterConfigurationBeanDefinition() {
      Class<?> beanType = WebMvcObservationAutoConfiguration.MeterFilterConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(WebMvcObservationAutoConfiguration.MeterFilterConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'metricsHttpServerUriTagFilter'.
     */
    private static BeanInstanceSupplier<MeterFilter> getMetricsHttpServerUriTagFilterInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<MeterFilter>forFactoryMethod(WebMvcObservationAutoConfiguration.MeterFilterConfiguration.class, "metricsHttpServerUriTagFilter", MetricsProperties.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(WebMvcObservationAutoConfiguration.MeterFilterConfiguration.class).metricsHttpServerUriTagFilter(args.get(0)));
    }

    /**
     * Get the bean definition for 'metricsHttpServerUriTagFilter'
     */
    public static BeanDefinition getMetricsHttpServerUriTagFilterBeanDefinition() {
      Class<?> beanType = MeterFilter.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getMetricsHttpServerUriTagFilterInstanceSupplier());
      return beanDefinition;
    }
  }
}
