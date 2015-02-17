package org.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * Created by petar on 15-2-17.
 */
@Configuration
@ComponentScan( value = "org.test" )
public class TestConfig
{

    @Bean( name = { "defaultMessageSource", "messageSource" } )
    protected ReloadableResourceBundleMessageSource defaultMessageSource()
    {
        final ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasenames( "/WEB-INF/messages/base" );
        messageSource.setDefaultEncoding( "UTF-8" );
        messageSource.setCacheSeconds( 60 );
        messageSource.setFallbackToSystemLocale( false );

        return messageSource;
    }
}
