package br.com.roberto.estudo.fopag.transportlayer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class PaymentManagerControllerTest {

    private MockMvc mockMvc;
    private ObjectMapper objectMapper;

    private int employeeId;
    private int month;
    private int year;

    @BeforeEach
    void setup() {
        mockMvc = MockMvcBuilders
                .standaloneSetup(new PaymentManagerController())
                .build();
        objectMapper = new ObjectMapper();
    }

    @Test
    @DisplayName("Should Calculate Payment For Employee Pedro")
    void shouldCalculatePaymentForEmployeePedro() throws Exception {

        PayroolRequest payroolRequest = new
                PayroolRequest.Builder().employeeId(1)
                .month(12)
                .year(2023)
                .build();

        String payroolRequestJson = objectMapper.writeValueAsString(payroolRequest);

        // Perform the POST request
        ResultActions resultActions = mockMvc.perform(post("/v1/api/calculate_payroll", payroolRequestJson)
                .contentType(MediaType.APPLICATION_JSON)
                .content(payroolRequestJson));

        resultActions
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.employeeId").value(1))
                .andExpect(jsonPath("$.month").value(12))
                .andExpect(jsonPath("$.year").value(2023));

                //.andDo(MockMvcResultHandlers.print());
    }
}