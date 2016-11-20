package com.gricket.pages

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage
import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation
import org.apache.wicket.request.mapper.parameter.PageParameters
import org.wicketstuff.annotation.mount.MountPath

@WicketHomePage
@MountPath('home')
@AuthorizeInstantiation('USER')
class HomePage extends BasePage {

    HomePage(PageParameters parameters) {
        super(parameters)
    }
}
