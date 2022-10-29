package org.springframework.boot.actuate.autoconfigure.metrics;

import io.micrometer.core.instrument.binder.logging.LogbackMetrics;
import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LogbackMetricsAutoConfiguration}
 */
public class LogbackMetricsAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'logbackMetricsAutoConfiguration'
   */
  public static BeanDefinition getLogbackMetricsAutoConfigurationBeanDefinition() {
    Class<?> beanType = LogbackMetricsAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(LogbackMetricsAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'logbackMetrics'.
   */
  private static BeanInstanceSupplier<LogbackMetrics> getLogbackMetricsInstanceSupplier() {
    return BeanInstanceSupplier.<LogbackMetrics>forFactoryMethod(LogbackMetricsAutoConfiguration.class, "logbackMetrics")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(LogbackMetricsAutoConfiguration.class).logbackMetrics());
  }

  /**
   * Get the bean definition for 'logbackMetrics'
   */
  public static BeanDefinition getLogbackMetricsBeanDefinition() {
    Class<?> beanType = LogbackMetrics.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setDestroyMethodNames("close");
    beanDefinition.setInstanceSupplier(getLogbackMetricsInstanceSupplier());
    return beanDefinition;
  }
}
