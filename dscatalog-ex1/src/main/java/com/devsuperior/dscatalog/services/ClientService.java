package com.devsuperior.dscatalog.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.devsuperior.dscatalog.dtos.ClientDTO;

public interface ClientService {
    public Page<ClientDTO> findAllPaged(PageRequest pageRequest);
    public ClientDTO findById(Long id);
    public ClientDTO insert(ClientDTO dto);
    public ClientDTO update(Long id, ClientDTO dto);
    public void delete(Long id);
}
