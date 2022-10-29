package org.springframework.boot.autoconfigure.web.servlet;

import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;

/**
 * Bean definitions for {@link ServletWebServerFactoryConfiguration}
 */
public class ServletWebServerFactoryConfiguration__BeanDefinitions {
  /**
   * Bean definitions for {@link ServletWebServerFactoryConfiguration.EmbeddedTomcat}
   */
  public static class EmbeddedTomcat__BeanDefinitions {
    /**
     * Get the bean definition for 'embeddedTomcat'
     */
    public static BeanDefinition getEmbeddedTomcatBeanDefinition() {
      Class<?> beanType = ServletWebServerFactoryConfiguration.EmbeddedTomcat.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(ServletWebServerFactoryConfiguration.EmbeddedTomcat::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'tomcatServletWebServerFactory'.
     */
    private static BeanInstanceSupplier<TomcatServletWebServerFactory> getTomcatServletWebServerFactoryInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<TomcatServletWebServerFactory>forFactoryMethod(ServletWebServerFactoryConfiguration.EmbeddedTomcat.class, "tomcatServletWebServerFactory", ObjectProvider.class, ObjectProvider.class, ObjectProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ServletWebServerFactoryConfiguration.EmbeddedTomcat.class).tomcatServletWebServerFactory(args.get(0), args.get(1), args.get(2)));
    }

    /**
     * Get the bean definition for 'tomcatServletWebServerFactory'
     */
    public static BeanDefinition getTomcatServletWebServerFactoryBeanDefinition() {
      Class<?> beanType = TomcatServletWebServerFactory.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getTomcatServletWebServerFactoryInstanceSupplier());
      return beanDefinition;
    }
  }
}
