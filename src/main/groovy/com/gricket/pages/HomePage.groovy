package com.gricket.pages

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage
import com.gricket.domain.Customer
import com.gricket.service.CustomerService
import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.request.mapper.parameter.PageParameters
import org.apache.wicket.spring.injection.annot.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import org.wicketstuff.annotation.mount.MountPath

@WicketHomePage
@MountPath('home')
@AuthorizeInstantiation('USER')
class HomePage extends BasePage {

    @SpringBean
    CustomerService service

    HomePage(PageParameters parameters) {
        super(parameters)

        Customer customer = service.get(1)

        add(new Label('customer.name', "${customer.firstName} - ${customer.lastName}"))
    }
}
