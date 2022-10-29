package org.springframework.boot.actuate.autoconfigure.metrics.startup;

import io.micrometer.core.instrument.MeterRegistry;
import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.metrics.startup.StartupTimeMetricsListener;

/**
 * Bean definitions for {@link StartupTimeMetricsListenerAutoConfiguration}
 */
public class StartupTimeMetricsListenerAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'startupTimeMetricsListenerAutoConfiguration'
   */
  public static BeanDefinition getStartupTimeMetricsListenerAutoConfigurationBeanDefinition() {
    Class<?> beanType = StartupTimeMetricsListenerAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(StartupTimeMetricsListenerAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'startupTimeMetrics'.
   */
  private static BeanInstanceSupplier<StartupTimeMetricsListener> getStartupTimeMetricsInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<StartupTimeMetricsListener>forFactoryMethod(StartupTimeMetricsListenerAutoConfiguration.class, "startupTimeMetrics", MeterRegistry.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(StartupTimeMetricsListenerAutoConfiguration.class).startupTimeMetrics(args.get(0)));
  }

  /**
   * Get the bean definition for 'startupTimeMetrics'
   */
  public static BeanDefinition getStartupTimeMetricsBeanDefinition() {
    Class<?> beanType = StartupTimeMetricsListener.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getStartupTimeMetricsInstanceSupplier());
    return beanDefinition;
  }
}
