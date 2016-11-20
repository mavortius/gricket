package com.gricket.pages

import de.agilecoders.wicket.core.markup.html.bootstrap.image.GlyphIconType
import de.agilecoders.wicket.core.markup.html.bootstrap.navbar.Navbar
import de.agilecoders.wicket.core.markup.html.bootstrap.navbar.NavbarButton
import de.agilecoders.wicket.core.markup.html.bootstrap.navbar.NavbarComponents
import org.apache.wicket.markup.html.WebPage
import org.apache.wicket.model.Model
import org.apache.wicket.request.mapper.parameter.PageParameters


abstract class BasePage extends WebPage {
    BasePage(PageParameters parameters) {
        super(parameters);

        add(newNavbar('navbar'))
    }

    protected Navbar newNavbar(String markupId) {
        Navbar navbar = new Navbar(markupId)
        navbar.position = Navbar.Position.TOP
        navbar.inverted = true
        navbar.brandName = Model.of('Wicket Boot - Bootstrap')

        navbar.addComponents(NavbarComponents.transform(Navbar.ComponentPosition.LEFT,
                                    new NavbarButton(HomePage, Model.of('Home')).setIconType(GlyphIconType.home)))

        navbar
    }
}
