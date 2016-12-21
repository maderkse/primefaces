/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.showcase.view.data.treetable;

/**
 *
 * @author administrator
 */
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.model.TreeNode;
import org.primefaces.showcase.domain.Document;
import org.primefaces.showcase.service.DocumentService;
 
@ManagedBean(name="ttBasicView")
@ViewScoped
public class BasicView implements Serializable {
     
    private TreeNode root;
     
    private Document selectedDocument;
         
    @ManagedProperty("#{documentService}")
    private DocumentService service;
     
    @PostConstruct
    public void init() {
        root = service.createDocuments();
    }
 
    public TreeNode getRoot() {
        return root;
    }
 
    public void setService(DocumentService service) {
        this.service = service;
    }
 
    public Document getSelectedDocument() {
        return selectedDocument;
    }
 
    public void setSelectedDocument(Document selectedDocument) {
        this.selectedDocument = selectedDocument;
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