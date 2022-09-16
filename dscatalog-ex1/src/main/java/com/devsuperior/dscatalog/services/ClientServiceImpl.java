package com.devsuperior.dscatalog.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscatalog.dtos.ClientDTO;
import com.devsuperior.dscatalog.entities.Client;
import com.devsuperior.dscatalog.repositories.ClientRepository;
import com.devsuperior.dscatalog.services.exceptions.ResourceNotFoundException;

@Service
public class ClientServiceImpl implements ClientService {

    private ClientRepository repository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        repository = clientRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<ClientDTO> findAll() {
        List<Client> list = repository.findAll();
        return list
                .stream()
                .map(x -> new ClientDTO(x))
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Optional<Client> obj = repository.findById(id);
        Client entity = obj
            .orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new ClientDTO(entity);
    }

    @Override
    public ClientDTO insert(ClientDTO dto) {
        Client client = new Client(dto);
        client = repository.save(client);
        return new ClientDTO(client);
    }

    @Override
    public ClientDTO update(Long id, ClientDTO dto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }
    
}
