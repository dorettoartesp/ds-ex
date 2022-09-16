package com.devsuperior.dscatalog.services;

import java.util.List;

import com.devsuperior.dscatalog.dtos.ClientDTO;

public interface ClientService {
    public List<ClientDTO> findAll();
    public ClientDTO findById(Long id);
    public ClientDTO insert(ClientDTO dto);
    public ClientDTO update(Long id, ClientDTO dto);
    public void delete(Long id);
}
