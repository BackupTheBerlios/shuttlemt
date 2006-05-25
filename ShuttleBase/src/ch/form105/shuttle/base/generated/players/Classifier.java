/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Classifier.java,v 1.4 2006/05/25 22:45:26 luschtiger Exp $
 */

package ch.form105.shuttle.base.generated.players;

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
 * Class Classifier.
 * 
 * @version $Revision: 1.4 $ $Date: 2006/05/25 22:45:26 $
 */
public class Classifier extends ch.form105.shuttle.base.Element 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _single
     */
    private int _single;

    /**
     * keeps track of state for field: _single
     */
    private boolean _has_single;

    /**
     * Field _double
     */
    private int _double;

    /**
     * keeps track of state for field: _double
     */
    private boolean _has_double;

    /**
     * Field _mixed
     */
    private int _mixed;

    /**
     * keeps track of state for field: _mixed
     */
    private boolean _has_mixed;

    /**
     * Field propertyChangeSupport
     */
    private java.beans.PropertyChangeSupport propertyChangeSupport;


      //----------------/
     //- Constructors -/
    //----------------/

    public Classifier() 
     {
        super();
    } //-- ch.form105.shuttle.base.generated.players.Classifier()


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
     * Method deleteDouble
     * 
     */
    public void deleteDouble()
    {
        this._has_double= false;
        notifyPropertyChangeListeners("_double", new java.lang.Integer(this._double), null);
    } //-- void deleteDouble() 

    /**
     * Method deleteMixed
     * 
     */
    public void deleteMixed()
    {
        this._has_mixed= false;
        notifyPropertyChangeListeners("_mixed", new java.lang.Integer(this._mixed), null);
    } //-- void deleteMixed() 

    /**
     * Method deleteSingle
     * 
     */
    public void deleteSingle()
    {
        this._has_single= false;
        notifyPropertyChangeListeners("_single", new java.lang.Integer(this._single), null);
    } //-- void deleteSingle() 

    /**
     * Returns the value of field 'double'.
     * 
     * @return int
     * @return the value of field 'double'.
     */
    public int getDouble()
    {
        return this._double;
    } //-- int getDouble() 

    /**
     * Returns the value of field 'mixed'.
     * 
     * @return int
     * @return the value of field 'mixed'.
     */
    public int getMixed()
    {
        return this._mixed;
    } //-- int getMixed() 

    /**
     * Returns the value of field 'single'.
     * 
     * @return int
     * @return the value of field 'single'.
     */
    public int getSingle()
    {
        return this._single;
    } //-- int getSingle() 

    /**
     * Method hasDouble
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDouble()
    {
        return this._has_double;
    } //-- boolean hasDouble() 

    /**
     * Method hasMixed
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMixed()
    {
        return this._has_mixed;
    } //-- boolean hasMixed() 

    /**
     * Method hasSingle
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSingle()
    {
        return this._has_single;
    } //-- boolean hasSingle() 

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
     * Sets the value of field 'double'.
     * 
     * @param _double
     * @param double the value of field 'double'.
     */
    public void setDouble(int _double)
    {
        java.lang.Object oldDouble = new java.lang.Integer(this._double);
        this._double = _double;
        this._has_double = true;
        notifyPropertyChangeListeners("_double", oldDouble, new java.lang.Integer(this._double));
    } //-- void setDouble(int) 

    /**
     * Sets the value of field 'mixed'.
     * 
     * @param mixed the value of field 'mixed'.
     */
    public void setMixed(int mixed)
    {
        java.lang.Object oldMixed = new java.lang.Integer(this._mixed);
        this._mixed = mixed;
        this._has_mixed = true;
        notifyPropertyChangeListeners("_mixed", oldMixed, new java.lang.Integer(this._mixed));
    } //-- void setMixed(int) 

    /**
     * Sets the value of field 'single'.
     * 
     * @param single the value of field 'single'.
     */
    public void setSingle(int single)
    {
        java.lang.Object oldSingle = new java.lang.Integer(this._single);
        this._single = single;
        this._has_single = true;
        notifyPropertyChangeListeners("_single", oldSingle, new java.lang.Integer(this._single));
    } //-- void setSingle(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Classifier
     */
    public static ch.form105.shuttle.base.generated.players.Classifier unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (ch.form105.shuttle.base.generated.players.Classifier) Unmarshaller.unmarshal(ch.form105.shuttle.base.generated.players.Classifier.class, reader);
    } //-- ch.form105.shuttle.base.generated.players.Classifier unmarshal(java.io.Reader) 

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
