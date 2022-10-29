package org.springframework.boot.autoconfigure.web.servlet;

import jakarta.servlet.MultipartConfigElement;
import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

/**
 * Bean definitions for {@link MultipartAutoConfiguration}
 */
public class MultipartAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration'.
   */
  private static BeanInstanceSupplier<MultipartAutoConfiguration> getMultipartAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MultipartAutoConfiguration>forConstructor(MultipartProperties.class)
            .withGenerator((registeredBean, args) -> new MultipartAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'multipartAutoConfiguration'
   */
  public static BeanDefinition getMultipartAutoConfigurationBeanDefinition() {
    Class<?> beanType = MultipartAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getMultipartAutoConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'multipartConfigElement'.
   */
  private static BeanInstanceSupplier<MultipartConfigElement> getMultipartConfigElementInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MultipartConfigElement>forFactoryMethod(MultipartAutoConfiguration.class, "multipartConfigElement")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(MultipartAutoConfiguration.class).multipartConfigElement());
  }

  /**
   * Get the bean definition for 'multipartConfigElement'
   */
  public static BeanDefinition getMultipartConfigElementBeanDefinition() {
    Class<?> beanType = MultipartConfigElement.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getMultipartConfigElementInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'multipartResolver'.
   */
  private static BeanInstanceSupplier<StandardServletMultipartResolver> getMultipartResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<StandardServletMultipartResolver>forFactoryMethod(MultipartAutoConfiguration.class, "multipartResolver")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(MultipartAutoConfiguration.class).multipartResolver());
  }

  /**
   * Get the bean definition for 'multipartResolver'
   */
  public static BeanDefinition getMultipartResolverBeanDefinition() {
    Class<?> beanType = StandardServletMultipartResolver.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getMultipartResolverInstanceSupplier());
    return beanDefinition;
  }
}
