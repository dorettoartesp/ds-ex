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

    private ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<ClientDTO> findAll() {
        List<Client> list = this.clientRepository.findAll();
        return list
                .stream()
                .map(x -> new ClientDTO(x))
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Optional<Client> obj = this.clientRepository.findById(id);
        Client entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new ClientDTO(entity);
    }

    @Override
    public ClientDTO insert(ClientDTO dto) {
        // TODO Auto-generated method stub
        return null;
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
