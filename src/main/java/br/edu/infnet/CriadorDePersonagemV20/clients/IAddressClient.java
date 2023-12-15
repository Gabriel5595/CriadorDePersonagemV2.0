package br.edu.infnet.CriadorDePersonagemV20.clients;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.Address;
import com.mysql.cj.xdevapi.JsonParser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws", name = "clientAddress")
public interface IAddressClient {

    @GetMapping(value = "/{cep}/json/")
    public Address findAddress(@PathVariable String cep);
}
