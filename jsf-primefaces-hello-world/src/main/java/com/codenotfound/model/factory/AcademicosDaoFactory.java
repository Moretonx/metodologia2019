package com.codenotfound.model.factory;

import com.codenotfound.model.dao.*;

public abstract class AcademicosDaoFactory extends DAOFactory{
	
    public abstract AcademicosDao getAcademicosDao();
    
}



