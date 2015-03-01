package net.test;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by petar on 15-2-17.
 */
@Controller
@RequestMapping( value = { "/", "/index.html" } )
public class MyController
{
    @Resource( name = "customMessageSource" )
    private MessageSource messageSource;

    @RequestMapping( method = RequestMethod.GET )
    public String home( final Model model,
                        @RequestParam( value = "logout", defaultValue = "false" ) final String logout,
                        final HttpServletRequest request )
    {
        final String msg = messageSource.getMessage( "custom.link", null, Locale.ENGLISH );

        return "home";
    }
}
