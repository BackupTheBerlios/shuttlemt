/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Tournament.java,v 1.1 2006/05/12 17:37:12 luschtiger Exp $
 */

package ch.form105.shuttle.base.generated.tournament;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Tournament.
 * 
 * @version $Revision: 1.1 $ $Date: 2006/05/12 17:37:12 $
 */
public class Tournament extends ch.form105.shuttle.base.Element 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _icon
     */
    private java.lang.String _icon = "testicon";

    /**
     * Field _mensingle
     */
    private ch.form105.shuttle.base.generated.tournament.Mensingle _mensingle;

    /**
     * Field _womensingle
     */
    private ch.form105.shuttle.base.generated.tournament.Womensingle _womensingle;

    /**
     * Field _mendouble
     */
    private ch.form105.shuttle.base.generated.tournament.Mendouble _mendouble;

    /**
     * Field _womendouble
     */
    private ch.form105.shuttle.base.generated.tournament.Womendouble _womendouble;

    /**
     * Field _mixed
     */
    private ch.form105.shuttle.base.generated.tournament.Mixed _mixed;

    /**
     * Field propertyChangeSupport
     */
    private java.beans.PropertyChangeSupport propertyChangeSupport;


      //----------------/
     //- Constructors -/
    //----------------/

    public Tournament() 
     {
        super();
        setIcon("testicon");
    } //-- ch.form105.shuttle.base.generated.tournament.Tournament()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPropertyChangeListener
     * 
     * Registers a PropertyChangeListener with this class.
     * 
     * @param pcl The PropertyChangeListener to register.
     */
    public void addPropertyChangeListener(java.beans.PropertyChangeListener pcl)
    {
        if (propertyChangeSupport == null) {
            propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
        }
        propertyChangeSupport.addPropertyChangeListener(pcl);
    } //-- void addPropertyChangeListener(java.beans.PropertyChangeListener) 

    /**
     * Returns the value of field 'icon'.
     * 
     * @return String
     * @return the value of field 'icon'.
     */
    public java.lang.String getIcon()
    {
        return this._icon;
    } //-- java.lang.String getIcon() 

    /**
     * Returns the value of field 'mendouble'.
     * 
     * @return Mendouble
     * @return the value of field 'mendouble'.
     */
    public ch.form105.shuttle.base.generated.tournament.Mendouble getMendouble()
    {
        return this._mendouble;
    } //-- ch.form105.shuttle.base.generated.tournament.Mendouble getMendouble() 

    /**
     * Returns the value of field 'mensingle'.
     * 
     * @return Mensingle
     * @return the value of field 'mensingle'.
     */
    public ch.form105.shuttle.base.generated.tournament.Mensingle getMensingle()
    {
        return this._mensingle;
    } //-- ch.form105.shuttle.base.generated.tournament.Mensingle getMensingle() 

    /**
     * Returns the value of field 'mixed'.
     * 
     * @return Mixed
     * @return the value of field 'mixed'.
     */
    public ch.form105.shuttle.base.generated.tournament.Mixed getMixed()
    {
        return this._mixed;
    } //-- ch.form105.shuttle.base.generated.tournament.Mixed getMixed() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return String
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'womendouble'.
     * 
     * @return Womendouble
     * @return the value of field 'womendouble'.
     */
    public ch.form105.shuttle.base.generated.tournament.Womendouble getWomendouble()
    {
        return this._womendouble;
    } //-- ch.form105.shuttle.base.generated.tournament.Womendouble getWomendouble() 

    /**
     * Returns the value of field 'womensingle'.
     * 
     * @return Womensingle
     * @return the value of field 'womensingle'.
     */
    public ch.form105.shuttle.base.generated.tournament.Womensingle getWomensingle()
    {
        return this._womensingle;
    } //-- ch.form105.shuttle.base.generated.tournament.Womensingle getWomensingle() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method notifyPropertyChangeListeners
     * 
     * Notifies all registered PropertyChangeListeners when a bound
     * property's value changes.
     * 
     * @param fieldName the name of the property that has changed.
     * @param newValue the new value of the property.
     * @param oldValue the old value of the property.
     */
    protected void notifyPropertyChangeListeners(java.lang.String fieldName, java.lang.Object oldValue, java.lang.Object newValue)
    {
        if (propertyChangeSupport == null) return;
        propertyChangeSupport.firePropertyChange(fieldName,oldValue,newValue);
    } //-- void notifyPropertyChangeListeners(java.lang.String, java.lang.Object, java.lang.Object) 

    /**
     * Method removePropertyChangeListener
     * 
     * Removes the given PropertyChangeListener from this classes
     * list of ProperyChangeListeners.
     * 
     * @param pcl The PropertyChangeListener to remove.
     * @return boolean
     */
    public boolean removePropertyChangeListener(java.beans.PropertyChangeListener pcl)
    {
        if (propertyChangeSupport == null) return false;
        propertyChangeSupport.removePropertyChangeListener(pcl);
        return true;
    } //-- boolean removePropertyChangeListener(java.beans.PropertyChangeListener) 

    /**
     * Sets the value of field 'icon'.
     * 
     * @param icon the value of field 'icon'.
     */
    public void setIcon(java.lang.String icon)
    {
        java.lang.Object oldIcon = this._icon;
        this._icon = icon;
        notifyPropertyChangeListeners("_icon", oldIcon, this._icon);
    } //-- void setIcon(java.lang.String) 

    /**
     * Sets the value of field 'mendouble'.
     * 
     * @param mendouble the value of field 'mendouble'.
     */
    public void setMendouble(ch.form105.shuttle.base.generated.tournament.Mendouble mendouble)
    {
        java.lang.Object oldMendouble = this._mendouble;
        this._mendouble = mendouble;
        notifyPropertyChangeListeners("_mendouble", oldMendouble, this._mendouble);
    } //-- void setMendouble(ch.form105.shuttle.base.generated.tournament.Mendouble) 

    /**
     * Sets the value of field 'mensingle'.
     * 
     * @param mensingle the value of field 'mensingle'.
     */
    public void setMensingle(ch.form105.shuttle.base.generated.tournament.Mensingle mensingle)
    {
        java.lang.Object oldMensingle = this._mensingle;
        this._mensingle = mensingle;
        notifyPropertyChangeListeners("_mensingle", oldMensingle, this._mensingle);
    } //-- void setMensingle(ch.form105.shuttle.base.generated.tournament.Mensingle) 

    /**
     * Sets the value of field 'mixed'.
     * 
     * @param mixed the value of field 'mixed'.
     */
    public void setMixed(ch.form105.shuttle.base.generated.tournament.Mixed mixed)
    {
        java.lang.Object oldMixed = this._mixed;
        this._mixed = mixed;
        notifyPropertyChangeListeners("_mixed", oldMixed, this._mixed);
    } //-- void setMixed(ch.form105.shuttle.base.generated.tournament.Mixed) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        java.lang.Object oldName = this._name;
        this._name = name;
        notifyPropertyChangeListeners("_name", oldName, this._name);
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'womendouble'.
     * 
     * @param womendouble the value of field 'womendouble'.
     */
    public void setWomendouble(ch.form105.shuttle.base.generated.tournament.Womendouble womendouble)
    {
        java.lang.Object oldWomendouble = this._womendouble;
        this._womendouble = womendouble;
        notifyPropertyChangeListeners("_womendouble", oldWomendouble, this._womendouble);
    } //-- void setWomendouble(ch.form105.shuttle.base.generated.tournament.Womendouble) 

    /**
     * Sets the value of field 'womensingle'.
     * 
     * @param womensingle the value of field 'womensingle'.
     */
    public void setWomensingle(ch.form105.shuttle.base.generated.tournament.Womensingle womensingle)
    {
        java.lang.Object oldWomensingle = this._womensingle;
        this._womensingle = womensingle;
        notifyPropertyChangeListeners("_womensingle", oldWomensingle, this._womensingle);
    } //-- void setWomensingle(ch.form105.shuttle.base.generated.tournament.Womensingle) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Tournament
     */
    public static ch.form105.shuttle.base.generated.tournament.Tournament unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (ch.form105.shuttle.base.generated.tournament.Tournament) Unmarshaller.unmarshal(ch.form105.shuttle.base.generated.tournament.Tournament.class, reader);
    } //-- ch.form105.shuttle.base.generated.tournament.Tournament unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
