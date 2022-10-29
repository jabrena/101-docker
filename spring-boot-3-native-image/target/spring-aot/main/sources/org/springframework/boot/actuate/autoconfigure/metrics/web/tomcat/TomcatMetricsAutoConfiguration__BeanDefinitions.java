package org.springframework.boot.actuate.autoconfigure.metrics.web.tomcat;

import io.micrometer.core.instrument.MeterRegistry;
import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.metrics.web.tomcat.TomcatMetricsBinder;

/**
 * Bean definitions for {@link TomcatMetricsAutoConfiguration}
 */
public class TomcatMetricsAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'tomcatMetricsAutoConfiguration'
   */
  public static BeanDefinition getTomcatMetricsAutoConfigurationBeanDefinition() {
    Class<?> beanType = TomcatMetricsAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(TomcatMetricsAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'tomcatMetricsBinder'.
   */
  private static BeanInstanceSupplier<TomcatMetricsBinder> getTomcatMetricsBinderInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TomcatMetricsBinder>forFactoryMethod(TomcatMetricsAutoConfiguration.class, "tomcatMetricsBinder", MeterRegistry.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(TomcatMetricsAutoConfiguration.class).tomcatMetricsBinder(args.get(0)));
  }

  /**
   * Get the bean definition for 'tomcatMetricsBinder'
   */
  public static BeanDefinition getTomcatMetricsBinderBeanDefinition() {
    Class<?> beanType = TomcatMetricsBinder.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getTomcatMetricsBinderInstanceSupplier());
    return beanDefinition;
  }
}
