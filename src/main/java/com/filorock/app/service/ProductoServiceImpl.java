package com.filorock.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.filorock.app.entity.Producto;
import com.filorock.app.dao.IProductoDao;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	IProductoDao productoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {

		return (List<Producto>)productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Producto> findAll(Pageable pageable) {

		return (Page<Producto>)productoDao.findAll();
	}

	@Override
	public void save(Producto producto) {
		productoDao.save(producto);
		
	}

	

	@Override
	@Transactional
	public void delete(Long id) {
		productoDao.deleteById(id);		
	}

	@Override
	public Producto findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto findProductoById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
