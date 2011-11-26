/*
 * Copyright (c) 2002-2003 by OpenSymphony
 * All rights reserved.
 */
/*
 * Generated by XDoclet - Do not edit!
 */
package com.opensymphony.module.sequence;


/**
 * Remote interface for SequenceGenerator.
 * @author <a href="mailto:joe@truemesh.com">Joe Walnes</a>
 * @author <a href="mailto:hani@formicary.net">Hani Suleiman</a>
 * @version $Revision: 130 $
 */
public interface SequenceGenerator extends javax.ejb.EJBObject {
    //~ Methods ////////////////////////////////////////////////////////////////

    public long getCount(java.lang.String sequenceName) throws java.rmi.RemoteException;
}
