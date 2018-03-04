package service;

import java.io.IOException;
import java.util.ArrayList;

import model.Fila;

public class FilaService {
	FilaDao dao;
	
	public ArrayList<Fila> listarFilas() throws IOException{
		return dao.listarFilas();
	}

}
