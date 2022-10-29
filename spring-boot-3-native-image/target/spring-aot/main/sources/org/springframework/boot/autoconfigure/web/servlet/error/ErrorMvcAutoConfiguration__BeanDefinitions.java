package org.springframework.boot.autoconfigure.web.servlet.error;

import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.BeanNameViewResolver;

/**
 * Bean definitions for {@link ErrorMvcAutoConfiguration}
 */
public class ErrorMvcAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration'.
   */
  private static BeanInstanceSupplier<ErrorMvcAutoConfiguration> getErrorMvcAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ErrorMvcAutoConfiguration>forConstructor(ServerProperties.class)
            .withGenerator((registeredBean, args) -> new ErrorMvcAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'errorMvcAutoConfiguration'
   */
  public static BeanDefinition getErrorMvcAutoConfigurationBeanDefinition() {
    Class<?> beanType = ErrorMvcAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getErrorMvcAutoConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'errorAttributes'.
   */
  private static BeanInstanceSupplier<DefaultErrorAttributes> getErrorAttributesInstanceSupplier() {
    return BeanInstanceSupplier.<DefaultErrorAttributes>forFactoryMethod(ErrorMvcAutoConfiguration.class, "errorAttributes")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ErrorMvcAutoConfiguration.class).errorAttributes());
  }

  /**
   * Get the bean definition for 'errorAttributes'
   */
  public static BeanDefinition getErrorAttributesBeanDefinition() {
    Class<?> beanType = DefaultErrorAttributes.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getErrorAttributesInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'basicErrorController'.
   */
  private static BeanInstanceSupplier<BasicErrorController> getBasicErrorControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<BasicErrorController>forFactoryMethod(ErrorMvcAutoConfiguration.class, "basicErrorController", ErrorAttributes.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ErrorMvcAutoConfiguration.class).basicErrorController(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'basicErrorController'
   */
  public static BeanDefinition getBasicErrorControllerBeanDefinition() {
    Class<?> beanType = BasicErrorController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getBasicErrorControllerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'errorPageCustomizer'.
   */
  private static BeanInstanceSupplier<ErrorMvcAutoConfiguration.ErrorPageCustomizer> getErrorPageCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ErrorMvcAutoConfiguration.ErrorPageCustomizer>forFactoryMethod(ErrorMvcAutoConfiguration.class, "errorPageCustomizer", DispatcherServletPath.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ErrorMvcAutoConfiguration.class).errorPageCustomizer(args.get(0)));
  }

  /**
   * Get the bean definition for 'errorPageCustomizer'
   */
  public static BeanDefinition getErrorPageCustomizerBeanDefinition() {
    Class<?> beanType = ErrorMvcAutoConfiguration.ErrorPageCustomizer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getErrorPageCustomizerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'preserveErrorControllerTargetClassPostProcessor'
   */
  public static BeanDefinition getPreserveErrorControllerTargetClassPostProcessorBeanDefinition() {
    Class<?> beanType = ErrorMvcAutoConfiguration.PreserveErrorControllerTargetClassPostProcessor.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<ErrorMvcAutoConfiguration.PreserveErrorControllerTargetClassPostProcessor>forFactoryMethod(ErrorMvcAutoConfiguration.class, "preserveErrorControllerTargetClassPostProcessor").withGenerator(ErrorMvcAutoConfiguration::preserveErrorControllerTargetClassPostProcessor));
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link ErrorMvcAutoConfiguration.DefaultErrorViewResolverConfiguration}
   */
  public static class DefaultErrorViewResolverConfiguration__BeanDefinitions {
    /**
     * Get the bean instance supplier for 'org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration'.
     */
    private static BeanInstanceSupplier<ErrorMvcAutoConfiguration.DefaultErrorViewResolverConfiguration> getDefaultErrorViewResolverConfigurationInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<ErrorMvcAutoConfiguration.DefaultErrorViewResolverConfiguration>forConstructor(ApplicationContext.class, WebProperties.class)
              .withGenerator((registeredBean, args) -> new ErrorMvcAutoConfiguration.DefaultErrorViewResolverConfiguration(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'defaultErrorViewResolverConfiguration'
     */
    public static BeanDefinition getDefaultErrorViewResolverConfigurationBeanDefinition() {
      Class<?> beanType = ErrorMvcAutoConfiguration.DefaultErrorViewResolverConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getDefaultErrorViewResolverConfigurationInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'conventionErrorViewResolver'.
     */
    private static BeanInstanceSupplier<DefaultErrorViewResolver> getConventionErrorViewResolverInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<DefaultErrorViewResolver>forFactoryMethod(ErrorMvcAutoConfiguration.DefaultErrorViewResolverConfiguration.class, "conventionErrorViewResolver")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ErrorMvcAutoConfiguration.DefaultErrorViewResolverConfiguration.class).conventionErrorViewResolver());
    }

    /**
     * Get the bean definition for 'conventionErrorViewResolver'
     */
    public static BeanDefinition getConventionErrorViewResolverBeanDefinition() {
      Class<?> beanType = DefaultErrorViewResolver.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getConventionErrorViewResolverInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration}
   */
  public static class WhitelabelErrorViewConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'whitelabelErrorViewConfiguration'
     */
    public static BeanDefinition getWhitelabelErrorViewConfigurationBeanDefinition() {
      Class<?> beanType = ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'error'.
     */
    private static BeanInstanceSupplier<View> getErrorInstanceSupplier() {
      return BeanInstanceSupplier.<View>forFactoryMethod(ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration.class, "defaultErrorView")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration.class).defaultErrorView());
    }

    /**
     * Get the bean definition for 'error'
     */
    public static BeanDefinition getErrorBeanDefinition() {
      Class<?> beanType = View.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getErrorInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'beanNameViewResolver'.
     */
    private static BeanInstanceSupplier<BeanNameViewResolver> getBeanNameViewResolverInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<BeanNameViewResolver>forFactoryMethod(ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration.class, "beanNameViewResolver")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration.class).beanNameViewResolver());
    }

    /**
     * Get the bean definition for 'beanNameViewResolver'
     */
    public static BeanDefinition getBeanNameViewResolverBeanDefinition() {
      Class<?> beanType = BeanNameViewResolver.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getBeanNameViewResolverInstanceSupplier());
      return beanDefinition;
    }
  }
}
