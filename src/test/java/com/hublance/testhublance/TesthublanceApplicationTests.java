package com.hublance.testhublance;

import com.hublance.testhublance.repository.PriceRepositoryDataAdapter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@SpringBootTest
@AutoConfigureMockMvc
class TesthublanceApplicationTests {

    @Autowired
    PriceRepositoryDataAdapter priceRepositoryDataAdapter;

    @Autowired
    private MockMvc mockMvc;

    private final String URL = "/api/v1/prices";

    @Autowired
    private ModelMapper modelMapper;

    @BeforeEach
    void setup() {
        priceRepositoryDataAdapter.deleteAll();
    }

    @Test
    void getPriceTest1() throws Exception {
        String json = """
                {"date":"2020-06-14 10:00:00","productId":35455,"brandId":1}
                """;

        mockMvc.perform(MockMvcRequestBuilders.get(URL)
                        .content(json)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.startDate").value("2020-06-14 00:00:00.0"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.endDate").value("2020-12-31 23:59:59.0"));
    }

    @Test
    void getPriceTest2() throws Exception {
        String json = """
                {"date":"2020-06-14 16:00:00","productId":35455,"brandId":1}
                """;

        mockMvc.perform(MockMvcRequestBuilders.get(URL)
                        .content(json)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.startDate").value("2020-06-14 15:00:00.0"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.endDate").value("2020-06-14 18:30:00.0"));
    }

    @Test
    void getPriceTest3() throws Exception {
        String json = """
                {"date":"2020-06-14 21:00:00","productId":35455,"brandId":1}
                """;

        mockMvc.perform(MockMvcRequestBuilders.get(URL)
                        .content(json)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.startDate").value("2020-06-14 00:00:00.0"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.endDate").value("2020-12-31 23:59:59.0"));
    }

    @Test
    void getPriceTest4() throws Exception {
        String json = """
                {"date":"2020-06-15 10:00:00","productId":35455,"brandId":1}
                """;

        mockMvc.perform(MockMvcRequestBuilders.get(URL)
                        .content(json)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.startDate").value("2020-06-15 00:00:00.0"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.endDate").value("2020-06-15 11:00:00.0"));
    }

    @Test
    void getPriceTest5() throws Exception {
        String json = """
                {"date":"2020-06-16 21:00:00","productId":35455,"brandId":1}
                """;

        mockMvc.perform(MockMvcRequestBuilders.get(URL)
                        .content(json)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.startDate").value("2020-06-15 16:00:00.0"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.endDate").value("2020-12-31 23:59:59.0"));
    }

    @Test
    void contextLoads() {
    }

}
