package app.controller;

import com.app.phonebook.models.User;
import com.app.phonebook.services.PhoneService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

/**
 * Created by Kyza on 28.04.2016.
 */
public class PhoneBookController {
    @Mock
    private Model model;

    @Mock
    private PhoneService service;

    @InjectMocks
    private PhoneBookController controller;

    private MockMvc mockMvc;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

//    @Test
//    public void deletePage() throws Exception {
//        User user = new User("someLogin", "somePassword", "someFullName");
//        Long id = 5L;
//
//        when(service.delete(id, user.getLastLogin())).thenReturn(id);
//
//        mockMvc.perform(post("/phoneBook/delete")
//                .sessionAttr("login", "someLogin")
//                .param("phoneId", "5"))
//                .andExpect(content().string("5"));
//    }
}
