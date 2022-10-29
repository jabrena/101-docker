package org.springframework.boot.autoconfigure.web.servlet;

import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.web.ServerProperties;

/**
 * Bean definitions for {@link ServletWebServerFactoryAutoConfiguration}
 */
public class ServletWebServerFactoryAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'servletWebServerFactoryAutoConfiguration'
   */
  public static BeanDefinition getServletWebServerFactoryAutoConfigurationBeanDefinition() {
    Class<?> beanType = ServletWebServerFactoryAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ServletWebServerFactoryAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'servletWebServerFactoryCustomizer'.
   */
  private static BeanInstanceSupplier<ServletWebServerFactoryCustomizer> getServletWebServerFactoryCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ServletWebServerFactoryCustomizer>forFactoryMethod(ServletWebServerFactoryAutoConfiguration.class, "servletWebServerFactoryCustomizer", ServerProperties.class, ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ServletWebServerFactoryAutoConfiguration.class).servletWebServerFactoryCustomizer(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'servletWebServerFactoryCustomizer'
   */
  public static BeanDefinition getServletWebServerFactoryCustomizerBeanDefinition() {
    Class<?> beanType = ServletWebServerFactoryCustomizer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getServletWebServerFactoryCustomizerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'tomcatServletWebServerFactoryCustomizer'.
   */
  private static BeanInstanceSupplier<TomcatServletWebServerFactoryCustomizer> getTomcatServletWebServerFactoryCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TomcatServletWebServerFactoryCustomizer>forFactoryMethod(ServletWebServerFactoryAutoConfiguration.class, "tomcatServletWebServerFactoryCustomizer", ServerProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ServletWebServerFactoryAutoConfiguration.class).tomcatServletWebServerFactoryCustomizer(args.get(0)));
  }

  /**
   * Get the bean definition for 'tomcatServletWebServerFactoryCustomizer'
   */
  public static BeanDefinition getTomcatServletWebServerFactoryCustomizerBeanDefinition() {
    Class<?> beanType = TomcatServletWebServerFactoryCustomizer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getTomcatServletWebServerFactoryCustomizerInstanceSupplier());
    return beanDefinition;
  }
}
