package org.springframework.boot.autoconfigure.websocket.servlet;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link WebSocketServletAutoConfiguration}
 */
public class WebSocketServletAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'webSocketServletAutoConfiguration'
   */
  public static BeanDefinition getWebSocketServletAutoConfigurationBeanDefinition() {
    Class<?> beanType = WebSocketServletAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(WebSocketServletAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link WebSocketServletAutoConfiguration.TomcatWebSocketConfiguration}
   */
  public static class TomcatWebSocketConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'tomcatWebSocketConfiguration'
     */
    public static BeanDefinition getTomcatWebSocketConfigurationBeanDefinition() {
      Class<?> beanType = WebSocketServletAutoConfiguration.TomcatWebSocketConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(WebSocketServletAutoConfiguration.TomcatWebSocketConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'websocketServletWebServerCustomizer'.
     */
    private static BeanInstanceSupplier<TomcatWebSocketServletWebServerCustomizer> getWebsocketServletWebServerCustomizerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<TomcatWebSocketServletWebServerCustomizer>forFactoryMethod(WebSocketServletAutoConfiguration.TomcatWebSocketConfiguration.class, "websocketServletWebServerCustomizer")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(WebSocketServletAutoConfiguration.TomcatWebSocketConfiguration.class).websocketServletWebServerCustomizer());
    }

    /**
     * Get the bean definition for 'websocketServletWebServerCustomizer'
     */
    public static BeanDefinition getWebsocketServletWebServerCustomizerBeanDefinition() {
      Class<?> beanType = TomcatWebSocketServletWebServerCustomizer.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getWebsocketServletWebServerCustomizerInstanceSupplier());
      return beanDefinition;
    }
  }
}
