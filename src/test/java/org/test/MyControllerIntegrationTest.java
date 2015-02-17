package org.test;

import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by petar on 15-2-17.
 */
public class MyControllerIntegrationTest
    extends BaseIntegrationTest
{

    @Test
    @Transactional
    public void testGetAccount()
        throws Exception
    {

        mockMvc.perform( get( "/" ) ).andExpect( status().isOk() ).andExpect( view().name( "home" ) );
    }


}
