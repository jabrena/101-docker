package org.springframework.boot.actuate.autoconfigure.info;

import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.info.InfoEndpoint;

/**
 * Bean definitions for {@link InfoEndpointAutoConfiguration}
 */
public class InfoEndpointAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'infoEndpointAutoConfiguration'
   */
  public static BeanDefinition getInfoEndpointAutoConfigurationBeanDefinition() {
    Class<?> beanType = InfoEndpointAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(InfoEndpointAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'infoEndpoint'.
   */
  private static BeanInstanceSupplier<InfoEndpoint> getInfoEndpointInstanceSupplier() {
    return BeanInstanceSupplier.<InfoEndpoint>forFactoryMethod(InfoEndpointAutoConfiguration.class, "infoEndpoint", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(InfoEndpointAutoConfiguration.class).infoEndpoint(args.get(0)));
  }

  /**
   * Get the bean definition for 'infoEndpoint'
   */
  public static BeanDefinition getInfoEndpointBeanDefinition() {
    Class<?> beanType = InfoEndpoint.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getInfoEndpointInstanceSupplier());
    return beanDefinition;
  }
}
