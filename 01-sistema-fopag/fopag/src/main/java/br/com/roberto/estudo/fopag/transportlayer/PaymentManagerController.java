package br.com.roberto.estudo.fopag.transportlayer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping("/v1/api")
public class PaymentManagerController {

    private static final Logger log = LoggerFactory.getLogger(PaymentManagerController.class);
    @PostMapping(value = "/calculate_payroll",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PayroolRequest> calculatePayRoll(@RequestBody PayroolRequest payroolRequest){
        log.info("[PaymentManagerController] Método calculate_payroll chamado");
        return ResponseEntity.ok(payroolRequest);
    }


}
