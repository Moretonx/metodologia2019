package com.codenotfound.services;

import java.util.List;

import javax.inject.Named;

import com.codenotfound.model.*;
import com.codenotfound.model.factory.*;


@Named
public class AcademicosService {
	
	private AcademicosDaoFactory academicosDaoFactory ;
	
	
	public AcademicosService() {
		this.academicosDaoFactory = (AcademicosDaoFactory)DAOFactory.getDAOFactory(DAOFactory.ACADEMICOS_REPOSITORY);
	}
	

    public List<Academicos> getAcademicosList() {
        return this.academicosDaoFactory.getAcademicosDao().findAll();

    }
    

}
