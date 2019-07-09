package com.codenotfound.model.factory;




public abstract class DAOFactory {
    public static final int STUDENT_REPOSITORY = 1;

    public static DAOFactory getDAOFactory(int tipo) {
        switch (tipo) {
	        case STUDENT_REPOSITORY:
	            return new StudentDaoFactoryImpl();            
	        default:
	            return null;
        }
    }


    

}
