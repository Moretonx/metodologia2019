package com.codenotfound.model.factory;

import com.codenotfound.model.dao.*;

public class AcademicosDaoFactoryImpl extends AcademicosDaoFactory {
    //public static final String DATASOURCE = "jdbc/ruda_masindivDS";

    @Override
    public AcademicosDao getAcademicosDao() {
        return new AcademicosDaoImpl();
    }


}
