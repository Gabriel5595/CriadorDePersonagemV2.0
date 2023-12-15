package br.edu.infnet.CriadorDePersonagemV20.model.service;

import br.edu.infnet.CriadorDePersonagemV20.clients.IAddressClient;
import br.edu.infnet.CriadorDePersonagemV20.model.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private IAddressClient addressClientClient;

    public Address findAddress(String cep) {
        return addressClientClient.findAddress(cep);
    }
}
