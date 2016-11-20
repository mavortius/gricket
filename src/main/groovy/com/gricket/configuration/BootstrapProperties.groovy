package com.gricket.configuration

import de.agilecoders.wicket.core.settings.BootstrapSettings
import de.agilecoders.wicket.themes.markup.html.bootswatch.BootswatchTheme
import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = BootstrapProperties.PROPERTY_PREFIX)
class BootstrapProperties extends BootstrapSettings {
    static final String PROPERTY_PREFIX = 'wicket.external.agilcoders.bootstrap'

    boolean enabled = true
    BootswatchTheme theme = BootswatchTheme.Flatly
}
