/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.test;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {
   public HelloWorld() {
      System.out.println("HelloWorld started!");
   }
	
   public String getMessage() {
      return "Hello Maarten!";
   }
   
      /**
 * This method provides a convenient means of determining the JSF
 * Specification version.
 *
 * @return JSF Specification version, e.g. 2.1
 * @since 1.5
 */
public static String getSpecificationVersion() {
    return FacesContext.getCurrentInstance().getClass().getPackage().getSpecificationVersion();
}
 
/**
 * This method provides a convenient means of determining the JSF
 * Implementation version.
 *
 * @return JSF Implementation version, e.g. 2.1.26
 * @since 1.5
 */
public static String getImplementationVersion() {
    return FacesContext.getCurrentInstance().getClass().getPackage().getImplementationVersion();
}
 
/**
 * This method provides a convenient means of determining the JSF
 * Implementation Title.
 *
 * @return JSF implementation title, e.g. Mojarra.
 * @since 1.5
 */
public static String getImplementationTitle() {
    return FacesContext.getCurrentInstance().getClass().getPackage().getImplementationTitle();
}
}