package com.gricket.configuration

import com.giffing.wicket.spring.boot.context.extensions.ApplicationInitExtension
import com.giffing.wicket.spring.boot.context.extensions.WicketApplicationInitConfiguration
import de.agilecoders.wicket.core.Bootstrap
import de.agilecoders.wicket.core.settings.ThemeProvider
import de.agilecoders.wicket.less.BootstrapLess
import de.agilecoders.wicket.themes.markup.html.bootswatch.BootswatchThemeProvider
import org.apache.wicket.protocol.http.WebApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.context.properties.EnableConfigurationProperties

@ApplicationInitExtension
@ConditionalOnProperty(prefix = BootstrapProperties.PROPERTY_PREFIX, value = 'enabled', matchIfMissing = true)
@ConditionalOnClass(BootstrapConfig)
@EnableConfigurationProperties([BootstrapProperties])
class BootstrapConfig implements WicketApplicationInitConfiguration {

    @Autowired
    BootstrapProperties properties

    @Override
    void init(WebApplication webApplication) {
        final ThemeProvider provider = new BootswatchThemeProvider(properties.theme)
        properties.themeProvider = provider

        Bootstrap.install(webApplication, properties)
        BootstrapLess.install(webApplication)
    }
}
