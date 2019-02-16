package com.filorock.app.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.filorock.app.entity.Producto;


public interface IProductoService {

	public List<Producto> findAll();

	public Page<Producto> findAll(Pageable pageable);

	public void save(Producto cliente);

	public Producto findOne(Long id);

	public void delete(Long id);
	
	public Producto findProductoById(Long id);

}
