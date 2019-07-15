package com.codenotfound.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import com.codenotfound.model.*;
import com.codenotfound.services.*;

@Named
public class AcademicosController{

  private String firstName = "";
  private String lastName = "";
  
  private List<Academicos> listaAcademicos = new ArrayList<Academicos>();
  
  @Inject
  private AcademicosService academicosService;

  @PostConstruct
  public void init(){
    this.listaAcademicos = academicosService.getAcademicosList();
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String showGreeting() {
    Academicos s = new Academicos();
    s.setNombre(firstName + " " + lastName);
    this.listaAcademicos.add(s);
    return "Hello " + firstName + " " + lastName + "!";
  }

    /**
     * @return List<Academicos> return the listaAcademicos
     */
    public List<Academicos> getListaAcademicos() {
        return listaAcademicos;
    }

}
