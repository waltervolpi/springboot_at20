package it.volpi.walter.at20verifica;


import it.volpi.walter.at20verifica.PresidioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Flux;

@Controller
@RequestMapping(path = "/presidi")
public class PresidioController {
    private final PresidioRepository presidioRepository;

    public PresidioController(PresidioRepository presidioRepository) {
        this.presidioRepository = presidioRepository;
    }

    @GetMapping()
    public @ResponseBody
    Flux<Presidio> getAllPresidi() {
        Flux<Presidio> result = presidioRepository.findAll();
        return result;
    }

}
