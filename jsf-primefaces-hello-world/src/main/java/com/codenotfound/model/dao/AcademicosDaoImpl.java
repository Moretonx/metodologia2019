package com.codenotfound.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.codenotfound.model.Academicos;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("repositoryB")
public class AcademicosDaoImpl implements AcademicosDao {

    @Override
    public List findAll() {
        List<Academicos> list = new ArrayList<Academicos>();
        Academicos academicos = null;
        String data = this.readFile();
        for (String nombreAcademicos : data.split(";")) {
            academicos = new Academicos();
            academicos.setNombre(nombreAcademicos.trim());
            list.add(academicos);
        }
        return list;
    }

    private String readFile()  {
        String data = "";
        try {
            FileInputStream fis = new FileInputStream("data/academics.txt");
            data = IOUtils.toString(fis, "UTF-8");
            System.out.println(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    
}
