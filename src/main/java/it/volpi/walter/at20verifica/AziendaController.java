package it.volpi.walter.at20verifica;

import it.volpi.walter.at20verifica.AziendaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;


@Controller
@RequestMapping(path = "/aziende")
public class AziendaController {
    private final AziendaRepository aziendaRepository;

    public AziendaController(AziendaRepository aziendaRepository) {
        this.aziendaRepository = aziendaRepository;
    }

    @GetMapping()
    public @ResponseBody
    Flux<Azienda> getAllAziende() {
        Flux<Azienda> result = aziendaRepository.findAll();
        return result;
    }
}
