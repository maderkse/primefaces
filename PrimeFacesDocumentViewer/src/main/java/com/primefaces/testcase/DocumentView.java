package com.primefaces.testcase;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.apache.log4j.Logger;
import org.primefaces.event.ColumnResizeEvent;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.event.NodeUnselectEvent;
import org.primefaces.extensions.event.ResizeEvent;
import org.primefaces.model.TreeNode;

import com.primefaces.testcase.Document;
import com.primefaces.testcase.DocumentService;
 
@ManagedBean(name="documentView")
@ViewScoped
public class DocumentView implements Serializable {

	private static final long serialVersionUID=1L;
	private static Logger log=Logger.getLogger(DocumentView.class);
	private static boolean sw = false;
	
    private TreeNode root;
    
    private TreeNode[] selectedNodes;
     
    private Document selectedDocument;
         
    @ManagedProperty("#{documentService}")
    private DocumentService service;
     
    @PostConstruct
    public void init() {
        root = service.createDocuments();
    }
    
	public void initRequest() 
	{
		log.debug("initRequest - init");
	}
 
    public TreeNode getRoot() {
        return root;
    }
 
    public void setService(DocumentService service) {
        this.service = service;
    }
    
	public void onNodeSelect(NodeSelectEvent event) {
		log.info("NodeSelectEvent triggered: " + event);
	}
	
	public void onNodeUnselect(NodeUnselectEvent event) {
		log.info("NodeUnSelectEvent triggered: " + event);
	}
	
    public TreeNode[] getSelectedNodes() {
        return selectedNodes;
    }
 
    public void setSelectedNodes(TreeNode[] selectedNodes) {
        this.selectedNodes = selectedNodes;
    }
    
	public String getIframeUrl()
	{
		sw = !sw;
		
		if (sw) {
			log.info("iframe url: 1.pdf");
			return "1.pdf";
		} else {
			log.info("iframe url: 2.pdf");
			return "2.pdf";
		}
	}
	
	public void change(ActionEvent actionEvent) {
		log.info("ActionEvent: " + actionEvent.getComponent().getId());
    }

	
}
