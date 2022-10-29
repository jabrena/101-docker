package org.springframework.boot.actuate.autoconfigure.metrics;

import io.micrometer.core.instrument.binder.jvm.ClassLoaderMetrics;
import io.micrometer.core.instrument.binder.jvm.JvmCompilationMetrics;
import io.micrometer.core.instrument.binder.jvm.JvmGcMetrics;
import io.micrometer.core.instrument.binder.jvm.JvmHeapPressureMetrics;
import io.micrometer.core.instrument.binder.jvm.JvmInfoMetrics;
import io.micrometer.core.instrument.binder.jvm.JvmMemoryMetrics;
import io.micrometer.core.instrument.binder.jvm.JvmThreadMetrics;
import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link JvmMetricsAutoConfiguration}
 */
public class JvmMetricsAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'jvmMetricsAutoConfiguration'
   */
  public static BeanDefinition getJvmMetricsAutoConfigurationBeanDefinition() {
    Class<?> beanType = JvmMetricsAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(JvmMetricsAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jvmGcMetrics'.
   */
  private static BeanInstanceSupplier<JvmGcMetrics> getJvmGcMetricsInstanceSupplier() {
    return BeanInstanceSupplier.<JvmGcMetrics>forFactoryMethod(JvmMetricsAutoConfiguration.class, "jvmGcMetrics")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(JvmMetricsAutoConfiguration.class).jvmGcMetrics());
  }

  /**
   * Get the bean definition for 'jvmGcMetrics'
   */
  public static BeanDefinition getJvmGcMetricsBeanDefinition() {
    Class<?> beanType = JvmGcMetrics.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setDestroyMethodNames("close");
    beanDefinition.setInstanceSupplier(getJvmGcMetricsInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jvmHeapPressureMetrics'.
   */
  private static BeanInstanceSupplier<JvmHeapPressureMetrics> getJvmHeapPressureMetricsInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<JvmHeapPressureMetrics>forFactoryMethod(JvmMetricsAutoConfiguration.class, "jvmHeapPressureMetrics")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(JvmMetricsAutoConfiguration.class).jvmHeapPressureMetrics());
  }

  /**
   * Get the bean definition for 'jvmHeapPressureMetrics'
   */
  public static BeanDefinition getJvmHeapPressureMetricsBeanDefinition() {
    Class<?> beanType = JvmHeapPressureMetrics.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setDestroyMethodNames("close");
    beanDefinition.setInstanceSupplier(getJvmHeapPressureMetricsInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jvmMemoryMetrics'.
   */
  private static BeanInstanceSupplier<JvmMemoryMetrics> getJvmMemoryMetricsInstanceSupplier() {
    return BeanInstanceSupplier.<JvmMemoryMetrics>forFactoryMethod(JvmMetricsAutoConfiguration.class, "jvmMemoryMetrics")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(JvmMetricsAutoConfiguration.class).jvmMemoryMetrics());
  }

  /**
   * Get the bean definition for 'jvmMemoryMetrics'
   */
  public static BeanDefinition getJvmMemoryMetricsBeanDefinition() {
    Class<?> beanType = JvmMemoryMetrics.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getJvmMemoryMetricsInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jvmThreadMetrics'.
   */
  private static BeanInstanceSupplier<JvmThreadMetrics> getJvmThreadMetricsInstanceSupplier() {
    return BeanInstanceSupplier.<JvmThreadMetrics>forFactoryMethod(JvmMetricsAutoConfiguration.class, "jvmThreadMetrics")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(JvmMetricsAutoConfiguration.class).jvmThreadMetrics());
  }

  /**
   * Get the bean definition for 'jvmThreadMetrics'
   */
  public static BeanDefinition getJvmThreadMetricsBeanDefinition() {
    Class<?> beanType = JvmThreadMetrics.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getJvmThreadMetricsInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'classLoaderMetrics'.
   */
  private static BeanInstanceSupplier<ClassLoaderMetrics> getClassLoaderMetricsInstanceSupplier() {
    return BeanInstanceSupplier.<ClassLoaderMetrics>forFactoryMethod(JvmMetricsAutoConfiguration.class, "classLoaderMetrics")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(JvmMetricsAutoConfiguration.class).classLoaderMetrics());
  }

  /**
   * Get the bean definition for 'classLoaderMetrics'
   */
  public static BeanDefinition getClassLoaderMetricsBeanDefinition() {
    Class<?> beanType = ClassLoaderMetrics.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getClassLoaderMetricsInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jvmInfoMetrics'.
   */
  private static BeanInstanceSupplier<JvmInfoMetrics> getJvmInfoMetricsInstanceSupplier() {
    return BeanInstanceSupplier.<JvmInfoMetrics>forFactoryMethod(JvmMetricsAutoConfiguration.class, "jvmInfoMetrics")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(JvmMetricsAutoConfiguration.class).jvmInfoMetrics());
  }

  /**
   * Get the bean definition for 'jvmInfoMetrics'
   */
  public static BeanDefinition getJvmInfoMetricsBeanDefinition() {
    Class<?> beanType = JvmInfoMetrics.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getJvmInfoMetricsInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jvmCompilationMetrics'.
   */
  private static BeanInstanceSupplier<JvmCompilationMetrics> getJvmCompilationMetricsInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<JvmCompilationMetrics>forFactoryMethod(JvmMetricsAutoConfiguration.class, "jvmCompilationMetrics")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(JvmMetricsAutoConfiguration.class).jvmCompilationMetrics());
  }

  /**
   * Get the bean definition for 'jvmCompilationMetrics'
   */
  public static BeanDefinition getJvmCompilationMetricsBeanDefinition() {
    Class<?> beanType = JvmCompilationMetrics.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getJvmCompilationMetricsInstanceSupplier());
    return beanDefinition;
  }
}
